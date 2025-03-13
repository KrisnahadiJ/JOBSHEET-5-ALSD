package BFDC_Minggu5;
import java.util.Scanner;

public class MainFaktorial11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faktorial11 faktorial = new Faktorial11();

        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        int hasilBF = faktorial.faktorialBF(nilai);
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + hasilBF);

        int hasilDC = faktorial.faktorialDC(nilai);
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + hasilDC);

        sc.close();
    }
}

