import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        // Comment 
        // Let us get Started
        System.out.println("Hello Java");
 
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("[Car Info]");
        System.out.println(" ");
        System.out.println("Car Company");
        String carCompany = scanner.next();
        System.out.println(" ");
        System.out.println("Car Name: ");
        String carName = scanner.next();
        System.out.println(" ");
        System.out.println("Car Color: ");
        String carColor = scanner.next();
        System.out.println(" ");        
        System.out.println("Car Price(in Rs): ");
        int carPrice = scanner.nextInt();
        System.out.println(" ");

    }
}
