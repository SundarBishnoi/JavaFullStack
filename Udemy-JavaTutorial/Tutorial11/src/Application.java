public class Application {
	public static void main(String[] args) {
		int[] values = {2,3,4};
		System.out.println(values[2]);
		int[][] grid = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(grid[0][2]);
		String[][] texts = new String[2][3];
		texts[0][1] = "Hello There";
		System.out.println(texts[0][1]);
		for(int row=0;row<grid.length;row++) {
			for(int col=0;col<grid[row].length;col++) {
				System.out.print(grid[row][col]+"  ");
			}
			System.out.println();
		}
		String[][] words= new String[2][];
		System.out.println(words[0]);
		words[0]=new String[3];
		words[0][1]="hello";
		System.out.println(words[0][1]);
	}
}
