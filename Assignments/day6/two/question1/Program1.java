package day6.two.question1;

public class Program1 {
	public static String getCapitalized(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedSentence.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ");
            }
        }
        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String inputSentence = "Now is the time to act!";
        String capitalizedSentence = getCapitalized(inputSentence);
        System.out.println(capitalizedSentence);
    }

}
