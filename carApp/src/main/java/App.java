public class App {
    public static void main(String[] args) {
        Car maVoiture = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        moi.startCar(maVoiture);
        maVoiture.accelererate();
        moi.changeSpeed(maVoiture, 80);
        maVoiture.slowdown();
        moi.changeSpeed(maVoiture,30);
        moi.stopCar(maVoiture);
        System.out.println("fini");
    }
}
