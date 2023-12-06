package tugas63;

public class Main {
     public static void main(String[] args) {
          Koordinat koordinat = new Koordinat(2, 10, 5, 7);
          System.out.println(
                    "Garis yang melalui titik (" + koordinat.getX1() + "," + koordinat.getY1() + ")" + " dan ("
                              + koordinat.getX2() + "," + koordinat.getY2() + ") memiliki gradien sebesar "
                              + koordinat.hitungGradient());

          Koordinat koordinat1 = new Koordinat(5, 1, 3, 12);
          System.out.println(
                    "Garis yang melalui titik (" + koordinat1.getX1() + "," + koordinat1.getY1() + ")" + " dan ("
                              + koordinat1.getX2() + "," + koordinat1.getY2() + ") memiliki gradien sebesar "
                              + koordinat1.hitungGradient());
     }
}
