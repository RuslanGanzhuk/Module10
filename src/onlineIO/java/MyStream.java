package onlineIO.java;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyStream {
    CreateText createText = new CreateText();
    //createText.creatingText();

    public void createStream() {

        //String text1 =  createText.creatingText();
        //String text1 = createText.getText();

        try (FileOutputStream outputStream = new FileOutputStream("enter.txt");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {

            byte[] buffer = createText.creatingText().getBytes();
            //byte [] buffer = text1.getBytes();
            bufferedOutputStream.write(buffer, 0, buffer.length);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
