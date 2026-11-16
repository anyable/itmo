// библиотека Lombok
/*
import lombok.ToString;

@ToString
public class Person {
  private int age;
  private String name;
}
cам сгенерит дефолтную toString() с нужными параметрами

почитать про lombok
лямбда выражение и стримы
типы исключений
джош блок эффективная джава
амортизация
регулярные выражения
JavaDoc
*/

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.ServerException;

public class Result<T, E> {
    private final T value;
    private final E error;
    private final boolean success;

    // Приватные конструкторы
    private Result(T value, E error, boolean success) {
        this.value = value;
        this.error = error;
        this.success = success;
    }

    // Фабричный метод для успешного результата
    public static <T, E> Result<T, E> success(T value) {
        return new Result<>(value, null, true);
    }

    // Фабричный метод для ошибки
    public static <T, E> Result<T, E> failure(E error) {
        return new Result<>(null, error, false);
    }

    public boolean isSuccess() { return success; }
    public boolean isError() { return !success; }

    public T getValue() { return value; }
    public E getError() { return error; }




    public static void main(String [] argc) {
        //комбинирование потоков
        Path path = Paths.get("path/to/file.dat");

        try (DataInputStream dis =
                new DataInputStream(
                    new BufferedInputStream(
                        Files.newInputStream(path)))) {

            double doubleVal = dis.readDouble();
            long longVal = dis.readLong();
        } catch (IOException e) {
            ServerException exc = new ServerException("not correct input", e);
            //throw exc; если бы не в main находилось, томожно было бы пробросить
        }
    }

}

/*
На слайде показан паттерн «Декоратор» (Decorator), который активно
используется в Java I/O для комбинирования потоков ввода.
Простыми словами: вместо создания одного «гигантского» класса, умеющего
всё сразу, в Java создаются
цепочки из обёрток. Каждый поток отведен под свою конкретную задачу.  */
