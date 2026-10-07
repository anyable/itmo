package mymove;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;

public final class Thunder extends SpecialMove {
  public Thunder() {
    super(Type.ELECTRIC, 110, 70);
  }

  @Override protected void applyOppEffects(Pokemon p) {
    if (Math.random() < 0.3) {
      Effect.paralyze(p);
    }
  }

  @Override protected String describe() {
    return "attack uses Thunder";
  }
}
