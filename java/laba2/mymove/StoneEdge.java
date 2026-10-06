package mymove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class StoneEdge extends PhysicalMove {

  public StoneEdge() {
    super(Type.ROCK, 100, 80);
  }

  @Override protected String describe() {
    return "attack use Stone Edge";
  }

}
