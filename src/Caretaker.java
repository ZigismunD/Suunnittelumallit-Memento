import java.util.Random;

public class Caretaker extends  Thread {
    private Object obj;
    private Originator ori;
    private int arvo;
    private String pelaaja;
    private Random rand;

    public Caretaker(String pelaaja) {
        this.pelaaja = pelaaja;
    }

    @Override
    public void run() {
        ori = Originator.getInstance();
        obj = ori.liityPeliin();
        rand = new Random();
        do {
            arvo = rand.nextInt(10) + 1;
            System.out.println("Pelaaja " + pelaaja + ": Arvaan numero: " + arvo);
        } while (!ori.arvaus(arvo, obj));
    }


}
