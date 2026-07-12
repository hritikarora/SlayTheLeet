class Solution {
    public boolean judgeSquareSum(int c) {
        if ( c == 0) return true;

        long left = 0;
        long right = (long) Math.sqrt(c);

        while ( left <= right ) {
            long l = left * left;
            long r = right * right;

            if ( l + r == c){
                return true;
            }
            else if ( l + r > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}