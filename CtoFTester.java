public class CtoFTester{
  public static double celsiusToFahrenheit(double C) {
    return C * 1.8 + 32;
}
  public static double fahrenheitToCelsius(double F) {
    return (F - 32) / 1.8;
}
  public static void main(String[] args) {
    double F = 80;
    double C = 15;
    System.out.println ("Fahrenheit 80 = " + fahrenheitToCelsius(F) + "C");
    System.out.println ("Celsius 15 = " + celsiusToFahrenheit(C) + "F");
}
  }
