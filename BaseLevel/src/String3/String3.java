package String3;

public class String3 {
    public int countYZ(String str) {
        str = str.toLowerCase();
        int len = str.length();
        if (len == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && !Character.isLetter(str.charAt(i + 1)))
                count++;
        }
        if (str.charAt(len - 1) == 'y' || str.charAt(len - 1) == 'z')
            count++;
        return count;
    }

    public String withoutString(String base, String remove) {
        String res = "";
        int removelen = remove.length();
        char firstInRemove = Character.toLowerCase(remove.charAt(0));
        int i = 0;
        while (i <= base.length() - removelen) {
            if (Character.toLowerCase(base.charAt(i)) == firstInRemove && remove.equalsIgnoreCase(base.substring(i, i + removelen))) {
                res = res + base.substring(0, i);
                base = base.substring(i + removelen);
                i = 0;
            } else {
                i++;
            }
        }
        res = res + base;
        return res;
    }

    public boolean equalIsNot(String str) {
        int len = str.length();
        int countIs = 0;
        int i = 0;
        while (i <= len - 2 && str.indexOf("is", i) != -1) {
            countIs++;
            i = str.indexOf("is", i) + 2;
        }
        int countNot = 0;
        i = 0;
        while (i <= len - 3 && str.indexOf("not", i) != -1) {
            countNot++;
            i = str.indexOf("not", i) + 3;
        }
        return countIs == countNot;
    }

    public boolean gHappy(String str) {
        int len = str.length();
        if (len == 0)
            return true;
        if (len == 1)
            return str.charAt(len - 1) != 'g';
        if (str.charAt(0) == 'g' && str.charAt(1) != 'g')
            return false;
        if (str.charAt(len - 1) == 'g' && str.charAt(len - 2) != 'g')
            return false;
        for (int i = 1; i < len - 1; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i + 1) != 'g' && str.charAt(i - 1) != 'g')
                return false;
        }
        return true;
    }

    public int countTriple(String str) {
        int len = str.length();
        if (len < 3)
            return 0;
        int count = 0;
        for (int i = 0; i <= len - 3; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))
                count++;
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(str.substring(i, i + 1));
        }
        return sum;
    }

    public String sameEnds(String string) {
        int len = string.length();
        if (len < 2)
            return "";
        int max = 0;
        for (int i = 0; i <= len / 2 - 1; i++) {
            if (string.substring(0, i + 1).equals(string.substring(len - 1 - i)))
                max = i + 1;
        }
        return string.substring(0, max);
    }

    public String mirrorEnds(String string) {
        int len = string.length();
        for (int i = 0; i < len; i++) {
            if (!(string.charAt(i) == string.charAt(len - 1 - i)))
                return string.substring(0, i);
        }
        return string;
    }

    public int maxBlock(String str) {
        int len = str.length();
        if (len < 2)
            return len;
        int max = 1;
        int i = 0;
        while (i < len - 1) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                boolean flag = true;
                for (int j = i + 2; j < len; j++) {
                    if (str.charAt(j) != str.charAt(i)) {
                        if (j - i > max) {
                            max = j - i;
                        }
                        i = j;
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if (len - i > max) {
                        max = len - i;
                    }
                    i = len;
                }
            } else
                i++;
        }
        return max;
    }

    public int sumNumbers(String str) {
        int len = str.length();
        int sum = 0;
        int i = 0;
        while (i < len - 1) {
            if (Character.isDigit(str.charAt(i))) {
                boolean flag = true;
                for (int j = i + 1; j < len; j++) {
                    if (!Character.isDigit(str.charAt(j))) {
                        sum += Integer.parseInt(str.substring(i, j));
                        i = j;
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sum += Integer.parseInt(str.substring(i));
                    i = len;
                }
            } else {
                i++;
                if (i == len - 1 && Character.isDigit(str.charAt(i)))
                    sum += Integer.parseInt(str.substring(i));
            }
        }
        return sum;
    }

    public String notReplace(String str) {
        int index = str.indexOf("is");
        if (index == -1)
            return str;
        if (index == 0) {
            if (str.length() == 2)
                return "is not";
            if (!Character.isLetter(str.charAt(2)))
                return "is not" + notReplace(str.substring(2));
            return "is" + str.substring(2, 3) + notReplace(str.substring(3));
        }
        if (!Character.isLetter(str.charAt(index - 1)))
            return str.substring(0, index) + notReplace(str.substring(index));
        return str.substring(0, index + 1) + notReplace(str.substring(index+1));
    }
}
