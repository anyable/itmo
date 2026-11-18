package character;

final class Ghost extends BookCharacter {

  //какие-то характреистики
  private double distFromWindow;
  private double height;
  private boolean sound;
  private SoundType soundType;

  public enum SoundType {
    SAD, LOUD, QUIET, HAPPY;
  }

  public Ghost(String name, Mood mood, Location location,
    Condition condition) {
      super();
    }

  public void fly() {}
  public void scare(Person pers) {}
  public void makeSound() {}
  public void disappear() {} //исчезновение
  public void flip() {}


  @Override
  public boolean canPerform(Action action) {}

  @Override
  public void performAction(Action action) {}

  @Override
  public boolean equals(Object obj) {}

  @Override
  public int hashCode() {}

  @Override
  public String toString() {}
}