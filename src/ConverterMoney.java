import java.util.Scanner;

public class ConverterMoney
{
    public static void main(String[] args)
    {
        double vnd=23000;
        double usd, result;

        Scanner sc=new Scanner(System.in);
        System.out.print("Amount: ");
        usd=sc.nextDouble();

        result=usd*vnd;

        System.out.println(usd+" USD = "+result+" VND");
    }
}
