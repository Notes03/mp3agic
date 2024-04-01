package com.mpatric.mp3agic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ID3v2FrameSet {

  private final String id;
  private final ArrayList<ID3v2Frame> frames;

  public ID3v2FrameSet(String id) {
    this.id = id;
    frames = new ArrayList<>();
  }

  public String getId() {
    return id;
  }

  public void clear() {
    frames.clear();
  }

  public void addFrame(ID3v2Frame frame) {
    frames.add(frame);
  }

  public List<ID3v2Frame> getFrames() {
    return frames;
  }

  @Override
  public String toString() {
    return this.id + ": " + frames.size();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ID3v2FrameSet that = (ID3v2FrameSet) o;
    return Objects.equals(id, that.id) && Objects.equals(frames, that.frames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, frames);
  }
}
