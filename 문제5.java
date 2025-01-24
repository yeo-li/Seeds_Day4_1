import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CafeOrderCalculator {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("주문한 메뉴 개수 입력: ");
    int N = Integer.parseInt(br.readLine());

    double totalPrice = 0;
    System.out.println("메뉴 가격 입력 (각 메뉴당):");
    for (int i = 0; i < N; i++) {
      String price = br.readLine();
      if (!validatePrice(price)) {
        System.out.println("잘못된 입력입니다");
        return;
      }
      totalPrice += Integer.parseInt(price);
    }

    System.out.printf("총 합계: %.2f원\n", totalPrice);
    System.out.printf("부가세(10%%): %.2f원\n", totalPrice / 10.0);
    System.out.printf("최종 금액: %.2f원\n", totalPrice + totalPrice / 10.0);

  }

  private static boolean validatePrice(String price) {
    if (!isNumber(price)) {
      return false;
    }

    if (Integer.parseInt(price) < 0) {
      return false;
    }

    return true;
  }

  private static boolean isNumber(String input) {
    for (char c : input.toCharArray()) {
      if (!Character.isDigit(c)) {
        return false;
      }
    }
    return true;
  }

}
