import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0){  //sprawdzamy czy reszta z dzielenia przez 2 jest równa 0
            System.out.println("Ta liczba jest parzysta!");
        }
        else{
            System.out.println("Ta liczba jest nieparzysta!");
        }
    }
}
