package BFDC_Tugas;
public class NilaiUTSTertinggiDC11 {
    public static int cariNilaiUTSTertinggi(int[] nilaiUTS, int awal, int akhir) {
        if (awal == akhir) {
            return nilaiUTS[awal];
        }

        int tengah = (awal + akhir) / 2;
        int nilaiKiri = cariNilaiUTSTertinggi(nilaiUTS, awal, tengah);
        int nilaiKanan = cariNilaiUTSTertinggi(nilaiUTS, tengah + 1, akhir);

        return Math.max(nilaiKiri, nilaiKanan);
    }

    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int nilaiTertinggi = cariNilaiUTSTertinggi(nilaiUTS, 0, nilaiUTS.length - 1);

        System.out.println("====================================");
        System.out.println("        PENCARIAN NILAI UTS         ");
        System.out.println("====================================");
        System.out.println("Nilai UTS: ");
        for (int nilai : nilaiUTS) {
            System.out.print(nilai + " ");
        }
        System.out.println("\n------------------------------------");
        System.out.println("Nilai UTS terendah adalah: " + nilaiTertinggi);
        System.out.println("====================================");
    }
}

