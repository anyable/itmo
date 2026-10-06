package mymove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;

public final class Swagger extends StatusMove {

  public Swagger() {
    super();
  }

  @Override protected void applyOppEffects(Pokemon p) {
    Effect.confuse(p);
    p.setMod(Stat.ATTACK, 2);
  }

  @Override protected String describe() {
    return "attack use Swagger";
  }
}
