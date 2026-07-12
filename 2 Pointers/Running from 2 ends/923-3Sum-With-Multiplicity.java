class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int numOfTuples = 0;
        Arrays.sort(arr);
        int mod = 1000000007;

        for ( int i = 0; i < arr.length-2; i++ ) {
            int ele1 = arr[i];
            int st = i + 1;
            int end = arr.length-1;
            
            while ( st < end ) {
                int sum = ele1 + arr[st] + arr[end];
                if ( sum == target ){
                    //case 1
                    if ( arr[st] == arr[end] ) {
                        int n = end - st + 1;
                        numOfTuples = ( numOfTuples + n * ( n-1 ) / 2 ) % mod;
                        break;
                    } else {
                        int lc = 1;
                        int rc = 1;
                        while (st+1 < end && arr[st] == arr[st + 1] ){
                            st++;
                            lc++;
                        }
                        while (end-1 > st && arr[end] == arr[end - 1] ) {
                            end--;
                            rc++;
                        }
                        numOfTuples = (numOfTuples + lc * rc) % mod;
                    }
                    st++;
                    end--;
                } else if ( sum > target ) {
                    end--;
                } else {
                    st++;
                }
            }
        }
        return numOfTuples;
    }
}