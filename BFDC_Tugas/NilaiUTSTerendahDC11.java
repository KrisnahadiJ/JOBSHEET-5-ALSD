package BFDC_Tugas;
public class NilaiUTSTerendahDC11 {
    public static int cariNilaiUTSTerendah(int[] nilaiUTS, int awal, int akhir) {
        if (awal == akhir) {
            return nilaiUTS[awal];
        }

        int tengah = (awal + akhir) / 2;
        int nilaiKiri = cariNilaiUTSTerendah(nilaiUTS, awal, tengah);
        int nilaiKanan = cariNilaiUTSTerendah(nilaiUTS, tengah + 1, akhir);

        return Math.min(nilaiKiri, nilaiKanan);
    }

    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int nilaiTerendah = cariNilaiUTSTerendah(nilaiUTS, 0, nilaiUTS.length - 1);

        System.out.println("====================================");
        System.out.println("        PENCARIAN NILAI UTS         ");
        System.out.println("====================================");
        System.out.println("Nilai UTS: ");
        for (int nilai : nilaiUTS) {
            System.out.print(nilai + " ");
        }
        System.out.println("\n------------------------------------");
        System.out.println("Nilai UTS terendah adalah: " + nilaiTerendah);
        System.out.println("====================================");
    }
}
