public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Welcome to quiz Math Quiz.
                This quiz has 3 questions
                """);
        QuizMath quizMath = new QuizMath();
        QuizWorldTown quizWorldTown = new QuizWorldTown();

        quizWorldTown.question();
//        quizMath.question();
    }
}
