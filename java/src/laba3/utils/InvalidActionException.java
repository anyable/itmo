package utils;

public class InvalidActionException extends Exception {
  private String characterName;
  private Action act;

  public InvalidActionException(String characterName, Action act) {}

  @Override
  public String getMessage() {}
}