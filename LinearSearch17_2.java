import java.util.Scanner;

public class LinearSearch17_2{
    public static void main(String[] args){
        Scanner sc17 = new Scanner (System.in);

    int[] arrayInt = new int [6];
    int key = 0, hasil = 0, array;

    System.out.print("masukkan jumlah elemen array : ");
    array = sc17.nextInt();

    for (int i = 0; i < arrayInt.length; i++){
        System.out.print("Masukkan elemen array yang ke- " +i+ " : ");
            arrayInt[i] = sc17.nextInt();

        }  System.out.print("Masukkan key yang ingin dicari: ");
        key = sc17.nextInt();
        for (int i =0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                hasil =i;
                System.out.print("key dalam array pada posisi indeks ke- "+hasil);
                break;
            }else{
                System.out.print("key tidak ditemukan");
                break;

        }

    }
 }
  }
 