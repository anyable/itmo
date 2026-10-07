package mymove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public final class Nuzzle extends PhysicalMove {

  public Nuzzle() {
    super(Type.ELECTRIC, 20, 100);
  }

  @Override protected void applyOppEffects(Pokemon p) {
    Effect.paralyze(p);
  }

  @Override protected String describe() {
    return "attack use Nuzzle";
  }
}
