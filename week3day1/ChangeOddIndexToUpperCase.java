package week3day1;

public class ChangeOddIndexToUpperCase {
	 public static void main(String[] args) {
	        String test = "changeme";
	        char[] charArray = test.toCharArray(); // Convert the string to a character array
	        
	        for (int i = 0; i < charArray.length; i++) {
	            if (i % 2 != 0) { // Check if index is odd
	                charArray[i] = Character.toUpperCase(charArray[i]); // Convert to UpperCase
	            }
	        }
	        
	        String result = new String(charArray); // Convert the character array back to a string
	        System.out.println("Modified String: " + result);
	    }
	
	}


