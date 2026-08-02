class Solution {
    public int findDuplicate(int[] nums) {
        /* int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp; */
         

         int s = 0,
         f = 0;
         do{
            s = nums[s];
            f = nums[nums[f]];
            if(s == f){
                break;
            }
         } while(s != f);
            int n1 = 0,
            n2 = s;
            while(n1 != n2){
                n1 = nums[n1];
                n2 = nums[n2];
            }
             return n1;
         
        
    }
    }
