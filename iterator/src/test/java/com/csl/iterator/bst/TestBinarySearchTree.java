package com.csl.iterator.bst;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author MaoLongLong
 */
@Slf4j
class TestBinarySearchTree {

    @Test
    void testBST() {
        assertDoesNotThrow(() -> {
            BinarySearchTree<Integer> bst = new BinarySearchTree<>();
            bst.insert(3);
            bst.insert(5);
            bst.insert(1);
            bst.insert(4);
            bst.insert(2);
            for (int val : bst) {
                LOGGER.info("bst val: {}", val);
            }
        });
    }
}
