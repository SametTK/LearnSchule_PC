import org.example.Mitarbeiter;
import org.junit.Test;

public class TestMitarbeiter {


    @Test
    public void testMitarbeiter() {

        Mitarbeiter mitarbeiter = new Mitarbeiter("Samet");
        Mitarbeiter aitarbeiter = new Mitarbeiter("Samet");

        mitarbeiter.equals(aitarbeiter);

    }


}
