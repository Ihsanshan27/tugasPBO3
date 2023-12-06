public class test {

     public static void main(String[] args) {
          // Deklarasikan variabel
          double jariJari = 7;

          // Hitung volume bola
          double volume = (4 / 3) * Math.PI * Math.pow(jariJari, 3);

          String v = String.format("%.2f", volume);

          // Tampilkan hasil
          System.out.println("Volume bola dengan jari-jari " + jariJari + " cm adalah " + volume + " cm³");
          System.out.println(v);
     }
}