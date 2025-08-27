public class CelsiusFahrenheit {
    public static void main(String[] args) {
        
        for (int i = 10; i <= 100; i += 10){
            int celsius = i;
            double fah = (9.0 / 5.0) * celsius + 32;
            System.out.printf("Celsius %d -> Fahrenheit %.1f \n", celsius, fah);
        }
    }
}
