import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Caretaker ct = new Caretaker("1");
        ct.start();

        Caretaker ct2 = new Caretaker("2");
        ct2.start();
    }
}
