package BFDC_Minggu5;

public class Sum11 {
    double[] keuntungan;

    public Sum11(int el) {
        keuntungan = new double[el];
    }

    public double TotalBF() {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    public double TotalDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double sumL = TotalDC(arr, l, mid);
        double sumR = TotalDC(arr, mid + 1, r);
        return sumL + sumR;
    }
}

