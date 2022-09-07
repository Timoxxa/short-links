package com.tim.links;

import com.tim.links.service.MemoryStorage;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemoryStorageTest {

    private final MemoryStorage memoryStorage = new MemoryStorage();

    @Test
    public void testMemoryStorage() {
        String short1 = "short1";
        String short2 = "short2";
        String full1 = "full1";

        assertFalse(memoryStorage.existsShort(short1));
        assertFalse(memoryStorage.existsShort(short2));
        assertNull(memoryStorage.getFull(short1));
        assertNull(memoryStorage.getFull(short2));

        memoryStorage.put(short1, full1);
        assertTrue(memoryStorage.existsShort(short1));
        assertFalse(memoryStorage.existsShort(short2));
        assertEquals(full1, memoryStorage.getFull(short1));
        assertNull(memoryStorage.getFull(short2));
    }
}
