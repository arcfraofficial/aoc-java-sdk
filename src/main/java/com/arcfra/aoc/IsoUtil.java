package com.arcfra.aoc;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;

public class IsoUtil {
    public static final int SECTOR_SIZE = 2 * 1024;
    public static final int SYSTEM_AREA = 16 * SECTOR_SIZE;

    public static String getSvtIsoVersion(File file) throws FileNotFoundException, IOException {
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            raf.seek(SYSTEM_AREA + 190);
            byte[] bytes = new byte[128];
            raf.read(bytes, 0, 128);
            return new String(bytes).trim();
        }
    }

    public static String getSvtIsoVersion(Path path) throws FileNotFoundException, IOException {
        return getSvtIsoVersion(path.toFile());
    }

    public static String getSvtIsoVersion(String path) throws FileNotFoundException, IOException {
        return getSvtIsoVersion(new File(path));
    }
}
