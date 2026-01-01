import java.util.Scanner;
public class Task1
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int randomNum =(int)(Math.random()*100+1);
        System.out.println("Guess a number between 1 to 100:");
        int guess=sc.nextInt();
        int chance=1;
        while(guess!=randomNum)
        {
            if(guess<randomNum)
            {
                System.out.println("Your guess is too low");
            }
            else
            {
                System.out.println("Your guess is too high");
            }
            System.out.println("try again:");
            guess=sc.nextInt();
            chance++;
            if (chance == 10) 
            {
                System.out.println("Sorry,your chances are over 😢. Please try again later⌚");
                break;
            }  
        }
        if(guess==randomNum)
        {
            System.out.println("Congrats!!😍 You have guessed it right👍");
        }   
        System.out.println("if you want to play again press 1 rlse press 0");
        int wish=sc.nextInt();
        if(wish==1)
        {
            main(ar);
        }
        else
        {
            System.out.println("You have guesses it in "+chance+"chances");
            System.out.println("Thanking you for playing!1😁💕");
        }

    }

}