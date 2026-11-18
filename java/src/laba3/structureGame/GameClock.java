package structureGame;

public final class GameClock {

  private int time; //время текущее
  //private DayPhase dayPhase; //текущая фаза

  public enum DayPhase {
    DAWN, DAY, SUNSET, NIGHT;
  }
  //начало дня
  public GameClock() {
    this.time = 0;
  } //можно создать сценарную ситуацию в любой промежуток времени

  //текущее время
  public int getCurrentTime() {
    return time;
  }

  //текущая фаза
  public GameClock.DayPhase getPhase() {
    if (time <= 9 * 60) {
      return DayPhase.DAWN;
    } else if (9 * 60 < time && time <= 18 * 60) {
      return DayPhase.DAY;
    } else if (18 * 60 < time && time <= 21 * 60) {
      return DayPhase.NIGHT;
    } else {
      return DayPhase.NIGHT;
    }
  }

  protected void advanceTime(int duration) {
    time += duration * 60;
  } //изменение времени


  protected boolean endDay() {
    return (time >= 24 * 60) ? true : false;
  }
}