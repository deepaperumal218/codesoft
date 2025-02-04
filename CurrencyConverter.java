import java. util.Scanner;
public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("1 Ruppe to dollar");
        System.out.println("2 Ruppe to euro");
        System.out.println("3 Dollar to ruppe");
        System.out.println("4 Dollar to euro");
        System.out.println("5 Euro to ruppe");
        System.out.println("6 Euro to dollar");
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        switch (choice) {
            case 1:
                Ruppe_to_dollar(amount);
                break;
            case 2:
                Ruppe_to_euro(amount);
                break;
            case 3:
                Dollar_to_ruppe(amount);
                break;
            case 4:
                Dollar_to_euro(amount);
                break;
            case 5:
                Euro_to_ruppe(amount);
                break;
            case 6:
                Euro_to_dollar(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void Ruppe_to_dollar(double amt) {
    System.out.println("1 Ruppe = " + 0.013 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
    System.out.println();
}
public static void Ruppe_to_euro(double amt){
    System.out.println("1 Ruppe = " + 0.012 + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
    System.out.println();
}
public static void Dollar_to_ruppe(double amt) {
    System.out.println("1 Dollar = " + 79.37 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
    System.out.println();
}
public static void Dollar_to_euro(double amt){ 
    System.out.println("1 Dollar= " + 0.98 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
}
public static void Euro_to_ruppe(double amt){
    System.out.println("1 Euro = " + 80.85 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
    System.out.println();
}
public static void Euro_to_dollar(double amt){ 
    System.out.println("1 Euro = " + 1.02 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
}
}