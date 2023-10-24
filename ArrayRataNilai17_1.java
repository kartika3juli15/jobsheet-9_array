import java.util.Scanner;

public class ArrayRataNilai17_1{
    public static void main(String[] args){
        Scanner sc17 = new Scanner (System.in);

        int[] nilaiMhs = new int [10];
        double total = 0;
        double rata2;

        
        
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("masukkan nilai mahasiswa ke-" + (i+1)+" : ");
            nilaiMhs[i] = sc17.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                System.out.println("mahasiswa ke-"+(i+1)+" lulus!");
                
        }

     }
    }
     }

     