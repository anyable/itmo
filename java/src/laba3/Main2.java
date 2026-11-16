import java.util.ArrayList;

public class Main2 {
  //создание и запуск проигрывателя
  //тое есть ScenarioPlayer GameWorld GameClock

  /*
  создаю часы
  создаю мир
  создаю персонажей (их начальное состояние рандомное)
  добавляю персонажей в мир
  создаю проигрываель сценария
  инициализирую сценарий
  запуск воспроизведения */
}

enum Mood {
  HAPPY, SCARED, CALM, ANGRY, SAD, SURPRISED
}

enum Location {
  HOUSE, KITCHEN, BEDROOM, OUTSIDE, ROOF
}

enum Condition {
  ACTIVE, SLEEPING, HIDING,
  MOVING, FLYING
}

enum Gender {
  MAN, WOMAN;
}

enum Action {

  MOVE(3),
  SPEAK(1),

  FLY_AWAY(2),
  CHANGE_HEIGHT(1),
  CULBIT(1),

  MAKE_SOUND(5),
  SLEEP(5),
  HIDE(2),
  DISAPPEAR(1);

  private final int defaultDuration;

  Action(int defaultDuration) {
    this.defaultDuration = defaultDuration;
  }

  public int getDefaultDuration() {}
}

//проверка на доступность действия и выполнение самого действия
//контракт для Character то есть персонажей
interface Actionable {
  boolean canPerform(Action action);
  void performAction(Action action) throws InvalidActionException;
}

//какой-нибудь интерфейс с действиями дял всех персанажей
/* а в enum будет храниться продолжительность и мб именно категория
действия????? подумать  */

//ДОСТУПЫ
abstract class BookCharacter implements Actionable{
  private final String name;
  private Mood mood;
  private Location location;
  private Condition condition;
  private ArrayList< Action > validAction;

  protected BookCharacter(String name, Mood mood, Location location,
    Condition condition) {}
  //геттеры
  public String getName() {}
  public Mood getMood() {}
  public Location getLocation() {}
  public Condition getCondition() {}

  //подумать над тем кто будет управлять изменением состояния
  protected void setMood() {}
  protected void setLocation() {}
  protected void setCondition() {}

  //есть контракт на реализацию интерфейса
  //  но у каждого наследника оно свое
  @Override
  public abstract boolean equals(Object obj);

  @Override
  public abstract int hashCode();

  @Override
  public abstract String toString();
}

abstract class Person extends BookCharacter {
  private final int age;
  private final Gender gender;

  protected Person(String name, Mood mood, Location location,
    Condition condition, int age, Gender gender) {
      super();
    }

  public int getAge() {}
  public int getGender() {}

}

//подумать над реализацией как одна еденица
final class Baby extends Person {

  public Baby(String name, Mood mood, Location location,
    Condition condition, int age, Gender gender) {
      super();
    }

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

final class FrekenBok extends Person {
  public FrekenBok(String name, Mood mood, Location location,
    Condition condition, int age, Gender gender) {
      super();
    }

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


//методы с полетом или чет такое
final class Carlson extends Person {
  public Carlson(String name, Mood mood, Location location,
    Condition condition, int age, Gender gender) {
      super();
    }

  public void ignore(Person person) {}
  public void observe(BookCharacter character) {}

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

//действия Move, Hide, Sleep, Disappear
//canExecute(), avalidAction()

final class Ghost extends BookCharacter {

  //какие-то характреистики

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


final class GameClock {

  private static int time;
  private DayPhase dayPhase;
  public enum DayPhase {
    DAWN, DAY, SUNSET, NIGHT;
  }

  protected GameClock() {}

  public int getCurrentTime() {}
  public DayPhase gePhase() {}
  protected void advanceTime(int duration) {} //изменение времени
  protected void endDay() {} //какую-то согласованность или хз
}


final class GameWorld {
  //текущее состояние мира
  private ArrayList< Character > characters;
  private GameClock dayTime;

  public GameWorld(GameClock clock) {}

  public GameWorld createWorld() {}
  protected void addCharacter(BookCharacter character) {}
  protected void advanceTime(int duration) {}

}

//логика последовательности событий
//берет очередной шаг и пережает его в гейм ворлд, сам ничего исполняет
class ScenarioPlayer {
  GameWorld world;
  ArrayList< ScenarioStep > steps;

  public ScenarioPlayer(GameWorld world) {}

  //продумать логику
  public void play() {} //запуск сценария;
  protected void executeNextStep() {} //выполнение следующего события;
  protected void addStep(ScenarioStep step) {} //добавление события;
  protected void initializeScenario() {} //подготовка сценария;
  protected void generateRandomVariation() {} //выбор случайных вариаций;
  protected void isFinished() {} // проверка завершения сценария.
}

//запись одного события
record ScenarioStep(BookCharacter actor, Action act, int duration) {
  //конструктор
  //проверка корректности параметров
}

//исключения
class InvalidActionException extends Exception {
  private String characterName;
  private Action act;

  public InvalidActionException(String characterName, Action act) {}

  @Override
  public String getMessage() {}
}