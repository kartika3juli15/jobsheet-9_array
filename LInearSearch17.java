import java.util.Scanner;

public class LInearSearch17{
    public static void main(String[] args){
        Scanner sc17 = new Scanner (System.in);

    int[] arrayInt = {34, 18, 26, 49, 72, 20, 56, 63};
    int key = 20;
    int hasil = 0;

    for (int i = 0; i < arrayInt.length; i++){
        if (arrayInt[i] == key){
            hasil = i;
            break;
        }
    }
System.out.println("key ada dalam array pada posisi indeks ke-"+hasil);
 }
 }