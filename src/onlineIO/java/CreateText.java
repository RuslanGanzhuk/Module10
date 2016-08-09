package onlineIO.java;

import java.util.Scanner;

public class CreateText {

    Scanner scanner = new Scanner(System.in);
    private String text;

    public String creatingText() {

        System.out.println("Please enter your text");
        this.text = scanner.nextLine();

        return text;
    }

    public String getText() {
        return text;
    }
}
//scanner - модификатор доступа

//CreateText - не существительное

//creatingText() - не глагол

//getText() возвращает текст, creatingText() воззвращает текст, можно получить текст с помощью getText() когда
//мы его еще не создалис помощью creatingText().. не подуманно

//scanner - модификатор доступа

//final?