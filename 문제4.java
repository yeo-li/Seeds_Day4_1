import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rectangle {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int width = Integer.parseInt(br.readLine());
    int height = Integer.parseInt(br.readLine());

    printRectangle(width, height);
  }

  private static void printRectangle(int width, int height) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }

}
