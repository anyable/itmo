//вариант 676748

/*
Однако фрекен Бок не слушала Малыша. Ее обезумевший взгляд был прикован к окну -- она
следила за причудливым полетом привидения.
Но маленькое привидение из Вазастана нельзя было убрать. Оно кружило в ночи, удалялось,
вновь приближалось, то взмывая ввысь, то спускаясь пониже, и время от времени делало в воздухе небольшой кульбит.
А печальные звуки не смолкали ни на мгновение.
*/



/*
методы - изменение объекта, выводимый текст является побочным эффектом
отражающим эти изменения

соблюдение: инкапсуляции, наследования, полиморфизма, solid
элементы случайных исходных состояний

что должнго быть:
      абстрактный класс с как минимум одним абстрактным методом
интерфейс
      enum()
      record()
массив или ArrayList для хранения однотипных объектов
провеяремые исключения

у каждого персонажа/предмета переопределить:
equals(), hashCode() и toString()
Для классов-исключений необходимо переопределить метод getMessage()

Созданные в программе классы-исключения должны быть использованы и
обработаны. Кроме того, должно быть использовано и обработано хотя
бы одно
unchecked исключение (можно свое, можно из стандартной библиотеки)



ВОПРОСЫ:
Принципы объектно-ориентированного программирования SOLID и STUPID.
Класс Object. Реализация его методов по умолчанию.
Простое и множественное наследование. Особенности реализации наследования в Java.
Понятие абстрактного класса. Модификатор abstract.
Понятие интерфейса. Реализация интерфейсов в Java. Отличие интерфейсов от абстрактных классов.
Модификаторы default, static и private для методов интерфейса.
Перечисляемый тип данных (enum) в Java. Особенности реализации и использования.
Тип запись (record) в Java. Особенности использования.
Методы и поля с модификаторами static и final.
Перегрузка и переопределение методов.
Обработка исключительных ситуаций, три типа исключений.
Стандартный массив и динамический массив (ArrayList). Основные различия.
Вложенные, локальные и анонимные классы.
*/

import java.util.ArrayList;

public class Main {

}

enum Mood {
  HAPPY, SCARED, CALM, ANGRY, SAD, SUPRISED;
}

enum Location {
  HOUSE, KITCHEN, BEDROOM, OUTSIDE, ROOF;
}

enum CharacterState {
  ACTIVE, SLEEPING, HIDING, WALK;
}

enum Action {
  MOVE { // как-то перестроить структуру так как для каждого свой способ передвижения

  }

  DISSAPEAR {

  }

  SLEEP {

  }

  HIDE {

  }

  FLY {

  }

  SCARE {

  }
}

abstract class Character {
  String name;
  Mood mood;
  Location loc; //
  CharacterState condition;
  ArrayList < Action > act;

  protected Character(String name, Mood mood,
    Location loc, CharacterState condition) {
    this.name = name;
    this.mood = mood;
    this.loc = loc;
    this.condition = condition;
  }

  //переместить перса, так как всех свои перемещения то вот так
  abstract void move();


  //геттеры
  String getName() {
    return name;
  }
  Location getLocation() {
    return loc;
  }
  Mood getMood() {
    return mood;
  }

  //работа с действиями
  boolean canAction(Action tmpAction, ArrayList< Action > arrAct) {
    for (int i = 0; i < act.size(); ++i) {
      if (arrAct.get(i).equals(tmpAction)) {
        return true;
      }
    }
    return false;
  }
}



abstract class Person extends Character {
  int age;
  String gender;

  Person(String name, Mood mood, Location loc,
    CharacterState condition, int age, String gender) {
    super(name, mood, loc, condition);
    this.age = age;
    this.gender = gender;
  }

}









