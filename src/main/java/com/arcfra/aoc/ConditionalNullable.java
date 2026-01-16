package com.arcfra.aoc;


import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConditionalNullable {
    public static class ConditionalNullablePojo {
        protected Set<String> _isPresent_ = new HashSet<String>();
    }

    public static class ConditionalNullablePojoAdapterFactory implements TypeAdapterFactory {
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            Class<? super T> rawType = type.getRawType();
            if (!ConditionalNullablePojo.class.isAssignableFrom(rawType)) {
                return null;
            }
            Map<String, Field> jsonField = new HashMap<>();
            Field[] fields = rawType.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                if (field.isAnnotationPresent(SerializedName.class)) {
                    jsonField.put(field.getAnnotation(SerializedName.class).value(), field);
                }
            }
            return new TypeAdapter<T>() {
                @Override
                public void write(JsonWriter out, T value) throws java.io.IOException {
                    if (value == null) {
                        out.nullValue();
                        return;
                    }
                    out.beginObject();
                    ConditionalNullablePojo pojo = (ConditionalNullablePojo) value;
                    for (Map.Entry<String, Field> entry : jsonField.entrySet()) {
                        String fieldName = entry.getKey();
                        Field field = entry.getValue();
                        // get the value of the field
                        Object fieldValue;
                        try {
                            // mostly the field is private, so we need to make it accessible
                            if (!field.isAccessible()) {
                                field.setAccessible(true);
                            }
                            fieldValue = field.get(value);
                        } catch (IllegalArgumentException | IllegalAccessException e) {
                            fieldValue = null;
                        }
                        if (fieldValue == null) {
                            if (pojo._isPresent_.contains(fieldName)) {
                                out.name(fieldName);
                                if (!out.getSerializeNulls()) {
                                    out.setSerializeNulls(true);
                                    out.nullValue();
                                    out.setSerializeNulls(false);
                                } else {
                                    out.nullValue();
                                }
                            }
                        } else {
                            // write the non null field with native adapter
                            out.name(fieldName);
                            @SuppressWarnings("unchecked")
                            TypeAdapter<Object> delegatedAdapter =
                                    (TypeAdapter<Object>) gson.getAdapter(field.getType());
                            if (delegatedAdapter != null && fieldValue != null) {
                                delegatedAdapter.write(out, fieldValue);
                            }
                        }
                    }
                    out.endObject();
                }

                public T read(JsonReader in) throws java.io.IOException {
                    TypeAdapter<T> adatper =
                            gson.getDelegateAdapter(
                                    ConditionalNullablePojoAdapterFactory.this, type);
                    T instance = adatper.read(in);
                    return instance;
                }
            };
        }
    }
}
