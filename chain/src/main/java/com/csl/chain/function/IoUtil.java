package com.csl.chain.function;

import cn.hutool.core.util.StrUtil;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author MaoLongLong
 */
public final class IoUtil {

    private IoUtil() {
    }

    /**
     * parse "[1, 2, 3]"
     */
    public static int[] parsePrettyArray(String input) {

        UnaryOperator<String> strip = s -> StrUtil.strip(s, "[", "]");
        Function<String, String[]> split = s -> StrUtil.split(s, ", ");
        Function<String[], int[]> convert = a -> Arrays.stream(a).mapToInt(Integer::valueOf).toArray();

        // chain
        Function<String, int[]> parser = strip.andThen(split).andThen(convert);

        return parser.apply(input);
    }
}
