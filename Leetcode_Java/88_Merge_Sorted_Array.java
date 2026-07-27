class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}

// Without Built-in Function
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++){
            nums1[i+m] = nums2[i];
        }
        for (int i = 0; i < m+n-1; i++){
            for (int j = 0; j < m+n-1-i; j++){
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
        System.out.println(nums1);
    }
}
