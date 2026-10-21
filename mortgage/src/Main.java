import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte PERCENTAGE=100;
        byte MONTHS=12;
        NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("et", "EE"));
Scanner scanner = new Scanner(System.in);
        System.out.print("Amount: ");
int amount = scanner.nextInt();
        System.out.print("Interest Rate: ");
        float rate = scanner.nextFloat();
System.out.print("How many years: ");
byte years = scanner.nextByte();

float monthlyInterestRate= rate /PERCENTAGE/MONTHS;
int numberOfPayments= years*MONTHS;

float rateIndex= (float) Math.pow(1+monthlyInterestRate,numberOfPayments);
float monthlyPayment= (float) amount*(monthlyInterestRate*rateIndex/(rateIndex-1));

System.out.println("Monthly payment: "+currency.format(monthlyPayment));
    }
}