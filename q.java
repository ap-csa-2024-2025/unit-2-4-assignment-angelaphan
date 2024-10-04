import java.util.Scanner;
public class q
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("give string");
        String s1 =input.nextLine();
        System.out.println("give another string");
        String s2=input.nextLine();
        System.out.println("give int");
        int n=input.nextInt();


        System.out.println(firstLastN(s1, s2, n));


    }
    public static String firstLastN(String s1, String s2, int n)
    {
        return "You gave me " + s1;

    }
}