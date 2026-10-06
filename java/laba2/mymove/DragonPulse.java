package mymove;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class DragonPulse extends SpecialMove{

  public DragonPulse() {
    super(Type.DRAGON, 85, 100);
  }

  @Override protected String describe() {
    return "attack use Dragon Pulse";
  }
}
