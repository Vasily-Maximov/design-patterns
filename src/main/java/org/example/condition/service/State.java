package org.example.condition.service;

import java.io.Serializable;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();

}