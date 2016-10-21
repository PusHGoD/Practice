public class NumberList {
	public static int findAvg(String a) {
		StringTokenizer stk = new StringTokenizer(a, " ");
		ArrayList arr = new ArrayList();
		while (stk.hasMoreTokens()) {
			arr.add(Integer.parseInt(stk.nextToken()));
		}
		Collections.sort(arr);
		int avg = arr.size() / 2;
		return (int) arr.get(avg);
	}

}
