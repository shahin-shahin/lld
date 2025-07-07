package com.shahin.lld.structuraldesignpattern.proxydesignpattern.anotherexample;

import org.springframework.stereotype.Service;

@Service
public class VideoService {

    public void playVideo(String videoId) {
        System.out.println("Playing video with ID: " + videoId);
        try {
            Thread.sleep(1000); // simulate processing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}