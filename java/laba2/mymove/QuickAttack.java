package mymove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class QuickAttack extends PhysicalMove{

  public QuickAttack() {
    super(Type.NORMAL, 40, 100, 1, 0);
  }

  @Override protected String describe() {
    return "attack use Quick Attack";
  }

}
