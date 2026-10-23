import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===  MEDLEMSREGISTER  ===");
        System.out.println("1. Lägg till medlem\n2. Visa alla medlemmar\n3. Sök medlem\n4. Avsluta");
        System.out.print("Ditt val: ");
        Scanner input = new Scanner(System.in);
        Register register = new Register();

        int val = 0;

        while (val != 4) {
            val = input.nextInt();
            input.nextLine();
            switch (val) {
                case 1 -> {
                    System.out.println("\nSkriv namn på medlem: ");
                    String namn = input.nextLine();
                    System.out.println("\nSkriv medlemsnummer: ");
                    int medlemsnummer = input.nextInt();
                    input.nextLine();
                    Medlem medlem = new Medlem(namn, medlemsnummer);
                    register.laggTillMedlem(medlem);
                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> System.out.println("Programmet avslutas. Hej då!");
            }
        }

    }
}