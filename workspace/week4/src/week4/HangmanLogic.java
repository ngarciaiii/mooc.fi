/*
*
*
public class TestProgram {

	public static void main(String[] args) {
	
	    HangmanLogic l = new HangmanLogic("kissa");
	    System.out.println("Word at start: " + l.hiddenWord());
	
	    System.out.println("Let us guess: A, D, S, F, D");
	    l.guessLetter("A");
	    l.guessLetter("D");
	    l.guessLetter("S");
	    l.guessLetter("F");
	    l.guessLetter("D");
	    System.out.println("Guessed letterd: " + l.guessedLetters());
	    System.out.println("Number of faults: " + l.numberOfFaults());
	    System.out.println("Word is: " + l.hiddenWord());
	
	}
}
*
* 
*/




package week4;

public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
        
        if (!this.guessedLetters.contains(letter)) {
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
                this.guessedLetters = this.guessedLetters + letter;
            } else {
                this.guessedLetters = this.guessedLetters + letter;
            }
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        // return the hidden word at the end

        String hidden = "";
        int i = 0;
      
        while (i < this.word.length()) {
            char letter = this.word.charAt(i);
            String revealed = "" + letter;
            if (this.guessedLetters.contains(revealed)){
                hidden = hidden + letter;
            } else {
                hidden = hidden + "_";
            }
            i++;
        } return hidden;
    }
}
