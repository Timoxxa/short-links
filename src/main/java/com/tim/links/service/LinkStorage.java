package com.tim.links.service;

public interface LinkStorage {

    void put(String shortLink, String fullLink);

    String getFull(String shortLink);

    boolean existsShort(String shortLink);
}
