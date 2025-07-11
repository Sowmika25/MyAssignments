package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		 String test = "I am a software tester";
	        String[] words = test.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < words.length; i++) {
	            if (i % 2 != 0) { // odd index
	                String reversed = new StringBuilder(words[i]).reverse().toString();
	                result.append(reversed);
	            } else { // even index
	                result.append(words[i]);
	            }
	            result.append(" "); // add space between words
	        }

	        // Remove trailing space and print
	        System.out.println(result.toString().trim());
	}

}
