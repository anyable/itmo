package mymove;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class SwordsDance extends StatusMove {

  public SwordsDance() {
    super(Type.NORMAL, 0, 0);
  }

  @Override protected void applySelfEffects(Pokemon p) {
    p.setMod(Stat.ATTACK, 2);
  }

  @Override protected String describe() {
    return "upgrade his attack for 2 stages";
  }

}
