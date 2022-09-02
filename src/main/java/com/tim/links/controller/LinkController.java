package com.tim.links.controller;

import com.tim.links.service.LinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkController {

    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("add/{fullLink}")
    public String add(@PathVariable String fullLink) {
        return linkService.add(fullLink);
    }

    @GetMapping("get/{shortLink}")
    public String get(@PathVariable String shortLink) {
        return linkService.get(shortLink);
    }
}
