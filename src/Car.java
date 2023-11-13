class Car extends Vehicle {

    public String car = "masina";

    public int viteza = 150;

    @Override
    public void speedUp() {
        int speed = viteza + 50;
        System.out.println(car+":"+speed);
    }
}