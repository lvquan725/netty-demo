package io.netty.example.study.utils;

import java.util.concurrent.atomic.AtomicLong;

public final class IdUtils {

    private static final AtomicLong IDX = new AtomicLong();

    private IdUtils(){}

    public static long getId(){ return IDX.incrementAndGet();}

}
