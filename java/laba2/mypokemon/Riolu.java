package mypokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymove.LowSweep;
import mymove.Bulldoze;
import mymove.SwordsDance;

public class Riolu extends Pokemon {

  public Riolu(String name, int level)
  {
    super(name, level);
    this.setStats(40, 70, 40, 35, 40, 60);
    this.setType(Type.FIGHTING);
    this.setMove(new LowSweep(), new Bulldoze(), new SwordsDance());
  }
}
