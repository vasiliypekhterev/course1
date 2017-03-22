package Home3;

import java.util.Random;

public class RunHome3 {
    static void Print(int[][] arr){
        int n = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println('\n');
        }
    }

    public static void main(String[] args) {
        Home3 instance = new Home3();
        String str = "Aa bb ca dc ca bb dd aa dd ef!";
        String result = instance.DuplicateWords(str);
        System.out.println(result);

        int n = 3;
        int[][] nums = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                nums[i][j] = rand.nextInt(20);
            }
        Print(nums);

        int angle = 180;
        int[][] res = instance.RotateN(nums, angle);
        Print(res);
    }
}
