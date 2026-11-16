enum SingletonE {
  INSTANCE;

  public void sayHello() {
    System.out.println("Hello");
  }
}

public class Main {
  public static void main(String [] argc) {

    SingletonE a1 = SingletonE.INSTANCE;
    SingletonE a2 = SingletonE.INSTANCE;

    a1.sayHello();

    if (a1 == a2) {
      System.out.println("Равны");
    }
  }
}
