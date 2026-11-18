package main;
import character.*;
import structureGame.*;
import utils.*;
//вариант 676748
/*
Однако фрекен Бок не слушала Малыша. Ее обезумевший взгляд был прикован к окну -- она
следила за причудливым полетом привидения.
Но маленькое привидение из Вазастана нельзя было убрать. Оно кружило в ночи, удалялось,
вновь приближалось, то взмывая ввысь, то спускаясь пониже, и время от времени делало в воздухе небольшой кульбит.
А печальные звуки не смолкали ни на мгновение.
*/

public class Main {
  public static void main(String argv[]) {

    GameClock time = new GameClock();
    GameWorld universe = new GameWorld(time);


    //создание персонажей
    Baby malsh = new Baby();
    FrekenBok fraken = new FrekenBok();

    //создание действия
    ScenarioStep st1 = new ScenarioStep(fraken, Action.SPEAK, malsh, 30);
    universe.addCharacter(malsh);
    universe.addCharacter(fraken);

    //создание сценария
    ScenarioPlayer sc = new ScenarioPlayer(universe);
    sc.addStep(st1);

    //запуск
    sc.play();
  }
}












