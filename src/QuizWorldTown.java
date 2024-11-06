import java.util.Scanner;

public class QuizWorldTown {
    private Scanner scanner = new Scanner(System.in);
    private String answerFirst;
    private String answerSecond;
    private String answerThird;
    private int correctAnswer = 0;

    public void question() {
        System.out.println("1. What is the capital city of Germany? (Question with single answer, insert alphabet character)");
        System.out.println("a. Prague");
        System.out.println("b. Kodan");
        System.out.println("c. Berlin");
        System.out.print("Answer: ");
        answerFirst = scanner.nextLine();
        if (answerFirst.equals("c")) {
            correctAnswer++;
        }
        System.out.println(answerFirst + " (user input)");

        System.out.println("\n2. What is the capital city of Austria? (Question with single answer, insert alphabet character)");
        System.out.println("a. Wien");
        System.out.println("b. Washington");
        System.out.println("c. Warszava");
        System.out.print("Answer: ");
        answerSecond = scanner.nextLine();
        if (answerSecond.equals("a")) {
            correctAnswer++;
        }
        System.out.println(answerSecond + " (user input)");

        System.out.println("\n3. Which cities are in USA (Question with multiple answer, insert alphabet character)");
        System.out.println("a. New Mexico");
        System.out.println("b. Calgary");
        System.out.println("c. Dallas");
        System.out.println("d. Houston");
        System.out.print("Answer: ");
        answerThird = scanner.nextLine();

        String correctAnswerThird = "acd";
        char[] charAnswerThird = answerThird.toCharArray();
        int checkThirdAnswer = 0;

        for (char letter : charAnswerThird) {
            if (correctAnswerThird.contains(Character.toString(letter))) {
                checkThirdAnswer++;
            }
        }
        if (checkThirdAnswer == 3){
            correctAnswer++;
        }
        System.out.println(answerThird + " (user input)");
        System.out.println("\nCorrect answer " + correctAnswer + "/3");
    }

}
