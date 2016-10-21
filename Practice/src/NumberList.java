public class NumberList {
<<<<<<< HEAD
	public int findAvg(String a){
	StringTokenizer stk = new StringTokenizer(a, " ");
		ArrayList arr = new ArrayList();
		while (stk.hasMoreTokens()) {
			arr.add(Integer.parseInt(stk.nextToken()));
		}
		Collections.sort(arr);
		int avg = arr.size()/2;
		for (Object obj : arr) {
			System.out.print(obj.toString()+"--");
		}
		
		return (int)arr.get(avg);
}
=======
	public int findMax(int[] nums){
		int max = 0;
		for(int i = 0; i < nums.length(); i++){
			if(nums[i] > max){
				max = num[i]			}
		{
		return max;
	}

>>>>>>> 7b1b12c2655cb30a6efcf7d6e05e795080c33b10
}
