package homeworks;
import java.util.Scanner;

public class Computational {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("xの値を入力してください");
    int x = sc.nextInt();
    System.out.println("yの値を入力してください");
    int y = sc.nextInt();
    System.out.println("xとyの和は" + (x+y) + "です");
    System.out.println("xとyの差は" + (x-y) + "です");
    System.out.println("xとyの積は" + (x*y) + "です");
    System.out.println("xとyの商は" + (x/y) + "です");
  }
}
