package org.example.iterator.service;

import org.example.iterator.model.MenuItem;

public interface Iterator {

    boolean hasNext();
    MenuItem next();

}