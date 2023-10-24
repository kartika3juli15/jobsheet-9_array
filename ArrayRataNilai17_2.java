import java.util.Scanner;

public class ArrayRataNilai17_2 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner (System.in);

        int [] nilaiMhs = new int [10];
        double totalLulus = 0, totalTdkLulus = 0, rataLulus, rataTdkLulus;
        int lulus = 0, tidakLulus = 0, jmlInput;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlInput = sc17.nextInt();

        for (int i = 0; i < jmlInput; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jmlInput; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus = totalLulus + nilaiMhs[i];
                lulus++;
            } else {
                totalTdkLulus = totalTdkLulus + nilaiMhs[i];
                tidakLulus++;
            }
        }

        rataLulus = totalLulus / lulus;
        rataTdkLulus = totalTdkLulus / tidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus " + rataTdkLulus);
    }
}
