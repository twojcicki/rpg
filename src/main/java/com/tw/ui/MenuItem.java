package com.tw.ui;

import java.util.ArrayList;
import java.util.List;

public class MenuItem<T> {
    private T data = null;

    private List<MenuItem<T>> children = new ArrayList<>();

    private MenuItem<T> parent = null;

    public MenuItem(T data) {
        this.data = data;
    }

    public MenuItem<T> addChild(MenuItem<T> child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public List<MenuItem<T>> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(MenuItem<T> parent) {
        this.parent = parent;
    }

    public MenuItem<T> getParent() {
        return parent;
    }
}
