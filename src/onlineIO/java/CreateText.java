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
