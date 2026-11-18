package character;
import utils.Action;
import utils.InvalidActionException;

public final class Baby extends Person {

  //обычный малыш
  public Baby() {
    super("Malsh", Mood.HAPPY, Location.HOUSE, Condition.ACTIVE ,8, Gender.MAN);
  }

  public Baby(String name, Mood mood, Location location,
    Condition condition, int age, Gender gender) {
      super(name, mood, location, condition, age, gender);
      validAction.add(Action.MOVE);
      validAction.add(Action.SPEAK);
      validAction.add(Action.SLEEP);
      validAction.add(Action.HIDE);
    }

  @Override
  public boolean canPerform(Action action) {
    for (Action tmpAct : validAction) {
      if (action.equals(tmpAct)) {
        return true;
      }
    }
    return false;
  }

  @Override //исполнение действия
  public void performAction(Action action) throws InvalidActionException {

  }

  @Override
  public boolean equals(Object obj) {

    //одинаковость
    if (this == obj) {
      return true;
    }

    //тип
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Baby tmp = (Baby) obj;
    return name.equals(tmp.getName())
     && age == tmp.getAge()
     && gender == tmp.getGender();

  }

  @Override
  public int hashCode() {
    return java.util
  }

  @Override
  public String toString() {
    return "Baby{" +
    "name='" + name + '\'' +
    ", mood=" + mood +
    ", location=" + location +
    ", condition=" + condition +
    ", age=" + age +
    ", gender=" + gender +
    '}';
  }

}