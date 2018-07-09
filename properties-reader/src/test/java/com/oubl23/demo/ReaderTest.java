package com.oubl23.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReaderTest {
    @Test
    public void getConfigFromPathTest() {
        Reader reader = new Reader();
        String config = reader.getConfigFromPath("d:/configTest.properties", "config", "UTF-8");
        assertEquals("properties config配置文件", config);
    }

    @Test
    public void getConfigFromClassPathTest() {
        Reader reader = new Reader();
        String config = reader.getConfigFromClassPath("com/oubl23/demo/configTest.properties", "config", "UTF-8");
        assertEquals(config, "properties config配置文件");
    }
}
