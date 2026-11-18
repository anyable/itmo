package structureGame;

import java.util.ArrayList;
import character.*;


//сценарий
public class ScenarioPlayer {
  private GameWorld world; //мир
  private ArrayList< ScenarioStep > steps; //массив последоват шагов

  public ScenarioPlayer(GameWorld world) {
    this.world = world;
    this.steps = new ArrayList<>(); //инициализация через addStep()
  }

  public void play() {
    for (ScenarioStep tmpStep : steps) {





    }
  } //запуск сценария;
  public void addStep(ScenarioStep step) {
    steps.add(step);
  } //добавление события;
  //продумать логику

  //protected void executeNextStep() {} //выполнение следующего события;
/*
  protected void initializeScenario() {} //подготовка сценария;
  protected void generateRandomVariation() {} //выбор случайных вариаций;
  protected void isFinished() {} // проверка завершения сценария. */
}

