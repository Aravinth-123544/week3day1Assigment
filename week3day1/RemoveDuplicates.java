package week3day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
        String[] words = text.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            int count = 1; // Initialize count for each word
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    if (count > 1) {
                        words[j] = ""; // Replace duplicate word with empty string
                    }
                }
            }
        }
        
        // Reconstruct the modified string without duplicate words
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word).append(" ");
            }
        }
        
        System.out.println("String without duplicate words: " + result.toString().trim());
    }
	
	}


