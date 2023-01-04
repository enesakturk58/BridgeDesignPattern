public class Satis extends Rapor{

    public Satis(IFormat format) {
        super(format);
    }

    public void raporGoruntule(){
        System.out.print("Satis için rapor : ");
        format.goruntule();
    }
}
