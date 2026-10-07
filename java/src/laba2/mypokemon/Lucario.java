package mypokemon;

import mymove.DragonPulse;
import ru.ifmo.se.pokemon.Type;

public final class Lucario extends Riolu {

  public Lucario(String name, int level) {
    super(name, level);
    this.setStats(70, 110, 70, 115, 70, 90);
    this.addType(Type.STEEL);
    this.addMove(new DragonPulse());
  }
}
//38