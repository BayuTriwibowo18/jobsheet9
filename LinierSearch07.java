import java.util.Scanner;
public class LinierSearch07 {
    public static void main(String[] args){
         int[] arrayint = {34, 18, 26, 48, 72, 20, 56, 63 };
         int key = 20;
         int hasil =0;

         for (int i = 0; i < arrayint.length; i++){
            if (arrayint[i] == key){
                hasil = i;
                break;
            }
         }
         System.out.println("key ada dalam array posisi indeks ke-:" +hasil);
    }
}
