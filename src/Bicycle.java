class Bicycle extends Vehicle {

    public String bicycle = "bicicleta";

    public int viteza2 = 20;



    @Override
    public void speedUp() {
        int speed = viteza2 + 50;
        System.out.println(bicycle+":"+speed);
    }
}