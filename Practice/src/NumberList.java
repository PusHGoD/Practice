public class NumberList {
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
}
