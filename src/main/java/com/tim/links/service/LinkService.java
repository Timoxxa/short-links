package com.tim.links.service;

import org.springframework.stereotype.Service;

@Service
public class LinkService {

    private final LinkStorage storage;
    private final NewLinkProvider newLinkProvider;

    public LinkService(LinkStorage storage, NewLinkProvider newLinkProvider) {
        this.storage = storage;
        this.newLinkProvider = newLinkProvider;
    }

    public String add(String fullLink) {
        String shortLink = newLinkProvider.getNew();
        storage.put(shortLink, fullLink);
        return shortLink;
    }

    public String get(String shortLink) {
        return storage.getFull(shortLink);
    }
}
