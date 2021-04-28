package com.csl.visitor.nio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author MaoLongLong
 * @date 2021-04-28 20:08
 */
@Slf4j
public class NioFileVisitor {

    private static final String JAVA_EXT = ".java";

    public static void main(String[] args) throws IOException {

        final AtomicInteger count = new AtomicInteger(0);

        Files.walkFileTree(Paths.get(""), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                if (file.toString().endsWith(JAVA_EXT)) {
                    count.incrementAndGet();
                }
                return FileVisitResult.CONTINUE;
            }
        });

        LOGGER.info("当前工程下有 {} 个 java 文件", count);
    }
}
