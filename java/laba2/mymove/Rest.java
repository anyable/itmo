package mymove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
//5 уровень
public final class Rest extends StatusMove {

  public Rest() {
    super();
  }

  @Override protected void applySelfEffects(Pokemon p) {
    p.restore();
    Effect.sleep(p);
  }

  @Override protected String describe() {
    return "fell asleep";
  }

}
