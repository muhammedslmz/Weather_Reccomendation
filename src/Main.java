import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("What is the temperature? ");
        int C=input.nextInt();

        if(C<5)
        {
            System.out.println("You can go to ski.");
        }
        else if (C>=5&&C<15)
        {
            System.out.println("You can go to cinema.");
        }
        else if(C>=15 && C<25)
        {
            System.out.println("You can go to picnic with your friends.");
        }
        else if (C>=25)
        {
            System.out.print("You can go to swim.");
        }
    }
}
