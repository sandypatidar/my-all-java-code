class InputArray {
	public static void main(String[] args) {
		int [] arr = {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21};
		int [] arr1 = new int[arr.length];
		int [] arr2 = new int[arr.length];
		int x = 0,y=0;
		for (int i = 0; i<arr.length; i++) {
			if(arr[i]%5==0) {
				arr1[x++] = arr[i];
			} else {
				arr2[y++] = arr[i];
			}
		}
		int z =0;
			for (int i = 0; i< y+x;i++ ) {
				if (i < y) {
				arr[i] = arr2[i];
				} else {
				arr[i] = arr1[z++];
				}
			}
			for (int a : arr ) {
				System.out.print(a+" ");
			}
	}
}