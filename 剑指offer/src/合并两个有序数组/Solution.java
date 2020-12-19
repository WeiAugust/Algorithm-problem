package 合并两个有序数组;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/7 11:00
 * @Version 1.0
 **/
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] numsCopy = new int[m];
        System.arraycopy(nums1, 0, numsCopy, 0, m);
        int i=0, j=0;
        int index=0;
        while (i < m && j < n) {
            nums1[index++] = numsCopy[i] < nums2[j] ? numsCopy[i++]:nums2[j++];
        }
        if (i < m) {
            System.arraycopy(numsCopy, i, nums1, i+j, m+n - i- j);
        }
        if(j < n){
            System.arraycopy(nums2, j, nums1, i+j, m+n - i- j);
        }
    }
}
