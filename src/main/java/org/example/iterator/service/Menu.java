package org.example.iterator.service;

import org.example.iterator.model.MenuItem;
import java.util.Iterator;

public interface Menu {

    Iterator<MenuItem> createIterator();
}