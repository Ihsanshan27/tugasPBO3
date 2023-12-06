public class Tabung extends BangunRuang {

     public Tabung(double jariJari, double tinggi) {
          super(jariJari, tinggi);
          // TODO Auto-generated constructor stub
     }

     public double hitungVolumeTabung() {
          return Math.PI * Math.pow(getJariJari(), 2) * getTinggi();
     }
}
