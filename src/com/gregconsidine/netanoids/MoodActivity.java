package com.gregconsidine.netanoids;

import java.util.Random;

//TODO: timed mood change

public class MoodActivity {

  private Random random;
  private String[] moods;
  private String mood;
  private long interval;
  
  public MoodActivity() {
    this.moods = new String[] {"playful", "depressed", "apathetic"};
    this.random = new Random();
    
    this.setMood();
    this.setInterval();
  }
  
  private void setMood() {
    int index = this.random.nextInt(this.moods.length);
    this.mood = this.moods[index];
  }

  private void setInterval() {
    this.interval = this.random.nextInt(60 * 10) + (60 * 5) * 1000; 
  }
  
  public long getInterval() {
    return this.interval;
  }
  
  public String getMood() {
    return this.mood;
  }
}
