package com.csl.factory.function;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author MaoLongLong
 */
public final class ProductFactory {

    private static final Map<String, Supplier<Product>> FACTORY = new HashMap<>();

    static {
        FACTORY.put("loan", Loan::new);
        FACTORY.put("stock", Stock::new);
        FACTORY.put("bond", Bond::new);
    }

    private ProductFactory() {
    }

    public static Product createProduct(String name) {
        Supplier<Product> supplier = Optional.ofNullable(FACTORY.get(name))
            .orElseThrow(() -> new IllegalArgumentException("No such product " + name));
        return supplier.get();
    }
}
