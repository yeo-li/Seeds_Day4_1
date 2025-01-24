import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TemperatureConverter {

  static final int CELSIUS_TO_FAHRENHEIT = 1;
  static final int FAHRENHEIT_TO_CELSIUS = 2;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.print("변환할 방향 선택 (1: 섭씨→화씨, 2: 화씨→섭씨): ");
    int direction = 0;
    while (true) {
      direction = Integer.parseInt(br.readLine());
      if (isValid(direction)) {
        break;
      }
      System.out.println("잘못된 입력입니다");
    }

    double convertedTemperature = 0;
    if (direction == CELSIUS_TO_FAHRENHEIT) {
      System.out.print("섭씨 온도 입력: ");
      double celsius = Double.parseDouble(br.readLine());
      System.out.printf("변환 결과: %.2f°F\n", convertToFahrenheit(celsius));

    } else if (direction == FAHRENHEIT_TO_CELSIUS) {
      System.out.print("화씨 온도 입력: ");
      double fahrenheit = Double.parseDouble(br.readLine());
      System.out.printf("변환 결과: %.2f°C\n", convertToCelsius(fahrenheit));

    }
  }

  private static boolean isValid(int direction) {
    return CELSIUS_TO_FAHRENHEIT == direction || FAHRENHEIT_TO_CELSIUS == direction;
  }

  private static double convertToFahrenheit(double celsius) {
    return celsius * 1.8 + 32;
  }

  private static double convertToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

}
