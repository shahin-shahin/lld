package com.shahin.lld.structuraldesignpattern.proxydesignpattern;

public class VideoServiceProxy implements VideoService {
    private RealVideoService realVideoService;
    private final String userRole;

    public VideoServiceProxy(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void playVideo(String filename) {
        if ("ADMIN".equals(userRole)) {
            if (realVideoService == null) {
                realVideoService = new RealVideoService(); // Lazy load
            }
            realVideoService.playVideo(filename);
        } else {
            System.out.println("Access Denied: Only ADMIN can play videos.");
        }
    }
}
