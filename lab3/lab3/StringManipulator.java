package lab3;

//importing packages
import java.util.*;
import java.lang.String;

//class
public class StringManipulator {

	//main method
	public static void main(String[] args) {
		
		//getting string from user
		System.out.println("Enter the string to be manipulated");
		Scanner sc = new Scanner(System.in);
		String userIn = sc.nextLine();
		
		//creating commands
		String quit = "quit";
		String reverse = "print reverse";
		String replaceAll = "replace all";
		String replaceOne = "replace single";
		String remove = "remove";
			
		//while loop for user commands
		Boolean loop = true;
		while (loop) {
			
			//getting the command
			System.out.println("Enter your command (quit, print reverse, replace all, replace single, remove)");
			String command = sc.nextLine();
			
			//command = quit
			if (command.equalsIgnoreCase(quit) == true) {
				System.out.println("As you wish");
				loop = false;
			
			//command = reverse
			} else if (command.equalsIgnoreCase(reverse) == true) {
				String reverseString = "";
				for (int i = userIn.length() - 1; i >= 0; i--) {
					reverseString += userIn.charAt(i);
				}
				System.out.println(reverseString);
				
			//command = replace all
			} else if (command.equalsIgnoreCase(replaceAll) == true) {
				
				//tempUserIn will create new string that becomes userIn later
				String tempUserIn = "";
				System.out.println("Enter the character to replace (case sensitive)");
				String toReplaceAllStr = sc.nextLine();
				char toReplaceAll = toReplaceAllStr.charAt(0);
				System.out.println("Enter the new character");
				String replacementStr = sc.nextLine();
				char replacement = replacementStr.charAt(0);
				for (int i = 0; i < userIn.length(); i++) {
					if(toReplaceAll != userIn.charAt(i)) {
						tempUserIn += userIn.charAt(i);
					} else {
						tempUserIn += replacement;
					}
				}
				if(tempUserIn.equals(userIn) == true) {
					System.out.println("Error: character '" + toReplaceAll + "' " + "does not exist");
				} else {
					userIn = "" + tempUserIn;
					System.out.println("The new sentence is:" + userIn); 
										
				}
				
			//command = replace single
			} else if (command.equalsIgnoreCase(replaceOne) == true) {
				
				// asking user for info
				int whichChar = 1;
				String tempUserIn = "";
				System.out.println("Enter character to replace (case sensitive)");
				String toReplaceOneStr = sc.nextLine();
				char toReplaceOne = toReplaceOneStr.charAt(0);
				System.out.println("Enter the new character");
				String replacementStr = sc.nextLine();
				char replacement = replacementStr.charAt(0);
				System.out.println("Which '" + toReplaceOne + "' would you like to replace? (enter a number)");
				int charNum = sc.nextInt();
				String waste = sc.nextLine();
				for (int i = 0; i < userIn.length(); i++) {
					if(toReplaceOne != userIn.charAt(i)) {
						tempUserIn += userIn.charAt(i);
					} else if (toReplaceOne == userIn.charAt(i) && whichChar == charNum){
						tempUserIn += replacement;
						whichChar++;
					} else {
						tempUserIn += userIn.charAt(i);
						whichChar++;
					}
				}
				if(tempUserIn.equals(userIn) == true) {
					System.out.println("Error: character '" + toReplaceOne + "' " + "does not exist at position '" + charNum + "'");
				} else {
					userIn = "" + tempUserIn;
					System.out.println("The new sentence is:" + userIn); 
										
				}
				
			//command = remove
			} else if (command.equalsIgnoreCase(remove) == true) {
				
				String tempUserIn = "";
				System.out.println("Enter character to remove");
				String toRemoveStr = sc.nextLine();
				char toRemove = toRemoveStr.charAt(0);
				for (int i = 0; i < userIn.length(); i++) {
					if(toRemove != userIn.charAt(i)) {
						tempUserIn += userIn.charAt(i);
					}
				}
				if(tempUserIn.equals(userIn) == true) {
					System.out.println("Error: character does not exist");
				} else {
					userIn = "" + tempUserIn;
					System.out.println("The new sentence is:" + userIn); 
				}
			
			//if command isn't recognized 
			} else {
				System.out.println("Please enter a valid command.");
			}
		}
	}
}
