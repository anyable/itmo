/* В этом лабораторном задании вам нужно создать программу, которая принимает на вход две строки,
использует метод equals() для проверки их равенства и затем выводит либо "Equal" (Равны), либо "Not Equal" (Не равны)
в зависимости от результата сравнения. */
import java.util.Scanner;

public class CompareString {
  public static void main(String[] argc) {
/*     String s1, s2;
    Scanner sc = new Scanner(System.in);
    s1 = sc.next();
    s2 = sc.next();

    if (s1.equals(s2)) {
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal");
    }
  } */



    //тонкость работы scanner.nextLine()
    //nextLine() берет весь текст включая пробелы до перевода строки
    //если у нас в буфере сразу после чтенеия числа лежит перевод строки, то он ничено не запишет
    /* nextLine() не записывает перенос строки в буфер, а все остальные записывают */
    Scanner scanner = new Scanner(System.in);
    String a1 = scanner.nextLine();
    String a2 = scanner.nextLine();

    System.out.println(a1);
    System.out.println(a2);
  }
}
