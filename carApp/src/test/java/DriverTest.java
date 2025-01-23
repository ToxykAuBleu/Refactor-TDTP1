import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver conducteur;

    @BeforeEach
    public void setUp() {
        conducteur = new Driver("John", 20);
    }

    @Test
    public void testEstAdulte() {
        assertThat(conducteur.isAdult()).isTrue();
    }

    @Test
    public void testDemarrerVoiture() {
        Car voiture = new Car("Sedan", "Bleu");
        voiture.startCar(conducteur);
        // How to assert that the startCar method was called?
    }

    @Test
    public void testArreterVoiture() {
        Car voiture = new Car("Sedan", "Bleu");
        voiture.stopCar(conducteur);
        // How to assert that the stopCar method was called?
    }

    @Test
    public void testChangerVitesse() {
        Car voiture = new Car("Sedan", "Bleu");

        voiture.changeSpeed(conducteur, 80);
        assertThat(voiture.getSpeed()).isEqualTo(80);
    }
}
