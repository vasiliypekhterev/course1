package Warmup1;

public class Warmup1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public int diff21(int n) {
        int dif = n - 21;

        if (dif > 0)
            return 2 * dif;

        return Math.abs(dif);
    }

    public boolean nearHundred(int n) {
        return (Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10);
    }

    public String backAround(String str) {
        Character last = str.charAt(str.length()-1);
        return last+str+last;
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean hasTeen(int a, int b, int c) {
        if(a>12 && a<20)
            return true;
        if(b>12 && b<20)
            return true;
        if(c>12 && c<20)
            return true;
        return false;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3)
            return false;
        return str.substring(1, 3).equals("ix");
    }

    public int close10(int a, int b) {
        if (Math.abs(a-10) > Math.abs(b-10))
            return b;
        if (Math.abs(a-10) < Math.abs(b-10))
            return a;
        return 0;
    }

    public boolean stringE(String str) {
        if (!str.contains("e"))
            return false;
        int count =0;
        for (int i=1;i<str.length();i++){
            if (str.charAt(i)== 'e')
                count++;
            if (count>3)
                return false;
        }
        return true;
    }

    public String everyNth(String str, int n) {
        int count = (str.length() - 1) / n;
        String res = String.valueOf(str.charAt(0));
        for (int i = 1; i <= count; i++)
            res = res + String.valueOf(str.charAt(n * i));
        return res;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking&&((hour<7)||(hour>20));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative)
            return (a<0)&&(b<0);
        return a*b<0;
    }

    public String frontBack(String str) {
        int l = str.length();
        if (l<2)
            return str;
        return str.charAt(l-1)+str.substring(1,l-1)+str.charAt(0);
    }

    public boolean or35(int n) {
        return (n%3==0)||(n%5==0);
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1<0&&temp2>100)||(temp2<0&&temp1>100);
    }

    public boolean loneTeen(int a, int b) {
        if (a>=13&&a<=19)
            return b<13||b>19;
        return (b>=13&&b<=19);
    }

    public String startOz(String str) {
        if (str.length()<2)
            return str;
        String prefix= str.substring(0,2);
        if (!String.valueOf(prefix.charAt(1)).equals("z"))
            prefix=prefix.substring(0,1);
        if (!String.valueOf(prefix.charAt(0)).equals("o"))
            prefix=prefix.substring(1,prefix.length());
        return prefix;
    }

    public boolean in3050(int a, int b) {
        return (a<=50&&a>=40&&b<=50&&b>=40)||(a<=40&&a>=30&&b<=40&&b>=30);
    }

    public boolean lastDigit(int a, int b) {
        return a%10==b%10;
    }

    public int sumDouble(int a, int b) {
        if (a==b)
            return 2*(a+b);
        return a+b;
    }

    public boolean makes10(int a, int b) {
        return (a==10||b==10||a+b==10);
    }

    public String notString(String str) {
        if (str.length()>=3&&str.substring(0,3).equals("not"))
            return str;
        return "not "+str;
    }

    public String front3(String str) {
        String front;
        if (str.length()>=3)
            front = str.substring(0,3);
        else
            front = str;
        return front+front+front;
    }

    public String front22(String str) {
        String front;
        if (str.length() >= 2)
            front = str.substring(0, 2);
        else
            front = str;
        return front + str + front;
    }

    public boolean in1020(int a, int b) {
        return (a<=20&&a>=10)||(b<=20&&b>=10);
    }

    public String delDel(String str) {
        if (str.length()>=4&&str.substring(1,4).equals("del"))
            return str.substring(0,1)+str.substring(4);
        return str;
    }

    public int intMax(int a, int b, int c) {
        int max=a;
        if (b>max)
            max=b;
        if (c>max)
            max =c;
        return max;
    }

    public int max1020(int a, int b) {
        if ((10>a||a>20)&&(10>b||b>20)){
            return 0;
        }
        if ((10>b||b>20)&&(10<=a&&a<=20)){
            return a;
        }
        if ((10>a||a>20)&&(10<=b&&b<=20)){
            return b;
        }
        if (a>b)
            return a;
        return b;
    }

    public String endUp(String str) {
        int len= str.length();
        if (len<3)
            return str.toUpperCase();
        return str.substring(0,len-3)+str.substring(len-3).toUpperCase();
    }
}
