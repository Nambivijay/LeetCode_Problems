class Solution {
    public int reverse(int x) {
        long rev=0;
        int mod;
        while(x!=0)
        {
            mod=x%10;
            rev=rev*10+mod;
            x=x/10;
        }
                if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)rev;
    } 
}