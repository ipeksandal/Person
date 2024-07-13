public class Test {
    public static void main(String[] args) {
        Person isim1 = new Person("İpek");
        Person isim2 = new Person("Ilgın");
        Vehicle vehicle = new Vehicle("Scoda", 1600, isim2);
        vehicle.setMotordakiSilindirSayisi(1600);
        Truck truck = new Truck("Ford",100, isim1, 10);
        System.out.println(truck.toString());
        System.out.println(vehicle.toString());
    }
}
