package Warmup2;

import java.util.Arrays;

public class Warmup2 {

    public String stringTimes(String str, int n) {
        if(n==0)
            return "";
        if (n==1)
            return str;
        StringBuilder res = new StringBuilder(str);
        for (int i=1; i<=n-1;i++)
            res.append(str);
        return res.toString();
    }

    public String frontTimes(String str, int n) {
        String front;
        if (str.length()<=2) {
            front = str;
        }else
            front = str.substring(0,3);
        return stringTimes(front,n);
    }

    int countXX(String str) {
        int count=0;
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)=='x'&&str.charAt(i+1)=='x')
                count++;
        }
        return count;
    }

    int countXX1(String str) {
        int index= str.indexOf("xx");
        if (index==-1)
            return 0;
        return 1+countXX1(str.substring(index+1));
    }

    boolean doubleX(String str) {
        int index= str.indexOf('x');
        if (index==-1||index==str.length()-1)
            return false;
        return str.charAt(index+1)=='x';
    }

    public String stringBits(String str) {
        int len = str.length();
        if (len==0)
            return str;
        StringBuilder res = new StringBuilder(str.substring(0,1));
        int i=2;
        while (i<len){
            res.append(str.charAt(i));
            i+=2;
        }
        return res.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder res = new StringBuilder();
        for (int i=0;i<=str.length();i++)
            res.append(str.substring(0,i));
        return res.toString();
    }

    public int arrayCount9(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==9)
                count++;
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int len = nums.length;
        int i=0;
        while(i<len&&i<4){
            if (nums[i]==9)
                return true;
            i++;
        }
        return false;
    }

    public boolean array123(int[] nums) {
        int[] arr = {1,2,3};
        for(int i=0;i<nums.length-2;i++) {
            if(Arrays.equals(Arrays.copyOfRange(nums,i,i+3),arr))
                return true;
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int len= Math.min(a.length(),b.length());
        int count =0;
        for (int i=0;i<len-1;i++){
            if(a.substring(i,i+2).equals(b.substring(i,i+2)))
                count++;
        }
        return count;
    }

    public String stringX(String str) {
        int len= str.length();
        if(len<2)
            return str;
        StringBuilder res = new StringBuilder(str.substring(0,1));
        for(int i=1;i<len-1;i++){
            if(str.charAt(i)!='x')
                res.append(str.charAt(i));
        }
        return res.append(str.charAt(len-1)).toString();
    }

    public String altPairs(String str) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i%4==0||i%4==1)
                res.append(str.charAt(i));
        }
        return res.toString();
    }

    public String stringYak(String str) {
        int index = str.indexOf('y');
        if(index==-1||index>str.length()-3)
            return str;
        if(str.charAt(index+2)=='k')
            return str.substring(0,index) + stringYak(str.substring(index+3));
        return str.substring(0,index+1)+ stringYak(str.substring(index+1));
    }

    public int array667(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==6&&(nums[i+1]==6||nums[i+1]==7))
                count++;
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1]&&nums[i+1]==nums[i+2])
                return false;
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i=0;i<nums.length-2;i++){
            if(nums[i]+5==nums[i+1]&&Math.abs(nums[i+2]+1-nums[i])<=2)
                return true;
        }
        return false;
    }
}
