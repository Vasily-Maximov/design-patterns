package org.example.command.model;

public class Stereo {

    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.printf("%s stereo is on\n", name);
    }

    public void off() {
        System.out.printf("%s stereo is off\n", name);
    }

    public void setCd() {
        System.out.printf("%s stereo insert CD\n", name);
    }

    public void setDvd() {
        System.out.printf("%s stereo insert CD\n", name);
    }

    public void setRadio() {
        System.out.printf("%s stereo insert radio\n", name);
    }

    public void setVolume(int volume) {
        System.out.printf("%s stereo set value = %d\n", name, volume);
    }
}