import java.util.Scanner;
public class Temperatureconvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        float celsius=sc.nextFloat();
        float fahrenheit=celsius*9/5+32;
        System.out.println("Temperature in fahrenheit: "+fahrenheit);
        sc.close();
    }
}
