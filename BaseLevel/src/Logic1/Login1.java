package Logic1;

public class Login1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars<40)
            return false;
        if (isWeekend)
            return true;
        if (cigars<=60)
            return true;
        return false;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int bonus = 0;
        if (isBirthday)
            bonus =5;
        if(speed>80+bonus)
            return 2;
        if(speed>60+bonus)
            return 1;
        return 0;
    }

    public boolean love6(int a, int b) {
        return (a==6||b==6||a+b==6||Math.abs(a-b)==6);
    }

    public boolean more20(int n) {
        return n%20==1 ||n%20==2;
    }

    public boolean nearTen(int num) {
        return num%10<=2||num%10>=8;
    }

    public int teaParty(int tea, int candy) {
        if (tea<5 || candy<5)
            return 0;
        if (tea>=2*candy||candy>=2*tea)
            return 2;
        return 1;
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a+b==c||a+c==b||b+c==a;
    }

    public boolean lastDigit(int a, int b, int c) {
        if(a%10==b%10)
            return true;
        if(a%10==c%10)
            return true;
        if(c%10==b%10)
            return true;
        return false;
    }

    public int maxMod5(int a, int b) {
        if (a==b)
            return 0;
        int max=0;
        if (a>b)
            max =a;
        else
            max=b;
        if(a%5==b%5)
            return a+b-max;
        return max;
    }

    public int blueTicket(int a, int b, int c) {
        if(a+b==10||a+c==10||b+c==10)
            return 10;
        if (a-c==10||b-c==10)
            return 5;
        return 0;
    }

    public int dateFashion(int you, int date) {
        if(you<=2||date<=2)
            return 0;
        if(you>=8||date>=8)
            return 2;
        return 1;
    }

    public int sortaSum(int a, int b) {
        int sum=a+b;
        if (sum>=10&&sum<=19)
            return 20;
        return sum;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        boolean isInRange = n>=1&&n<=10;
        if (outsideMode)
            return !isInRange||n==1||n==10;
        return isInRange;
    }

    public boolean old35(int n) {
        return n%3==0 ^ n%5==0;
    }

    public int teenSum(int a, int b) {
        if ((a>=13&&a<=19)||(b>=13&&b<=19))
            return 19;
        return a+b;
    }

    public String fizzString(String str) {
        String result="";
        if (str.startsWith("f"))
            result="Fizz";
        if (str.endsWith("b"))
            result=result+"Buzz";
        if (result.isEmpty())
            return str;
        return result;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b>=c)
            return false;
        if (bOk)
            return true;
        return b>a;
    }

    public int redTicket(int a, int b, int c) {
        if(a==2&&b==2&&c==2)
            return 10;
        if(a==b){
            if(b==c)
                return 5;
            return 0;
        }
        if(c!=a)
            return 1;
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        if(a/10==b/10||a/10==b%10)
            return true;
        if(a%10==b/10||a%10==b%10)
            return true;
        return false;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp<60)
            return false;
        if(isSummer)
            return temp<=100;
        return temp<=90;
    }

    public String alarmClock(int day, boolean vacation) {
        if(vacation){
            if(day>=1&&day<=5)
                return "10:00";
            return "off";
        }
        if(day>=1&&day<=5)
            return "7:00";
        return "10:00";
    }

    public boolean specialEleven(int n) {
        return n%11<=1;
    }

    public boolean less20(int n) {
        return n%20==19||n%20==18;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        if (isMorning)
            return isMom;
        return true;
    }

    public String fizzString2(int n) {
        String word="";
        if(n%3==0)
            word="Fizz";
        if(n%5==0)
            word=word+"Buzz";
        if (word.isEmpty())
            return String.valueOf(n)+"!";
        return word+"!";
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        int bonus = equalOk ? 1 : 0;
        return a<b+bonus&&b<c+bonus;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles){
            if(die1==die2){
                if(die1!=6)
                    return die1+die2+1;
                return 7;
            }
        }
        return die1+die2;
    }

    public int greenTicket(int a, int b, int c) {
        if(a==b&&b==c)
            return 20;
        if(a==b||b==c||c==a)
            return 10;
        return 0;
    }

    public int sumLimit(int a, int b) {
        int sum=a+b;
        if (String.valueOf(sum).length()==String.valueOf(a).length())
            return sum;
        return a;
    }
}
