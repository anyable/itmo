package character;
import utils.Action;

public abstract class Person extends BookCharacter {
  private final int age;
  private final Gender gender;

  protected Person(String name, Mood mood, Location location,
    Condition condition, int age, Gender gender) {
      super(name, mood, location, condition);
      this.age = age;
      this.gender = gender;
    }

  public int getAge() {
    return age;
  }
  public Gender getGender() {
    return gender;
  }

  @Override
  public abstract boolean canPerform(Action act);
  @Override
  public abstract void performAction(Action action);

}

enum Gender {
  MAN, WOMAN;
}