package com.shahin.lld.structuraldesignpattern.proxydesignpattern;

public class Client {
    public static void main(String[] args) {
        VideoService adminService = new VideoServiceProxy("ADMIN");
        adminService.playVideo("funny_cats.mp4");

        VideoService guestService = new VideoServiceProxy("GUEST");
        guestService.playVideo("funny_dogs.mp4");
    }
}

