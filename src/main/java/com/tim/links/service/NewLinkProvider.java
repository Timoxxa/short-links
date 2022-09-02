package com.tim.links.service;

import org.springframework.stereotype.Service;

@Service
public class NewLinkProvider {

    private final LinkGenerator linkGenerator;
    private final LinkStorage linkStorage;

    public NewLinkProvider(LinkGenerator linkGenerator, LinkStorage linkStorage) {
        this.linkGenerator = linkGenerator;
        this.linkStorage = linkStorage;
    }

    public String getNew() {
        String generated;
        do {
            generated = linkGenerator.generate();
        } while (linkStorage.existsShort(generated));
        return generated;
    }
}
