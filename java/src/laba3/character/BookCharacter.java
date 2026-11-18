package character;
import utils.*;
import java.util.ArrayList;


public abstract class BookCharacter implements Actionable{
  private final String name;
  private Mood mood;
  private Location location;
  private Condition condition;
  protected ArrayList< Action > validAction; //protected???

  protected BookCharacter(String name, Mood mood, Location location,
    Condition condition) {
      this.name = name;
      this.mood = mood;
      this.location = location;
      this.condition = condition;
      //validAction() инициализация у каждого наследника
    }
  //геттеры
  public String getName() {
    return name;
  }
  public Mood getMood() {
    return mood;
  }
  public Location getLocation() {
    return location;
  }
  public Condition getCondition() {
    return condition;
  }

  @Override
  public abstract boolean canPerform(Action act);
  @Override
  public abstract void performAction(Action action);

  //есть контракт на реализацию интерфейса
  //  но у каждого наследника оно свое
  @Override
  public abstract boolean equals(Object obj);

  @Override
  public abstract int hashCode();

  @Override
  public abstract String toString();
}

enum Mood {
  HAPPY, SCARED, CALM, ANGRY, SAD, SURPRISED
}

enum Location {
  HOUSE, KITCHEN, BEDROOM, OUTSIDE, ROOF
}

enum Condition {
  ACTIVE, SLEEPING, HIDING,
  DISAPPERED, WATCHING
}

