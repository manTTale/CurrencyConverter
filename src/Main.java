import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader readerOther = new BufferedReader(new InputStreamReader(System.in));

        PersonalReader reader = new PersonalReader(readerOther, null);

        String currencyToBeConverted, ammountOfInitialCurrency, newCurrency;

        //select the currency you have
        System.out.println("What currency do you have?");
        currencyToBeConverted = reader.read();


        //select the amount you have
        System.out.println("What's the amount of your current currency?");
        ammountOfInitialCurrency = reader.read();

        //select the currency you want to convert to
        System.out.println("What's the currency that you want to convert into");
        newCurrency = reader.read();

        System.out.println("You want to convert " + ammountOfInitialCurrency + " " + currencyToBeConverted + " to "
                + newCurrency);

        //print the result
        Calculator calculator = new Calculator(currencyToBeConverted, ammountOfInitialCurrency, newCurrency);
        calculator.calculate();
    }
}