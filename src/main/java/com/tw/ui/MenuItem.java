package com.tw.ui;

import java.util.ArrayList;
import java.util.List;

class MenuItem<T> {
    private final T data;

    private final List<MenuItem<T>> children = new ArrayList<>();

    private MenuItem<T> parent = null;

    MenuItem(T data) {
        this.data = data;
    }

    MenuItem<T> addChild(MenuItem<T> child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    List<MenuItem<T>> getChildren() {
        return children;
    }

    T getData() {
        return data;
    }

    private void setParent(MenuItem<T> parent) {
        this.parent = parent;
    }

    MenuItem<T> getParent() {
        return parent;
    }
}
