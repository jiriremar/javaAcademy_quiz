import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                \nWelcome to Quizer APP.
                This quiz has 3 questions
                """);
        Scanner scanner = new Scanner(System.in);
        QuizMath quizMath = new QuizMath();
        QuizWorldTown quizWorldTown = new QuizWorldTown();

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        String anotherQuiz = "y";

        while (anotherQuiz.contains("y")) {
            System.out.println("\nQUIZ LIST");
            System.out.println("1 - World town quiz");
            System.out.println("2 - Math quiz");
            System.out.print(name.toUpperCase() + ", choose one quiz: ");
            try {
                int chooseQuiz = scanner.nextInt();
                if (chooseQuiz == 1 || chooseQuiz == 2) {
                    if (chooseQuiz == 1) {
                        quizWorldTown.question(name);
                    }
                    if (chooseQuiz == 2) {
                        quizMath.question(name);
                    }
                    System.out.print("Another quiz y / n: ");
                    scanner.nextLine();
                    anotherQuiz = scanner.nextLine();
                } else {
                    System.out.println("\nInvalid choice please 1 or 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Spatna volba");
                scanner.nextLine();
            }
        }

        System.out.println("Thank you for using Quiz App\nBye!!!" );

    }
}
