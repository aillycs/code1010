/**
 * #349 Intersection of Two Arrays
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
*/


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {   
        
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        
        Set<Integer> res = new HashSet<>();
 
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                res.add(nums2[i]);
            }          
        }
 
        
        int[] result = new int[res.size()];
        
        int s = 0;
        for (Integer n : res) {
            result[s++] = n;
        }
        
        return result;
    }
}