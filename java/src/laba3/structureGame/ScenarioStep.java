package structureGame;
import character.*;
import utils.*;


//запись одного события (шага)
public record ScenarioStep(BookCharacter actor, Action act, BookCharacter target, int duration) {
  //конструктор
  //проверка корректности параметров
  public ScenarioStep {
    if (actor.equals(target)) {
      throw new IllegalArgumentException("Character do not do action for him\n");
    }


    if (duration > 24 || duration < 0 || actor == null || act == null) {
      throw new IllegalArgumentException("Not correct time action\n");
    }

  }

  public static ScenarioStep create(
    BookCharacter actor, Action act, BookCharacter target, int time) throws InvalidActionException {

      actor.canPerform(act); //если некоррект, то проброс искл выше по стеку

      return new ScenarioStep(actor, act, target, time); //или просто создаем шаг
  }

}