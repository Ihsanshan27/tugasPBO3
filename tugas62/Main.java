package tugas62;

public class Main {
     public static void main(String[] args) {
          Human human = new Human("Rizky Adam Kurniawan");
          LivingThing lt = new LivingThing();

          System.out.println(human.getName() + " " + lt.walk());

          System.out.println(human.getName() + " " + lt.breath());

          System.out.println(human.getName() + " " + lt.eat());
     }
}
