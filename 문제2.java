import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TemperatureConverter {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("문자열 입력: ");
    String input = br.readLine();

    if (isPalindrome(input)) {
      System.out.println("입력한 문자열은 팰린드롬입니다.");
    } else {
      System.out.println("입력한 문자열은 팰린드롬이 아닙니다.");
    }

  }

  private static boolean isPalindrome(String input) {
    int left = 0;
    int right = input.length() - 1;

    while (left < right) {
      char leftCharacter = Character.toUpperCase(input.charAt(left));
      char rightCharacter = Character.toUpperCase(input.charAt(right));
      if (leftCharacter != rightCharacter) {
        return false;
      }
      
      left++;
      right--;
    }

    return true;
  }
}
