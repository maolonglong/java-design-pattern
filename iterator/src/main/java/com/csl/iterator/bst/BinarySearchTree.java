package com.csl.iterator.bst;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * @author MaoLongLong
 */
public class BinarySearchTree<T extends Comparable<T>> implements Iterable<T> {

    private TreeNode<T> root;

    public void insert(T val) {
        TreeNode<T> node = new TreeNode<>(val);
        if (root == null) {
            root = node;
            return;
        }
        TreeNode<T> parent = getParentNodeOfValueToBeInserted(val);
        if (parent.isGreaterThan(val)) {
            parent.left = node;
        } else {
            parent.right = node;
        }
    }

    private TreeNode<T> getParentNodeOfValueToBeInserted(T val) {
        TreeNode<T> parent = null;
        TreeNode<T> current = root;
        while (current != null) {
            parent = current;
            if (current.isGreaterThan(val)) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return parent;
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {

        private final Deque<TreeNode<T>> stack;
        private TreeNode<T> node;

        public Itr() {
            this.stack = new ArrayDeque<>();
            this.node = root;
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty() || node != null;
        }

        @Override
        public T next() {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            TreeNode<T> next = stack.pop();
            node = next.right;
            return next.val;
        }
    }

    static private class TreeNode<T extends Comparable<T>> {
        private final T val;
        private TreeNode<T> left;
        private TreeNode<T> right;

        private TreeNode(T val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        private boolean isGreaterThan(T val) {
            return this.val.compareTo(val) > 0;
        }
    }
}
