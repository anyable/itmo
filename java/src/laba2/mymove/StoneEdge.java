package mymove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
public final class StoneEdge extends PhysicalMove {

  public StoneEdge() {
    super(Type.ROCK, 100, 80);
  }

  @Override protected double calcCriticalHit(Pokemon att, Pokemon def) {
    double effSpeed = att.getStat(Stat.SPEED);
    double critChance = (effSpeed / 512.0) * 3.0;
    if (Math.random() < critChance) {
      return 2.0;
    } else {
      return 1.0;
    }
  }

  @Override protected String describe() {
    return "attack use Stone Edge";
  }

}
