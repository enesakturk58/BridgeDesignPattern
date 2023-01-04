public class Main {
    public static void main(String[] args) {

        Rapor rapor1 = new Calisan(new Web());
        rapor1.raporGoruntule();
        rapor1.format=new Mobil(); // istersek sonradan formati degistirebiliyoruz.
        rapor1.raporGoruntule();

        Rapor rapor2 = new Satis(new Mobil());
        rapor2.raporGoruntule();
    }
}