package task1;
import java.util.*;


public class Numbergame {
	public static void main(String []arg) {
		Scanner sc =new Scanner(System.in);
		Random random=new Random();
		
		boolean playgame=true;
		int totalscore=0;
		int rounds=0;
		
		while(playgame) {
			rounds++;
			int randomNumber=random.nextInt(100)+1;
			int attempt=0;
			boolean correctGuess=false;
			int maxattempts=10;
			
			System.out.println("Round:"+rounds+"Guess The number between 1 and 100. You Have"+maxattempts+"Attempts.");
			
			while(!correctGuess && attempt<maxattempts)
			{
				attempt++;
				System.out.print("Attempt:"+attempt+" Enter Your guess:");
				int userguess=sc.nextInt();
				
				if(userguess<randomNumber)
				{
					System.out.println("Too Low!");
					
				}
				else if(userguess>randomNumber)
				{
					System.out.println("Too High!");
					
				}
				else
				{
					System.out.println("/bCongratulations! You've Guessesd The Number Correctly.");
					correctGuess=true;
					
				}
			}
			if(!correctGuess) {
				System.out.println("Sorry! You've used all "+maxattempts+"attempts.The correct number was "+randomNumber+".");
			}
			totalscore +=maxattempts-attempt+1;
				System.out.println("Do you want to play again?(yes/no): ");
				String response=sc.next();
				
				playgame=response.equalsIgnoreCase("yes");
			}
			System.out.println("Game Over. You've played"+rounds+"rounds.Your total score is"+totalscore+".");
			sc.close();
			
		}
	}

