import ru.ifmo.se.pokemon.*;
public final class Stunfisk extends Pokemon {

  //конструктор задает имя и уровень покемона
  public Stunfisk(String name, int level) {
    super(name, level);
    this.setStats(109.0, 66.0, 84.0, 81.0, 99.0, 32.0);
    this.setType(Type.GROUND, Type.ELECTRIC);

  }
}
