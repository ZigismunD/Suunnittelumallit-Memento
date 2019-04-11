import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Originator {
    private Random rand;

    public Memento liityPeliin() {
        rand = new Random();
        return new Memento(rand.nextInt(10) + 1);
    }

    public boolean arvaus(int arvaus, Object meme) {
        Memento meemu = (Memento) meme;
        return arvaus == meemu.getNumber();
    }

    private class Memento  {
        private int number;

        private Memento(int number) {
            this.number = number;
        }

        private int getNumber() {
            return this.number;
        }
    }

}


