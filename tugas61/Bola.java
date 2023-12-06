public class Bola extends BangunRuang {

     public Bola(double jariJari, double tinggi) {
          super(jariJari, tinggi);
          // TODO Auto-generated constructor stub
     }

     public double hitungVolumeBola() {
          return 4 * Math.PI * Math.pow(getJariJari(), 3) / 3;
     }
}
