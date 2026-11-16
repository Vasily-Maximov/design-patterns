package org.example.facade.service;

public interface StreamingPlayer {

    void on();
    void off();
    void stop();
    void play(String movie);
}