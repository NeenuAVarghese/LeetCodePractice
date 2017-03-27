public class IntersectionOfArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> occurance = new HashMap<Integer, Integer>();
        List<Integer> subset = new ArrayList<Integer>();

        for(int i=0;i <nums1.length; i++){
            if(!occurance.containsKey(nums1[i])){
                occurance.put(nums1[i], 1);
            }
        }
        
        for(int i=0; i< nums2.length;i++){
            if(occurance.containsKey(nums2[i]) && !subset.contains(nums2[i])){
                subset.add(nums2[i]);
            }
        }
        
        int arr[] = new int[subset.size()];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = subset.get(i);
        }
        
        return arr;
    }
}