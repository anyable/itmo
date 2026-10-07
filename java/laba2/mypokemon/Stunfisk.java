package mypokemon;

import mymove.Facade;
import mymove.StoneEdge;
import mymove.Swagger;
import mymove.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Stunfisk extends Pokemon {

  //конструктор задает имя и уровень покемона
  public Stunfisk(String name, int level) {
    super(name, level);
    this.setStats(109, 66, 84, 81, 99, 32);
    this.setType(Type.GROUND, Type.ELECTRIC);
    this.setMove(new Facade(), new StoneEdge(), new Swagger(), new Thunder());
  }
}
//1