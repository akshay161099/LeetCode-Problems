class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i = 0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        //for second set
        for(int i = 0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        Set<Integer> test = new HashSet<Integer>();
        for(int i = 0;i<nums1.length;i++)
        {
            if(!set2.contains(nums1[i]) && !test.contains(nums1[i]))
            {
                test.add(nums1[i]);
                first.add(nums1[i]);
            }
        }
        Set<Integer> test1 = new HashSet<Integer>();
        for(int i = 0;i<nums2.length;i++)
        {
            if(!set1.contains(nums2[i]) && !test1.contains(nums2[i]))
            {
                test1.add(nums2[i]);
                second.add(nums2[i]);
            }
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(first);
        list.add(second);
        return list;
    }
}
