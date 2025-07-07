package com.shahin.lld.structuraldesignpattern.proxydesignpattern.anotherexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
public class VideoController {

    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/play/{id}")
    public String playVideo(@PathVariable String id) {
        videoService.playVideo(id);
        return "Video played: " + id;
    }
}
