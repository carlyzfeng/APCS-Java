public class Randp {
    private int[] nums;
    private int numsLeft;
	
    public Randp(int n) {
        nums = new int[n];
        numsLeft = n;
        initNums(n);
    }
	
    private void initNums(int n) {
        for(int i = 1; i<=n; i++) {
        		nums[i-1] = i;
        }
    }
	
    public int nextInt() {
        
        if (numsLeft == 0) {
        		return 0;
        }
        else {
        		numsLeft = numsLeft - 1;
        		int ran = (int) (Math.random() * (numsLeft));
        		int temp = nums[ran];
        		nums[ran] = nums[numsLeft];
        		nums[numsLeft] = temp;
        		return temp;
        }
        // Math.random() should never be called more than once
        // when this method is called.  Recursion is not allowed.
        
    }
}
