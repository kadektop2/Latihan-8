package Bab8.Latihan2;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        do {
            System.out.println("----------------------");
            System.out.print("Masukkan nilai: ");
            double n = c.nextDouble();
            Nilai nil = new Nilai(n);
        } while (true);
    }
}
