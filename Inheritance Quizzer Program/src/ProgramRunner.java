import java.util.Scanner;
import java.text.DecimalFormat;
public class ProgramRunner
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		public static void main(String[] args)
		{
			int counter = 0;
			int questionCounter = 0;
			System.out.println("Lets Test Your Inheritance Skills!/n");
			
			//first question
			System.out.println("If the code runs : ");
			System.out.println("		Holidays x = new Holidays()");
			System.out.println("		x.celebrates();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Families are Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user1Guess = userIntInput.nextInt();
			
			if(user1Guess == 1)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'Let the Festivities Begin!'");
					System.out.println();
					questionCounter++;
					
				}
			
			//second question
			System.out.println("If the code runs : ");
			System.out.println("		Holidays x = new Holidays()");
			System.out.println("		x.spendTimeWithFamily();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
	 		int user2Guess = userIntInput.nextInt();
			if(user2Guess == 3)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'Family is Always Great'");
					System.out.println();
					questionCounter++;
					
				}
			
			//third question
			System.out.println("If the code runs : ");
			System.out.println("		Holidays x = new Holidays()");
			System.out.println("		x.getsCandy();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user3Guess = userIntInput.nextInt();
			if(user3Guess == 5)
				{
					System.out.println("Correct! This Code will return an error");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					questionCounter++;
					
					System.out.println("It correctly returns an error because you do not have access to that method!");
					System.out.println();
					
				}
			
			//fourth question
			System.out.println("If the code runs : ");
			System.out.println("		Holidays x = new Halloween()");
			System.out.println("		x.getsCandy();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user4Guess = userIntInput.nextInt();
			if(user4Guess == 5)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'Error'");
					System.out.println();
					questionCounter++;
					
					
				}
			
			//fifth question
			System.out.println("If the code runs : ");
			System.out.println("		Holidays x = new Halloween()");
			System.out.println("		x.putsOnCostume();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - BOO! This Ghost Costume is Scary!");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user5Guess = userIntInput.nextInt();
			if(user5Guess == 5)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'Error'");
					System.out.println();
					questionCounter++;
					
				}
			
			//sixth question
			System.out.println("If the code runs : ");
			System.out.println("		Holidays x = new Halloween()");
			System.out.println("		x.celebrates();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user6Guess = userIntInput.nextInt();
			if(user6Guess == 2)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'Our Parties Go Hard'");
					System.out.println();
					questionCounter++;
				
				}
			
			//seventh question
			System.out.println("If the code runs : ");
			System.out.println("		Holidays x = new Halloween()");
			System.out.println("		x.spendTimeWithFamily();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user7Guess = userIntInput.nextInt();
			if(user7Guess == 3)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'Family Is Always Great'");
					System.out.println();
					questionCounter++;
					
				}
			
			//eighth question
			System.out.println("If the code runs : ");
			System.out.println("		Halloween x = new Halloween()");
			System.out.println("		x.spendTimeWithFamily();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user8Guess = userIntInput.nextInt();
			if(user8Guess == 3)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was 'Family Is Always Great'");
					System.out.println();
					questionCounter++;
					
				}
			
			//ninth question
			System.out.println("If the code runs : ");
			System.out.println("		Halloween x = new Halloween");
			System.out.println("		x.getsCandy();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user9Guess = userIntInput.nextInt();
			if(user9Guess == 4)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'Yay, More Sugar!'");
					System.out.println();
					questionCounter++;
				
				}
			
			//tenth question
			System.out.println("If the code runs : ");
			System.out.println("		Halloween x = new Halloween()");
			System.out.println("		x.putsOnCostume();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - BOO! This Ghost Costume Is Scary!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user10Guess = userIntInput.nextInt();
			if(user10Guess == 1)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'BOO! This Ghost Costume Is Scary!'");
					System.out.println();
					questionCounter++;
					
				}
			
			//11th question
			System.out.println("If the code runs : ");
			System.out.println("		Halloween x = new Halloween");
			System.out.println("		x.celebrates();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user11Guess = userIntInput.nextInt();
			if(user11Guess == 2)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'Our Parties Go Hard'");
					System.out.println();
					questionCounter++;
				
				}
			
			//twelfth question
			System.out.println("If the code runs : ");
			System.out.println("		Halloween x = new Holidays()");
			System.out.println("		x.celebrates();");
			
			System.out.println("What would the code return?");
			System.out.println("(1) - Let the Festivities Begin!");
			System.out.println("(2) - Our Parties Go Hard");
			System.out.println("(3) - Family is Always Great");
			System.out.println("(4) - Yay, More Sugar!");
			System.out.println("(5) - Error");
			int user12Guess = userIntInput.nextInt();
			if(user12Guess == 5)
				{
					System.out.println("Correct!");
					counter++;
					questionCounter++;
					
				}
			else
				{
					System.out.println("Unfortunately, you got it wrong");
					System.out.println("The Correct Answer Was: 'Error'");
					System.out.println();
					questionCounter++;
				
				}
			
			double score = counter;
			
			score = score/12;
			
			
			 DecimalFormat d = new DecimalFormat("00.0");
			// System.out.println(score);
			 
			// System.out.println(d.format(score * 100));
			 
			if(counter == 12)
				{
					System.out.println("USER! You Got A Perfect Score!");
					System.out.println("Your Score Was A: " + d.format(score * 100));
				}
			
			else if(counter >= 7)
				{
					System.out.println("You did alright, you got " + counter + "/" + questionCounter);
					System.out.println("Your Score Was A: " + d.format(score * 100));
				}
			else
				{
					
				}
		}
	}
