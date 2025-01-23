public class App {
    public static void main(String[] args) {
        Car maVoiture = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        maVoiture.startCar(moi);
        maVoiture.accelererate();
        maVoiture.changeSpeed(moi, 80);
        maVoiture.slowdown();
        maVoiture.changeSpeed(moi, 30);
        maVoiture.stopCar(moi);
        System.out.println("fini");
    }
}
