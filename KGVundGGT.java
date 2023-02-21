import java.util.Scanner;

public class KGVundGGT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein: ");
        int zahl1 = scanner.nextInt();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        int zahl2 = scanner.nextInt();
        scanner.close();

        int kgv = berechneKGV(zahl1, zahl2);
        int ggt = berechneGGT(zahl1, zahl2);

        System.out.println("Der KGV von " + zahl1 + " und " + zahl2 + " ist " + kgv);
        System.out.println("Der GGT von " + zahl1 + " und " + zahl2 + " ist " + ggt);
    }

    public static int berechneKGV(int zahl1, int zahl2) {       //berechnung des KGV via Formel (kgv = a * b / ggt)
        return zahl1 * zahl2 / berechneGGT(zahl1, zahl2);
    }

    public static int berechneGGT(int zahl1, int zahl2) {       //berechnug des GGT via euklidischem Algorithmus
        while(zahl2 != 0) {
            int temp = zahl1 % zahl2;
            zahl1 = zahl2;
            zahl2 = temp;
        }

        return zahl1;
    }
}
