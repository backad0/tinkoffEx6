import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int maxScore = in.nextInt();
        int[] minScores = new int[amount];
        int[] maxScores = new int[amount];
        int[] ranges = new int[amount];
        int maxId = 0;
        int maxMinElem = 0;
        int rangeOfMaxMinE = 0;
        int mid;
        int minSum = 0;
        for (int i = 0; i< amount; i++){
            minScores[i] = in.nextInt();
            maxScores[i] = in.nextInt();
            ranges[i] = maxScores[i] - minScores[i];
        }
        for (int i = 0; i< amount; i++){
            minSum += minScores[i];
        }
        int range = maxScore-minSum;


        for (int i = 0; i< amount; i++){
            System.out.print(minScores[i]);System.out.print(" ");
            System.out.print(maxScores[i]);System.out.print(" ");
            System.out.println(ranges[i]);

        }
        System.out.print(minSum);System.out.print(" ");System.out.print(range);
    }
}
