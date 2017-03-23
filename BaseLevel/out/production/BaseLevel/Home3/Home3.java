package Home3;

import java.util.HashSet;
import java.util.Set;

public class Home3 {
    String DuplicateWords(String str) {
        int len = str.length();
        Character lastChar = str.charAt(len - 1);
        if (lastChar == '.' || lastChar == '!' || lastChar == '?') {
            str = str.substring(0, len - 1);
        } else {
            lastChar = null;
        }
        String[] words = str.split(" ");
        Set<String> set = new HashSet<String>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!set.contains(words[i])) {
                set.add(words[i].toLowerCase());
                res.append(words[i] + " ");
            }
        }
        String result = res.toString();
        len = result.length();
        result = result.substring(0, len - 1);
        if (lastChar != null) {
            result = result + lastChar;
        }
        return result;
    }


    private int[][] Rotate(int[][] matrix) {
        int len = matrix[0].length;
        int[][] res = new int[len][len];
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++) {
                res[i][j] = matrix[len - 1 - j][i];
            }
        return res;
    }

    int[][] RotateN(int[][] nums, int angle) {
        if (angle % 90 != 0) {
            System.out.println("Angle in not divided by 90");
            return null;
        }
        int count = (angle / 90) % 4;
        for (int i = 0; i < count; i++)
            nums = Rotate(nums);
        return nums;
    }
}
