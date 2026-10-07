package main;

import mypokemon.*;
import ru.ifmo.se.pokemon.*;

public class Main {
  public static void main(String[] args) {

    Battle battle = new Battle();

    Lucario p1 = new Lucario("Misha", 38);
    Pichu p2 = new Pichu("Marina", 25);
    Pikachu p3 = new Pikachu("Gleb", 25);

    Raichu f1 = new Raichu("Jason", 25);
    Riolu f2 = new Riolu("Nastya", 35);
    Stunfisk f3 = new Stunfisk("Vadim", 1);

    battle.addAlly(p1);
    battle.addAlly(p2);
    battle.addAlly(p3);

    battle.addFoe(f1);
    battle.addFoe(f2);
    battle.addFoe(f3);

    battle.go();
  }
}

