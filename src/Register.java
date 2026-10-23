
import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

    public void laggTillMedlem(Medlem medlem) {
        medlemmar.add(medlem);
    }

    public void visaAllaMedlemmar() {
        if (medlemmar.isEmpty()) {
            System.out.println("Registret är tomt.");
        } else {
            for (Medlem medlem : medlemmar) {
                System.out.println("Namn: " + medlem.getNamn());
                System.out.println("Medlemsnummer: " + medlem.getMedlemsnummer());
            }
        }
    }

    public void sokMedlem(String namn) {
        boolean hittad = false;

        for (Medlem medlem : medlemmar) {
            if (medlem.getNamn().equalsIgnoreCase(namn)) {
                System.out.println("Namn: " + medlem.getNamn());
                System.out.println("Medlemsnummer: " + medlem.getMedlemsnummer());
                hittad = true;
            }
        }

        if (!hittad) {
            System.out.println("Ingen medlem hittades.");
        }
    }
}
