class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        long sum = 0;
        long max = 0;
         HashMap<Integer, Integer> map = new HashMap<>();
          int dups = 0;
        for(int i = 0; i < k; i++){
           if(!map.containsKey(arr[i])){
            map.put(arr[i] , 0);
           }
            map.put(arr[i], map.get(arr[i]) + 1);
            sum = sum + arr[i];
            if(map.get(arr[i]) > 1){
                dups = dups + 1;
            }
        }
        if(dups == 0){
            max = Math.max(max, sum );
        }
        for(int i = k; i < arr.length; i++){
           int numtoadd = arr[i];
          int  numtoRemove = arr[i - k];
           if(!map.containsKey(numtoadd)){
            map.put(numtoadd, 0);
           }
           map.put(numtoadd, map.get(numtoadd) + 1);
           if(map.get(numtoadd) > 1){
                dups = dups + 1;
            }
            sum = sum + numtoadd;
            if(map.get(numtoRemove) > 1){
                dups = dups - 1;

            }
             map.put(numtoRemove, map.get(numtoRemove) - 1);
             sum = sum - numtoRemove;
             if(dups == 0){
                max = Math.max( max, sum);
             }
        }
        return max;
    }
}