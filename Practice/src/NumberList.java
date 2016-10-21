import java.util.Scanner;

public class NumberList {

	public static int getMin(int[] nums) {
		if (nums.length > 0) {
			int min = nums[0];
			int size = nums.length;
			for (int i = 1; i < size; i++) {
				if (nums[i] < min) {
					min = nums[i];
				}
			}
			return min;
		}
		return -1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input list size: ");
		int size = Integer.parseInt(sc.nextLine());
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Nums[" + (i + 1) + "]:");
			String input = sc.nextLine();
			if (input.matches("\\d+")) {
				nums[i] = Integer.parseInt(input);
			}
		}
		System.out.println("Max:" + findMax(nums));
		System.out.println("Min:" + getMin(nums));
		System.out.println("Avg:" + getMin(nums));
		sc.close();
	}
}
