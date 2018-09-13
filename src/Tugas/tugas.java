
package Tugas;
import java.util.Scanner;
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
    }
    
        private static int tampilInput() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Bilangan ke-: ");
            int n = scanner.nextInt();
            
            return n;
    }
    
}
