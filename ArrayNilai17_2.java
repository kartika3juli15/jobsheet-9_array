import java.util.Scanner;

public class ArrayNilai17_2{
    public static void main(String[] args){
        Scanner sc17 = new Scanner (System.in);

        int[] NilaiAkhir = new int [10];

        for (int i = 0; i < NilaiAkhir.length; i++){
            System.out.print("masukkan nilai akhir ke-"+i+" : ");
            NilaiAkhir[i] = sc17.nextInt();

        }

        for (int i = 0; i < NilaiAkhir.length; i++){
            if (NilaiAkhir[i] > 70){
                System.out.println("mahasiswa ke-"+i+" lulus!");
        }
        else if (NilaiAkhir[i] < 70){
                System.out.println("mahasiswa ke-"+i+" tidak lulus!");

     }
    }
    }
 }