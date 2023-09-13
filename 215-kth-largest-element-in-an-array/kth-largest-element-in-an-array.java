class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Declare a pq to store minimum element at the beginning
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(a-b));


        for(int i : nums)
        {
            //Add the element to the queue
            pq.offer(i);
            //If the size of the pq is more than k then delete the first element (minimum element)
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
    //last element will be the kth largest element
        return pq.poll();
    }
}