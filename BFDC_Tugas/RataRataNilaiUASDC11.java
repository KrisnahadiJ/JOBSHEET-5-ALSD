package BFDC_Tugas;
public class RataRataNilaiUASDC11 {
    public static double hitungRataRataNilaiUAS(int[] nilaiUAS) {
        int total = 0;

        for (int nilai : nilaiUAS) {
            total += nilai;
        }

        return (double) total / nilaiUAS.length;
    }

    public static void main(String[] args) {
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
        double rataRata = hitungRataRataNilaiUAS(nilaiUAS);
        
        System.out.println("====================================");
        System.out.println("        PENCARIAN NILAI UTS         ");
        System.out.println("====================================");
        System.out.println("Nilai UTS: ");
        for (int nilai : nilaiUAS) {
            System.out.print(nilai + " ");
        }
        System.out.println("\n------------------------------------");
        System.out.println("Nilai UTS terendah adalah: " + rataRata);
        System.out.println("====================================");
    }
}


