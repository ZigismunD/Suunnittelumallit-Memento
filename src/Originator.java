import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Originator {
    private Random rand;

    public Memento liityPeliin() {
        rand = new Random();
        return new Memento(rand.nextInt(10) + 1);
    }

    public boolean arvaus(int arvaus, List<MementoIF> meme) {
        Memento meemu = (Memento) meme.get(0);
        return arvaus == meemu.getNumber();
    }

    private class Memento implements MementoIF {
        private int number;

        public Memento(int number) {
            this.number = number;
        }

        public int getNumber() {
            return this.number;
        }
    }

}


