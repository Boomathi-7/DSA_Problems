// Less runtime
class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){
            int num = nums[i];
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num > max2){
                max3 = max2;
                max2 = num;
            }
            else if (num > max3){
                max3 = num;
            }

            if (num < min1){
                min2 = min1;
                min1 = num;
            }
            else if (num < min2){
                min2 = num;
            }
        }
        return Math.max(max1*max2*max3, min1*min2*max1);
    }
}



// More runtime
class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        int res1 = nums[n-1]*nums[n-2]*nums[n-3];
        int res2 = nums[0]*nums[1]*nums[n-1];
        return Math.max(res1, res2);
    }
}


// Time limit exceeded for long array
class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n-2; i++){
            for (int j = i+1; j < n-1; j++){
                for (int k = j+1; k < n; k++){
                    int product = nums[i]*nums[j]*nums[k];
                    if (product > max){
                        max = product;
                    }
                }
            }
        }
        return max;
//     }
// }
