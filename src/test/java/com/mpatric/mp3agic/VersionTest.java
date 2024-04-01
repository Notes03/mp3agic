package com.mpatric.mp3agic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VersionTest {
  @Test
  public void returnsVersion() {
    assertEquals("UNKNOWN-SNAPSHOT", Version.getVersion());
  }

  @Test
  public void returnsUrl() {
    assertEquals("https://github.com/mpatric/mp3agic", Version.getUrl());
  }

  @Test
  public void returnsVersionAndUrlAsString() {
    assertEquals("UNKNOWN-SNAPSHOT - https://github.com/mpatric/mp3agic", Version.asString());
  }
}
