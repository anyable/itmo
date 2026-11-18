package utils;


//проверка на доступность действия и выполнение самого действия
//контракт для BookCharacter то есть персонажей
public interface Actionable {
  boolean canPerform(Action action);
  void performAction(Action action) throws InvalidActionException;
}