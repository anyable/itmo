package structureGame;

import java.util.ArrayList;
import character.BookCharacter;

public final class GameWorld {
  //текущее состояние мира
  private ArrayList< BookCharacter > characters; //список персонажей
  private GameClock dayTime; //текущее время

  public GameWorld(GameClock clock) {
    this.characters = new ArrayList<>();
    this.dayTime = clock;
    //инициализация персонажей через addCharacter()
  }

  public void addCharacter(BookCharacter character) {
    characters.add(character);
  } //добавление персонажа

}