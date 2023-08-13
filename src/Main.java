import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //select the currency you have
        System.out.println("What currency do you have?");

        BufferedReader currencyReader = new BufferedReader(new InputStreamReader(System.in));

        String currencyToBeConverted = currencyReader.readLine();

        System.out.println(currencyToBeConverted);

        //select the amount you have
        System.out.println("What's the amount of your current currency?");

        BufferedReader amountReader = new BufferedReader(new InputStreamReader(System.in));

        String ammountOfInitialCurrency = amountReader.readLine();

        System.out.println(ammountOfInitialCurrency);


        //select the currency you want to convert to
        System.out.println("What's the currency that you want to convert into");

        BufferedReader newCurrencyReader = new BufferedReader(new InputStreamReader(System.in));

        String newCurrency = newCurrencyReader.readLine();

        System.out.println(newCurrency);

        System.out.println("You want to convert " + ammountOfInitialCurrency + " " + currencyToBeConverted + " to "
        + newCurrency );

        //print the result
        Calculator calculator = new Calculator(currencyToBeConverted, ammountOfInitialCurrency, newCurrency);
        calculator.calculate();
    }
}