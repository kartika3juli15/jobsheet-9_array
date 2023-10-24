import java.util.Scanner;

public class ArrayNilai17_1{
    public static void main(String[] args){
        Scanner sc17 = new Scanner (System.in);

        int[] NilaiAkhir = new int [10];

        for (int i = 0; i < NilaiAkhir.length; i++){
            System.out.print("masukkan nilai akhir ke-"+i+" : ");
            NilaiAkhir[i] = sc17.nextInt();


        }

        for (int i = 0; i < 10; i++){
            System.out.println("masukkan nilai akhir ke-"+i+" adalah " +NilaiAkhir[i]);
    
        }

     }
    }