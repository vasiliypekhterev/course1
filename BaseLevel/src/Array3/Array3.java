package Array3;

import java.util.*;

public class Array3 {
    public int maxSpan(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if (!set.contains(nums[i])){
                set.add(nums[i]);
                for(int j=nums.length-1;j>=i;j--) {
                    if (nums[j] == nums[i]) {
                       if(j - i + 1 > max)
                            max = j - i + 1;
                       break;
                    }
                }
            }
        }
        return max;
    }

    public int[] fix34(int[] nums) {
        Set<Integer> set3 = new HashSet<Integer>();
        Set<Integer> set4 = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==3)
                set3.add(i);
            if(nums[i]==4)
                set4.add(i);
        }
        Integer[] indexArray4 = set4.toArray(new Integer[set4.size()]);
        Integer[] indexArray3 = set3.toArray(new Integer[set3.size()]);
        for(int i=0;i<indexArray3.length;i++) {
            int temp = nums[indexArray3[i]+1];
            nums[indexArray3[i]+1]=4;
            nums[indexArray4[i]]=temp;
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        Set<Integer> set4 = new HashSet<Integer>();
        Set<Integer> set5 = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==4&&nums[i+1]!=5)
                set4.add(i);
            if(nums[i]==5&&(i==0||nums[i-1]!=4))
                set5.add(i);
        }
        Integer[] indexArray5 = set5.toArray(new Integer[set5.size()]);
        Integer[] indexArray4 = set4.toArray(new Integer[set4.size()]);
        for(int i=0;i<indexArray4.length;i++) {
            int temp = nums[indexArray4[i]+1];
            nums[indexArray4[i]+1]=5;
            nums[indexArray5[i]]=temp;
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum += nums[i];
        if (sum%2!=0)
            return false;
        int diff=sum/2;
        for(int i=0;i<nums.length;i++){
            diff=diff-nums[i];
            if (diff==0)
                return true;
            if (diff<0)
                return false;
        }
        return true;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int start=0;
        for (int i=0;i<inner.length;i++){
           boolean find = false;
           for (int j=start;j<outer.length;j++) {
               if(outer[j]==inner[i]) {
                   start=j;
                   find =true;
                   break;
               }
           }
           if (!find)
               return false;
       }
       return true;
    }

    public int[] squareUp(int n) {
        int[][] arr = new int[n][n];
        for (int j=n-1;j>=0;j--){
            for (int i=n-1-j;i<n;i++){
               arr[i][j] = (i>=n-1-j) ? n-j : 0;
            }
        }
        int[] res = new int[n*n];
        for (int i=0;i<n*n;i++){
           res[i]=arr[i/n][i%n];
        }
        return res;
    }

    public int[] seriesUp(int n) {
        int[] res = new int[n*(n+1)/2];
        int index=0;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++){
               res[index]=j;
               index++;
            }
        }
        return res;
    }

    public int maxMirror(int[] nums) {
       int len = nums.length;
       for(int i=len;i>0;i--){
           for (int j=0;j<len+1-i;j++){
               int[] inverse = new int[i];
               for(int k=0;k<i;k++){
                   inverse[k]=nums[i+j-1-k];
               }
               for(int k=0;k<len+1-i;k++) {
                   if (Arrays.equals(Arrays.copyOfRange(nums,k,k+i),inverse))
                       return i;
               }
           }
       }
       return 0;
    }

    public int countClumps(int[] nums) {
        int len = nums.length;
        int count = 0;
        int i = 0;
        while (i < len - 1) {
            if (nums[i]==nums[i+1]) {
                boolean flag = true;
                for (int j = i + 2; j < len; j++) {
                    if (nums[j] != nums[i]) {
                        count++;
                        i = j;
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                    i = len;
                }
            } else
                i++;
        }
        return count;
    }

}
