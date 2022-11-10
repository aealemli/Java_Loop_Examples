import java.util.Scanner;

public class inputakadarciftler {
    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı gir: ");
        int sonuc; 
        sonuc = scanner.nextInt();

    
        for(int i=0; i<sonuc; i+=2){

        System.out.print(i + " ");

    }


    System.out.println("\n**");

    }
    
}

