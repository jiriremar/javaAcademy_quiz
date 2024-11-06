import java.util.Scanner;

public class QuizMath {
    Scanner scanner = new Scanner(System.in);
    private String answerFirst;
    private String answerSecond;
    private String answerThird;
    private int correctAnswer = 0;

    public void question() {
        System.out.println("1. What is 2 + 2? (Question with single answer, insert alphabet character)");
        System.out.println("a. 5");
        System.out.println("b. 4");
        System.out.print("Answer: ");
        answerFirst = scanner.nextLine();
        if (answerFirst.equals("b")) {
            correctAnswer++;
        }
        System.out.println(answerFirst + " (user input)");

        System.out.println("\n2. What is 2 + 5? (Question with single answer, insert alphabet character)");
        System.out.println("a. 4");
        System.out.println("b. 7");
        System.out.print("Answer: ");
        answerSecond = scanner.nextLine();
        if (answerSecond.equals("b")) {
            correctAnswer++;
        }
        System.out.println(answerSecond + " (user input)");

        System.out.println("\n3. What is 4 = ? (Question with multiple answer, insert alphabet character)");
        System.out.println("a. 2^2");
        System.out.println("b. -2^2");
        System.out.println("c. 1 + 3");
        System.out.println("d. 4^1");
        System.out.print("Answer: ");
        answerThird = scanner.nextLine();

        String correctAnswerThird = "abcd";
        char[] charAnswerThird = answerThird.toCharArray();
        int checkThirdAnswer = 0;

        for (char letter : charAnswerThird) {
            if (correctAnswerThird.contains(Character.toString(letter))) {
                checkThirdAnswer++;
            }
        }
        if (checkThirdAnswer == 4){
            correctAnswer++;
        }
        System.out.println(answerThird + " (user input)");
        System.out.println("\nCorrect answer " + correctAnswer + "/3");
    }
}