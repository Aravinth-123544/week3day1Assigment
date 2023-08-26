package week3day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String test = "I am a software tester";
	        String[] words = test.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < words.length; i++) {
	            if (i % 2 == 1) { // Check if the index is odd
	                char[] chars = words[i].toCharArray();
	                for (int j = chars.length - 1; j >= 0; j--) {
	                    result.append(chars[j]);
	                }
	                result.append(" ");
	            } else {
	                result.append(words[i]).append(" ");
	            }
	        }

	        System.out.println("Reversed even words: " + result.toString().trim());
	    }
	
	}


