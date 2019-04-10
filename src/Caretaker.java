import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Caretaker extends  Thread {
    private Object obj;
    private Originator ori;
    private List<MementoIF> meme = new ArrayList<>();
    private int arvo;
    private String pelaaja;

    public Caretaker(String pelaaja) {
        this.pelaaja = pelaaja;
    }

    @Override
    public void run() {
        ori = new Originator();
        meme.add(ori.liityPeliin());

        do {
            Random rand = new Random();
             arvo = rand.nextInt(10) + 1;
            System.out.println("Pelaaja " + pelaaja + ": Arvaan numero: " + arvo);
        } while (!ori.arvaus(arvo, meme));
    }


}
