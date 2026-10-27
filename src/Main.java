import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Register register = new Register();
        int val = 0;

        while (val != 4) {
            System.out.println("\n===  MEDLEMSREGISTER  ===");
            System.out.println("1. Lägg till medlem\n2. Visa alla medlemmar\n3. Sök medlem\n4. Avsluta");
            System.out.print("\nDitt val: ");
            if (!input.hasNextInt()) {
                System.out.println("\nSkriv ett heltal mellan 1 och 4.");
                input.nextLine();
                continue;
            }
            val = input.nextInt();
            input.nextLine();
            switch (val) {
                case 1 -> {
                    System.out.print("\nSkriv namn på medlem: ");
                    String namn = input.nextLine();
                    System.out.print("Skriv medlemsnummer: ");
                    if (!input.hasNextInt()) {
                        System.out.println("\nMedlemsnumret måste vara ett heltal.");
                        input.nextLine();
                        continue;
                    }
                    int medlemsnummer = input.nextInt();
                    input.nextLine();
                    Medlem medlem = new Medlem(namn, medlemsnummer);
                    register.laggTillMedlem(medlem);
                }
                case 2 -> register.visaAllaMedlemmar();
                case 3 -> {
                    System.out.print("\nAnge namn på medlem att söka efter: ");
                    String namn = input.nextLine();
                    System.out.println();
                    register.sokMedlem(namn);
                }
                case 4 -> System.out.println("Programmet avslutas...");
                default -> System.out.println("\nVälj ett nummer mellan 1 och 4.");
            }
        }
    }
}