public class Main {

     public static void main(String[] args) {
          Bola bola = new Bola(7, 0);
          System.out.println("Menghitung Volume Bola");
          System.out.println("Jari-jari bola : " + bola.getJariJari() + "\n" + "Volume Bola : "
                    + String.format("%.2f", bola.hitungVolumeBola()) + " cm3");

          System.out.println();

          Tabung tabung = new Tabung(10, 21);
          System.out.println("Menghitung Volume Tabung");
          System.out.println("Jari-jari bola : " + tabung.getJariJari() + "\n" + "Tinggi Tabung : " + tabung.getTinggi()
                    + "\n" + "Volume Tabung : " + String.format("%.2f", tabung.hitungVolumeTabung()) + " cm3");

          System.out.println();

          Kerucut kerucut = new Kerucut(14, 9);
          System.out.println("Menghitung Volume Kerucut");
          System.out.println(
                    "Jari-jari Kerucut : " + kerucut.getJariJari() + "\n" + "Tinggi Tabung : " + kerucut.getTinggi()
                              + "\n" + "Volume kerucut : "
                              + String.format("%.2f", kerucut.hitungVolumeKerucut()) + " cm3");
     }
}
//