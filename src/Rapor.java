public class Rapor {
    IFormat format;
    public Rapor(IFormat format){
        this.format=format;
    }
    public void raporGoruntule(){
        format.goruntule();
    }
}
