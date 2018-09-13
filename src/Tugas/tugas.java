
package Tugas;
import java.util.Scanner;
import java.math.BigInteger;
public class tugas {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nhitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 13, 21, ... dst.\n");
    }
    
    public static void main(String[] args) {
        String identitas = "Annisa Fairuz Rizqi / X RPL 2 / 07";
        
        tampilJudul(identitas);
        int n = tampilInput();
        BigInteger hasil = fibo(n);
        tampilHasil(n, hasil);
    }
    
        private static int tampilInput() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Bilangan ke-: ");
            int n = scanner.nextInt();
            
            return n;
    }
        
        private static BigInteger fibo(int n) {
            
            BigInteger[] hasil = new BigInteger[n];
            
            hasil[0] = BigInteger.ONE;
            hasil[1] = BigInteger.ONE;
            
            for(int i = 2; i < n; i++) {
                hasil[i] = hasil[i-1].add(hasil[i-2]);
            }
            return hasil[n-1];
    }
        private static void tampilHasil(int n, BigInteger hasil) {
            System.out.println("Bilangan Fibonacci ke-" + n + " : " + hasil);
            
        }
        
}
