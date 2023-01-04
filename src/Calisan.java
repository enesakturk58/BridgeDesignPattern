public class Calisan extends Rapor{

    public Calisan(IFormat format) {
        super(format);
    }

    public void raporGoruntule(){
        System.out.print("Calisan için rapor : ");
        format.goruntule();
    }
}
