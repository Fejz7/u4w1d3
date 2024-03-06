package package1;

public class Rettangolo {
    private int altezza;
    private int larghezza;


    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    public int calcolaArea() {
        return altezza * larghezza;
    }

    public int calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }


    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }


    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();

        System.out.println("Rettangolo 2:");
        rettangolo2.stampaRettangolo();

        int sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        int sommaPerimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        System.out.println("Somma delle Aree: " + sommaAree);
        System.out.println("Somma dei Perimetri: " + sommaPerimetri);
    }

    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(8, 6);


        stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
