//Simple Solution
public class Singleton {

  private static final Singleton INSTANCE = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    return INSTANCE;
  }
}

//ленивая инициализация
class SingletonLazyI {

  private static SingletonLazyI INSTANCE_LAZY_I;

  private SingletonLazyI() {}

  public static SingletonLazyI getInstance() {
    if (INSTANCE_LAZY_I == null) {
      INSTANCE_LAZY_I = new SingletonLazyI();
    }
    return INSTANCE_LAZY_I;
  }
}

//синхронизированный метод доступа
class SingletonSynA {
  private static SingletonSynA INSTANCE;

  private SingletonSynA() {
  }

  public static synchronized SingletonSynA getInstance() {
    if (INSTANCE == null) {
        INSTANCE = new SingletonSynA();
    }
    return INSTANCE;
  }
}

//двойная проверка блокировки
class SingletonDoubB {
  private static volatile SingletonDoubB INSTANCE;

  private SingletonDoubB() {
  }

  public static SingletonDoubB getInstance() {
    if (INSTANCE == null) {
      synchronized (SingletonDoubB.class) {
        if (INSTANCE == null) {
            INSTANCE = new SingletonDoubB();
        }
      }
    }
    return INSTANCE;
  }
}


class SingletonH {

  private SingletonH() {
  }

  private static class SingletonHolder {
    public static final SingletonH HOLDER_INSTANCE = new SingletonH();
  }

  public static SingletonH getInstance() {
    return SingletonHolder.HOLDER_INSTANCE;
  }
}



enum SingletonE {
  INSTANCE;

  public void doWork() {}
}

