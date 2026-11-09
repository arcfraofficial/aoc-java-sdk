package com.arcfra.aoc;

final class ActivePassiveRequestTags {
    static final Bypass BYPASS = new Bypass();

    private ActivePassiveRequestTags() {}

    static final class Bypass {
        private Bypass() {}
    }
}
