package com.shahin.lld.structuraldesignpattern.proxydesignpattern;

public class RealVideoService implements VideoService{
    @Override
    public void playVideo(String filename) {
        System.out.println("Playing video: " + filename);
    }
}
