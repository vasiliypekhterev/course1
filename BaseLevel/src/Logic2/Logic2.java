package Logic2;

import java.util.*;

public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        if (goal/5>=big)
            return small>=goal-5*big;
        return small>=goal-5*(goal/5);
    }

    public int loneSum(int a, int b, int c) {
        if (a==b){
            if(b==c)
                return 0;
            return c;
        }
        if(a==c)
            return b;
        if(b==c)
            return a;
        return a+b+c;
    }

    public int luckySum(int a, int b, int c) {
        if (a==13)
            return 0;
        if(b==13)
            return a;
        if(c==13)
            return a+b;
        return a+b+c;
    }

    public int noTeenSum(int a, int b, int c) {
        a=fixTeen(a);
        b=fixTeen(b);
        c=fixTeen(c);
        return a+b+c;
    }

    public int fixTeen(int n){
        if(n<13||n>19)
            return n;
        if(n==15||n==16)
            return n;
        return 0;
    }

    public int roundSum(int a, int b, int c) {
        a=round10(a);
        b=round10(b);
        c=round10(c);
        return a+b+c;
    }

    public int round10(int num) {
        int remainder = num%10;
        if(remainder>=5)
            return num+10-remainder;
        return num-remainder;
    }

    public boolean closeFar(int a, int b, int c) {
        if (close(a,b)&&!close(a,c)&&!close(b,c))
            return true;
        if (close(a,c)&&!close(a,b)&&!close(b,c))
            return true;
        return false;
    }

    public boolean close(int a, int b){
        return Math.abs(a-b)<=1;
    }

    public int blackjack(int a, int b) {
        a=blackjackresult(a);
        b=blackjackresult(b);
        return (a>b) ? a: b;
    }

    public int blackjackresult(int n){
        if(n>21)
            return 0;
        return n;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int[] arr = new int[] {a,b,c};
        Arrays.sort(arr);
        return arr[2]-arr[1]==arr[1]-arr[0];
    }

    public int makeChocolate(int small, int big, int goal) {
        if (goal/5>=big)
            return small>=goal-5*big ? goal-5*big : -1;
        return small>=goal-5*(goal/5) ? goal-5*(goal/5) : -1;
    }

}
