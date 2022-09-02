package com.tim.links.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemoryStorage implements LinkStorage {

    private final Map<String, String> linksMap = new HashMap<>();

    @Override
    public void put(String shortLink, String fullLink) {
        linksMap.put(shortLink, fullLink);
    }

    @Override
    public String getFull(String shortLink) {
        return linksMap.get(shortLink);
    }

    @Override
    public boolean existsShort(String shortLink) {
        return linksMap.containsKey(shortLink);
    }
}
