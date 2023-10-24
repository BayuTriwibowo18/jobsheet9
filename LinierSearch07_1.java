import java.util.Scanner;
public class LinierSearch07_1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] arrayInt = new int[8];
        int key = 0;
        int jmlElemen;
        int hasil =0;

        System.out.print("masukkan jumlah elemen array: ");
        jmlElemen = sc.nextInt();

        for (int i =0; i < arrayInt.length; i++){
            System.out.print("masukkan elemen array ke-"+(i)+" :");
            arrayInt[i]= sc.nextInt();

        }
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();
        for (int i =0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                hasil =i;
                System.out.print(" key dalam array pada posisi indeks ke- "+hasil);
                break;
            }else{
                System.out.print("key tidak ditemukan");
                break;
            }
        }
       
}
}
