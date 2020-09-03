/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.webrtc.kite.stats;


import javax.json.Json;
import javax.json.JsonObjectBuilder;
import java.util.Map;

/**
 * RTCMediaStreamTrackStats, with attributes trackIdentifier, remoteSource,
 * ended, detached, frameWidth, frameHeight, framesPerSecond, framesSent, framesReceived,
 * framesDecoded, framesDropped, framesCorrupted, audioLevel
 */
public class RTCMediaStreamTrackStats extends RTCSingleStatObject {
  private final String audioLevel;
  private final String detached;
  private final String ended;
  private final String frameHeight;
  private final String frameWidth;
  private final String framesCorrupted;
  private final String framesDecoded;
  private final String framesDropped;
  private final String framesPerSecond;
  private final String framesReceived;
  private final String framesSent;
  private final String remoteSource;

  private final String trackIdentifier;

  public RTCMediaStreamTrackStats(Map statObject) {
    this.setId(getStatByName(statObject, "id"));
    this.trackIdentifier = getStatByName(statObject, "trackIdentifier");
    this.remoteSource = getStatByName(statObject, "remoteSource");
    this.ended = getStatByName(statObject, "ended");
    this.detached = getStatByName(statObject, "detached");
    this.frameWidth = getStatByName(statObject, "frameWidth");
    this.frameHeight = getStatByName(statObject, "frameHeight");
    this.framesPerSecond = getStatByName(statObject, "framesPerSecond");
    this.framesSent = getStatByName(statObject, "framesSent");
    this.framesReceived = getStatByName(statObject, "framesReceived");
    this.framesDecoded = getStatByName(statObject, "framesDecoded");
    this.framesDropped = getStatByName(statObject, "framesDropped");
    this.framesCorrupted = getStatByName(statObject, "framesCorrupted");
    this.audioLevel = getStatByName(statObject, "audioLevel");
    this.timestamp = getStatByName(statObject, "timestamp");
  }
  
  public Double getAudioLevel() {
    return parseDouble(audioLevel);
  }
  
  public String getDetached() {
    return detached;
  }
  
  public String getEnded() {
    return ended;
  }
  
  public double getFrameHeight() {
    return parseDouble(frameHeight);
  }
  
  public double getFrameWidth() {
    return parseDouble(frameWidth);
  }
  
  public double getFramesCorrupted() {
    return parseDouble(framesCorrupted);
  }
  
  public double getFramesDecoded() {
    return parseDouble(framesDecoded);
  }
  
  public double getFramesDropped() {
    return parseDouble(framesDropped);
  }
  
  public double getFramesPerSecond() {
    return parseDouble(framesPerSecond);
  }
  
  public double getFramesReceived() {
    return parseDouble(framesReceived);
  }
  
  public double getFramesSent() {
    return parseDouble(framesSent);
  }
  
  public String getRemoteSource() {
    return remoteSource;
  }
  
  public String getTrackIdentifier() {
    return trackIdentifier;
  }
  
  public boolean isAudio() {
    return !this.audioLevel.equals("NA");
  }
  
  @Override
  public JsonObjectBuilder getJsonObjectBuilder() {
    return Json.createObjectBuilder()
      .add("trackIdentifier", this.trackIdentifier)
      .add("remoteSource", this.remoteSource)
      .add("ended", this.ended)
      .add("detached", this.detached)
      .add("frameWidth", this.frameWidth)
      .add("frameHeight", this.frameHeight)
      .add("framesPerSecond", this.framesPerSecond)
      .add("framesSent", this.framesSent)
      .add("framesReceived", this.framesReceived)
      .add("frameHeight", this.frameHeight)
      .add("framesDecoded", this.framesDecoded)
      .add("framesDropped", this.framesDropped)
      .add("framesCorrupted", this.framesCorrupted)
      .add("audioLevel", this.audioLevel)
      .add("timestamp", this.timestamp);
  }
}
