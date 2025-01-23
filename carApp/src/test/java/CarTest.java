import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car voiture;

    @BeforeEach
    public void setUp() {
        voiture = new Car("Sedan", "Bleu");
    }

    @Test
    public void testAccelerer() {
        voiture.accelererate();
        assertThat(voiture.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testRalentir() {
        voiture.accelererate();
        voiture.slowdown();
        assertThat(voiture.getSpeed()).isEqualTo(0);
    }
}
