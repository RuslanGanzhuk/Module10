package onlineIO.java;

public class Cipher {

    CreateText createText = new CreateText();
    CreateKey createKey = new CreateKey();

    public Cipher() {

        String encryption = cipher1(createText.creatingText(), createKey.creatingKey());
        //System.out.println("Password:\t" + createText.creatingText());
        System.out.println("Password:\t" + createText.getText());
        System.out.println("Encrypted:\t" + encryption);
        //System.out.println("Decrypted:\t" + cipher1(encryption, - createKey.creatingKey()));
        System.out.println("Decrypted:\t" + cipher1(encryption, -createKey.getKeyInt()));
    }

    public char cipher(char c, int k) {

        final int alphaLength = 26;
        final char asciiShift = Character.isUpperCase(c) ? 'A' : 'a';
        final int cipherShift = k % alphaLength;

        char shifted = (char) (c - asciiShift);
        shifted = (char) ((shifted + cipherShift + alphaLength) % alphaLength);
        return (char) (shifted + asciiShift);
    }

    public String cipher1(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(cipher(s.charAt(i), k));
        }
        return sb.toString();
    }
}
