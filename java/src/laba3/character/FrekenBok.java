package character;

public final class FrekenBok extends Person {
  public FrekenBok() {
    super("Fraken Bok", Mood.HAPPY, Location.HOUSE, Condition.ACTIVE ,54, Gender.WOMAN);
  } //просто дефолтная

  public FrekenBok(String name, Mood mood, Location location,
    Condition condition, int age, Gender gender) {
      super(name, mood, location, condition, age, gender);
    }

  @Override
  public boolean canPerform(Action action) {
    boolean result;
    return result;
  }

  @Override
  public void performAction(Action action) {}

  @Override
  public boolean equals(Object obj) {}

  @Override
  public int hashCode() {}

  @Override
  public String toString() {}


}