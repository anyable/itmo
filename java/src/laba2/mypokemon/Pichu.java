package mypokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import mymove.Rest;
import mymove.Thunderbolt;

public class Pichu extends Pokemon {

  public Pichu(String name, int level) {
    super(name, level);
    this.setStats(20, 40, 15, 35, 35, 60);
    this.setType(Type.ELECTRIC);
    this.setMove(new Rest(), new Thunderbolt());
  }

}

//25