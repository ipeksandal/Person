public class Vehicle extends Person{
    private String ureticiFirmaAdi;
    private int motordakiSilindirSayisi;
    private Person malSahibi;
    public Vehicle(String ureticiFirmaAdi, int motordakiSilindirSayisi, Person malSahibi){
    this.ureticiFirmaAdi = ureticiFirmaAdi;
    this.motordakiSilindirSayisi = motordakiSilindirSayisi;
    this.malSahibi = new Person(malSahibi);
    }
    public String getUreticiFirmaAdi() {
    return ureticiFirmaAdi;
    }
    public void setUreticiFirmaAdi(String ureticiFirmaAdi) {
        this.ureticiFirmaAdi = ureticiFirmaAdi;
    }
    public int getMotordakiSilindirSayisi() {
        return motordakiSilindirSayisi;
    }
    public void setMotordakiSilindirSayisi(int motordakiSilindirSayisi) {
        this.motordakiSilindirSayisi = motordakiSilindirSayisi;
    }
    public Person getMalSahibi() {
        return new Person(malSahibi);
    }
    public void setMalSahibi(Person malSahibi) {
        this.malSahibi = new Person(malSahibi);
    }
    public String toString(){
        return "Üretici firma adı : " + getUreticiFirmaAdi() + "\n" +
                "Motordaki silindir sayısı : " + getMotordakiSilindirSayisi() + "\n" +
                "Mal sahibi : " + getMalSahibi();
    }
}
