import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserRegistration {

  public static void main(String[] args) throws Exception {

    String name = inputNameView();
    int age = inputAgeView();
    String email = inputEmailView();
    String password = inputPasswordView();

    User user = new User(name, age, email, password);
    
    System.out.println(user);
  }

  // inputView
  private static String inputNameView() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String name = br.readLine();
      if (validateName(name)) {
        return name;
      }
      System.out.println("유요하지 않은 입력입니다.");
    }
  }

  private static int inputAgeView() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String age = br.readLine();
      if (validateAge(age)) {
        return Integer.parseInt(age);
      }
      System.out.println("유요하지 않은 입력입니다.");
    }
  }

  private static String inputEmailView() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String email = br.readLine();
      if (validateEmail(email)) {
        return email;
      }
      System.out.println("유요하지 않은 입력입니다.");
    }
  }

  private static String inputPasswordView() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String password = br.readLine();
      if (validatePassword(password)) {
        return password;
      }
      System.out.println("유요하지 않은 입력입니다.");
    }
  }

  // validator
  private static boolean validateName(String name) {
    if (name.isBlank()) {
      return false;
    }

    return true;
  }

  private static boolean validateAge(String age) {
    if (!isNumber(age)) {
      return false;
    }
    if (0 > Integer.parseInt(age) || Integer.parseInt(age) > 150) {
      return false;
    }

    return true;
  }

  private static boolean isNumber(String age) {
    for (int i = 0; i < age.length(); i++) {
      if (!Character.isDigit(age.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  private static boolean validateEmail(String email) {
    return email.contains("@");
  }

  private static boolean validatePassword(String password) {
    return password.length() >= 8;
  }

  // model
  private static class User {

    private String name;
    private int age;
    private String email;
    private String password;

    public User(String name, int age, String email, String password) {
      this.name = name;
      this.age = age;
      this.email = email;
      this.password = password;
    }

    @Override
    public String toString() {
      return "[회원 정보]\n" + "이름: " + name + "\n" +
          "나이: " + age + "\n" +
          "이메일: " + email + "\n" +
          "비밀번호: " + password;
    }
  }
}
