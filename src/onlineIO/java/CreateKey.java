package onlineIO.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateKey {

    Scanner scannerInt = new Scanner(System.in);

    private int keyInt;

    public int creatingKey() {

        try {
            do {
                System.out.println("Please enter key beetwen 1-25");
                this.keyInt = scannerInt.nextInt();
                if (keyInt < 1 || keyInt > 25) {
                    System.out.printf(" The key must be between 1 and 25, you entered %d.\n", keyInt);
                }
            } while (keyInt < 1 || keyInt > 25);


        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return keyInt;
    }

    public int getKeyInt() {
        return keyInt;
    }
}

//CreateKey - не существительное

//creatingKey() - не глагол

//может есть смысл сделать какие-то поля final?

//beetwen - грамматическая ошибка

//в цикле одно условие проверяется дважды за каждую иттерацию. Можно оптимизировать

//если в ввести символ, то строка
//System.out.println(e.getMessage());
//выводит
//null
//Цель этой строки достигнута?
//при этом в keyInt записывается "0". Так задумано?
