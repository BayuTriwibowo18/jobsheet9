 import java.util.Scanner;
 public class ArrayNilai07_1 {

        public static void main(String[] args){
            Scanner sc07 =new Scanner(System.in);
            int[] nilaiAkhir =new int[10];
    
            for (int i = 0;i < nilaiAkhir.length; i++){
                System.out.print("Masukkan nilai akhir ke-"+i+" : ");
                nilaiAkhir[i] =sc07.nextInt();
    
            }
            for ( int i = 0; i < 10; i++){
                if (nilaiAkhir[i] > 70){
                    System.out.println("Mahasiswa ke-"+i+"lulus");
                } else {
                    System.out.println("Mahasiswa ke-"+i+" Tidak lulus");
                }
                
            }
        }
    }
    
    

