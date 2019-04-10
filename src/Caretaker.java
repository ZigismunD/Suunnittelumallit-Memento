import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Caretaker implements  Runnable {
    private Object obj;
    private Originator ori;
    private List<MementoIF> meme = new ArrayList<>();
    private int arvo;

    @Override
    public void run() {
        ori = new Originator();
        meme.add(ori.liityPeliin());

        do {
            Random rand = new Random();
             arvo = rand.nextInt(10) + 1;
            System.out.println("Arvaan numero: " + arvo);
        } while (!ori.arvaus(arvo, meme));
    }


}
