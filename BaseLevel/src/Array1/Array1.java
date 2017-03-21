package Array1;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        return nums[0]==6||nums[nums.length-1]==6;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0]==b[0]||a[a.length-1]==b[b.length-1];
    }

    public int[] reverse3(int[] nums) {
        int[] res = new int[3];
        int len = nums.length;
        for (int i=0;i<len;i++)
            res[i]=nums[len-1-i];
        return res;
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] res = new int[] {a[1],b[1]};
        return res;
    }

    public boolean no23(int[] nums) {
        boolean is2=true;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==2)
                is2=false;
        }
        boolean is3=true;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==3)
                is3=false;
        }
        return is2&&is3;
    }

    public int[] fix23(int[] nums) {
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==2&&nums[i+1]==3)
                nums[i+1]=0;
        }
        return nums;
    }

    public int[] makeMiddle(int[] nums) {
        int len = nums.length;
        int[] res = new int[] {nums[len/2-1],nums[len/2]};
        return res;
    }

    public int[] midThree(int[] nums) {
        int len = nums.length;
        int[] res = new int[] {nums[(len+1)/2-2],nums[(len+1)/2-1],nums[(len+1)/2]};
        return res;
    }

    public boolean unlucky1(int[] nums) {
        int len = nums.length;
        if (len<2)
            return false;
        if (nums[0]==1&&nums[1]==3)
            return true;
        if (nums[1]==1&&nums[2]==3)
            return true;
        if(nums[len-2]==1&&nums[len-1]==3)
            return true;
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        int len=nums.length;
        return len>=1&&nums[0]==nums[len-1];
    }

    public int sum3(int[] nums) {
        return nums[0]+nums[1]+nums[2];
    }

    public int[] maxEnd3(int[] nums) {
        if (nums[0]>nums[2]){
            nums[1]=nums[0];
            nums[2]=nums[0];
        }
        else{
            nums[0]=nums[2];
            nums[1]=nums[2];
        }
        return nums;
    }

    public int[] makeEnds(int[] nums) {
        int len = nums.length;
        int[] res = new int[] {nums[0],nums[len-1]};
        return res;
    }

    public int[] makeLast(int[] nums) {
        int len = nums.length;
        int[] res = new int[2*len];
        res[2*len-1]=nums[len-1];
        return res;
    }

    public int start1(int[] a, int[] b) {
        int count=0;
        if(a.length>0 && a[0]==1)
            count++;
        if(b.length>0 && b[0]==1)
            count++;
        return count;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] res = new int[] {a[0],a[1],b[0],b[1]};
        return res;
    }

    public int maxTriple(int[] nums) {
        int len=nums.length;
        int a = nums[0];
        int b = nums[(len-1)/2];
        int c = nums[len-1];
        int max =a;
        if (b>max)
            max=b;
        if(c>max)
            max=c;
        return max;
    }

    public int[] make2(int[] a, int[] b) {
        int[] res = new int[2];
        int len = a.length;
        if (len==0){
            res[0]=b[0];
            res[1]=b[1];
            return res;
        }
        if (len==1){
            res[0]=a[0];
            res[1]=b[0];
            return res;
        }
        res[0]=a[0];
        res[1]=a[1];
        return res;
    }

    public int[] makePi() {
        int[] pi = new int[] {3,1,4};
        return pi;
    }

    public int[] rotateLeft3(int[] nums) {
        int[] res = new int[] {nums[1],nums[2],nums[0]};
        return res;
    }

    public int sum2(int[] nums) {
        int len = nums.length;
        if (len==0)
            return 0;
        if (len==1)
            return nums[0];
        return nums[0]+nums[1];
    }

    public boolean has23(int[] nums) {
        if (nums[0]==2||nums[1]==2)
            return true;
        return nums[0]==3||nums[1]==3;
    }

    public boolean double23(int[] nums) {
        if (nums.length<2)
            return false;
        if (nums[0]==nums[1])
            return nums[0]==2||nums[0]==3;
        return false;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int suma=a[0]+a[1];
        int sumb=b[0]+b[1];
        if (sumb>suma)
            return b;
        return a;
    }

    public int[] swapEnds(int[] nums) {
        int len=nums.length;
        int temp = nums[0];
        nums[0]=nums[len-1];
        nums[len-1]=temp;
        return nums;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length<2)
            return nums;
        int[] res = new int[] {nums[0],nums[1]};
        return res;
    }

    public int[] front11(int[] a, int[] b) {
        int len=0;
        if (a.length==0){
            if(b.length==0){
                return new int[0];
            }
            int[] res = new int[] {b[0]};
            return res;
        }
        if(b.length==0){
            int[] res = new int[] {a[0]};
            return res;
        }
        int[] res = new int[] {a[0],b[0]};
        return res;
    }
}

