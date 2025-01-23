public class Car {
    private String model;
    private String color;
    private int speed;

    private static final int MAX_SPEED = 120;
    private static final int MIN_SPEED = 0;
    private static final int INCREMENT_SPEED = 10;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelererate() {
        if (speed + INCREMENT_SPEED <= MAX_SPEED) {
            speed += INCREMENT_SPEED;
            // Print details
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowdown() {
        if (speed - INCREMENT_SPEED >= MIN_SPEED) {
            speed -= INCREMENT_SPEED;
            // Print details
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

