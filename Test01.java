package day02;

public class Test01 {

	public static void main(String[] args) {
		int[][] arr= new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<=arr[0].length; j++) {
				arr[i][j-1] = (4*i)+j;
				System.out.print(arr[i][j-1]);
			}
			System.out.println();
		}

		System.out.println("\n콩이 보고싶다\n");
		
		int[][] rotatedArr = new int[4][4];
		int n = rotatedArr.length;
		
		for(int i =0; i<rotatedArr.length; i++) {
			for(int j=0; j<rotatedArr[0].length; j++) {
				rotatedArr[i][j]=arr[n-1-j][i];
				System.out.print(rotatedArr[i][j]);
			}
			System.out.println();
			}
}
}