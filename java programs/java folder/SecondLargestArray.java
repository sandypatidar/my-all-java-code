import java.util.Arrays;
class LargeAr {
	static void Arr(int[] arrs) {
		Arrays.sort(arrs);
		System.out.println(arrs[arrs.length-2]);
	}

	public static void main(String[] args) {
		int [] n = {5,6,3,4,7,2};
		LargeAr.Arr(n);
	}
}