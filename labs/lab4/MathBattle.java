import java.security.SecureRandom;

public class MathBattle {
    enum Result {WON,LOSS,DRAW};
    private static final int MIN_DICE_VALUE=1;
    private static final int MAX_DICE_VALUE=10;
    private static final int ERROR_TOLERANCE=2;
    private static final SecureRandom randomNumbers=new SecureRandom();

    public static void main(String[] args) {
        if (args.length!=3){
            System.out.println("The usage is java <playerName1> <playerName2> <numberOfRounds>");
            System.out.println("Error:There must be 3 arguments!");
            return;
        }
        String player1=args[0];
        String player2=args[1];
        int rounds=0;
        rounds = Integer.parseInt(args[2]);
        if (rounds<0){
            System.out.println("Error:The number of rounds must be positive");
            return;
        }
        System.out.println("MathBattle: "+player1+" vs. "+player2);
        int p1Score=0;
        int p2Score=0;
        for (int i=1;i<=rounds;i++){
            System.out.println("\n[Round "+i+"]");
            int p1Roll=MIN_DICE_VALUE+randomNumbers.nextInt(MAX_DICE_VALUE);
            int p2Roll=MIN_DICE_VALUE+randomNumbers.nextInt(MAX_DICE_VALUE);
            System.out.println(player1 + " rolls " + p1Roll);
            System.out.println(player2 + " rolls " + p2Roll);
            int p1Difficulty = mapToDifficulty(p1Roll);
            System.out.print(player1 + "'s question: ");
            int p1Expected = generateQuestion(p1Difficulty);
            int p1Guess = simulateGuess(p1Expected);
            boolean p1Correct = checkAnswer(p1Expected, p1Guess);
            if (p1Correct) p1Score++;
            printRoundResult(player1,p1Guess,p1Correct);
            int p2Difficulty=mapToDifficulty(p2Roll);
            System.out.print(player2+"'s question: ");
            int p2Expected=generateQuestion(p2Difficulty);
            int p2Guess = simulateGuess(p2Expected);
            boolean p2Correct = checkAnswer(p2Expected, p2Guess);
            if (p2Correct) p2Score++;
            printRoundResult(player2,p2Guess,p2Correct);
        }
        System.out.println("\n==FINAL SCORES==");
        printSummary(player1,player2,p1Score,p2Score);
    }
    public static int mapToDifficulty(int dice){
        if (dice<=3) return 1;
        else if (dice<=7) return 2;
        else return 3;
    }
    public static int generateQuestion(int difficultyLevel){
        int a,b,operator,result=0;
        switch (difficultyLevel){
            case 1:
                a = randomNumbers.nextInt(10);
                b = randomNumbers.nextInt(10);
                if (randomNumbers.nextInt(2)==0){
                    System.out.println(a+" + "+b+" = ?");
                    result=a+b;
                }else {
                    System.out.println(a+" - "+b+" = ?");
                    result=a-b;
                }
                break;
            case 2:
                a=randomNumbers.nextInt(20);
                b=randomNumbers.nextInt(20);
                operator=randomNumbers.nextInt(3);
                if (operator==0){
                    System.out.println(a+" + "+b+" = ?");
                    result=a+b;
                }
                else if (operator==1){
                    System.out.println(a+" - "+b+" = ?");
                    result=a-b;
                }
                else {
                    System.out.println(a+" * "+b+" = ?");
                    result=a*b;
                }
                break;
            case 3:
                a=21+randomNumbers.nextInt(79);
                b=21+randomNumbers.nextInt(79);
                operator=randomNumbers.nextInt(5);
                if (operator==1){
                    System.out.println(a+" + "+b+" = ?");
                    result=a+b;
                }
                else if (operator==2){
                    System.out.println(a+" - "+b+" = ?");
                    result=a-b;
                }
                else if (operator==3) {
                    System.out.println(a+" * "+b+" = ?");
                    result=a*b;
                }
                else if (operator==4){
                    System.out.println(a+" / "+b+" = ?");
                    result=a/b;
                }
                else {
                    System.out.println(a+" % "+b+" = ?");
                    result=a%b;
                }
                break;
        }
        return result;
    }
    public static boolean checkAnswer(int expected,int guess){
        return Math.abs(expected-guess)<=ERROR_TOLERANCE;
    }
    public static int simulateGuess(int correctAnswer){
        boolean bias = randomNumbers.nextBoolean();
        return simulateGuess(correctAnswer,bias);
    }
    public static int simulateGuess(int correctAnswer,boolean bias){
        if (bias){
            int deviation=randomNumbers.nextInt(7)-3;
            return correctAnswer+deviation;
        }else {
            int deviation=randomNumbers.nextInt(11)-5;
            return correctAnswer+deviation;
        }
    }
    public static void printRoundResult(String playerName,int guess,boolean isCorrect){
        System.out.println(playerName+" guessed "+guess);
        if (isCorrect){
            System.out.println("Correct!Within the tolerance.");
        }else {
            System.out.println("Wrong answer!");
        }
    }
    public static void printSummary(String player1,String player2,int score1,int score2){
        System.out.println(player1+": "+score1);
        System.out.println(player2+": "+score2);
        if (score1>score2){
            System.out.println(player1+" "+Result.WON+"S!");
            System.out.println(player2+" "+Result.LOSS+"S!");
        }
        else if (score2>score1){
            System.out.println(player2+" "+Result.WON+"S!");
            System.out.println(player1+" "+Result.LOSS+"S!");
        }else {
            System.out.println("It is a "+Result.DRAW+"!");
        }
    }
}
