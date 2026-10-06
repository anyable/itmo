package mymove;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Thunderbolt extends SpecialMove {
  public Thunderbolt() {
    super(Type.ELECTRIC, 90, 100);
  }

  @Override protected String describe() {
    return "Thunderbolt deals damage and has a 10% chance of paralyzing the target";
  }
}
