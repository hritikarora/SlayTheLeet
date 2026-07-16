class Solution {
    public int nthUglyNumber(int n) {
        Long currentUgly = 1L;

        TreeSet<Long> uglyNumberSet = new TreeSet<>();
        uglyNumberSet.add(1L);

        for ( int i = 0; i < n; i++) {
            currentUgly = uglyNumberSet.pollFirst();

            uglyNumberSet.add(currentUgly*2);
            uglyNumberSet.add(currentUgly*3);
            uglyNumberSet.add(currentUgly*5);
        }
        return currentUgly.intValue();
    }
}