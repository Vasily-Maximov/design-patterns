package org.example.iterator.service;

import org.example.iterator.model.MenuItem;

import java.util.List;

public class PancakeHouseIterator implements Iterator {

    private final List<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}