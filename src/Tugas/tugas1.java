
package Tugas;
import java.util.Scanner;
public class tugas1 {
   public static void main(String[] args) {
       int[] nominal = {5000, 2000, 1000, 500, 100};
       
       Scanner scan = new Scanner(System.in);
       System.out.print("Masukkan jumlah uang : ");
       int uang = scan.nextInt();
       
       for(int i = 0; i < 5; i++) {
           int jumlah = uang/nominal[i];
           uang = uang - (nominal[i]*jumlah);
          
           System.out.println("Lembar" + nominal[i]+  " : " + jumlah);
   }
   }
       
   }

