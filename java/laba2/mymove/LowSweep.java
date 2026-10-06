package mymove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class LowSweep extends PhysicalMove {

  public LowSweep() {
    super(Type.FIGHTING, 65, 100);
  }

  @Override protected void applyOppEffects(Pokemon p) {
    p.setMod(Stat.SPEED, -1);
  }

  @Override protected String describe() {
    return "attack use Low Sweep";
  }

}
