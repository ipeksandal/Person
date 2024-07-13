public class Truck extends Vehicle{
    private double capacity;
    private Vehicle ureticiFirmaAdi;
    public Truck(String ureticiFirmaAdi, int motordakiSilindirSayisi, Person malSahibi, double capacity) {
        super(ureticiFirmaAdi, motordakiSilindirSayisi, malSahibi);
        this.capacity = capacity;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public String toString(){
        return "Kapasite : " + getCapacity();
    }
}
