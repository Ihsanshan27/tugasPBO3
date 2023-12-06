public class Kerucut extends BangunRuang {

     public Kerucut(double jariJari, double tinggi) {
          super(jariJari, tinggi);
          // TODO Auto-generated constructor stub
     }

     public double hitungVolumeKerucut() {
          return 1 * Math.PI * Math.pow(getJariJari(), 2) * getTinggi() / 3;
     }

}
//