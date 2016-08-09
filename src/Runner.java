import onlineIO.java.Cipher;
import onlineIO.java.MyStream;

public class Runner {

    public static void main(String[] args) {

        Cipher cipher = new Cipher();
        MyStream myStream = new MyStream();
        myStream.createStream();
    }
}

//нам точно нужно создавать два сканера - по одному на каждый класс?

//числа шифрует не корректно (как и все, кроме латиницы. Но если такая задумка - нужно об этом как минимум сообщеть)

//символ в качестве ключа - отрабатывает не корректно

//Приложение просит два раза ввести текст. Зачем?

//"Реализовать сохранение/загрузку текстового сообщения в файл с предварительным шифрованием/расшифрованием" - не реализовано.

//где .gitignore?

//cipher - зачем создавать переменную?

//src\enter.txt - для чего этот файл?