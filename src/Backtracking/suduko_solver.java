package Backtracking;
//very important must look before digital
public class suduko_solver {
	public static void main(String[]args) {
	int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		solver(grid,0,0);
		 
	}

	private static void solver(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		//first base condition
	if(col==9) {
		row++;
		col=0;
			
		}
		if(row==9) {
			display(grid);
			return;
			
		}
		if(grid[row][col]!=0) {
			solver(grid,row,col+1);//humme agle iteration me hi jaana padega takki uppser se check karta va ayaae
	}
		else {
			
			for(int val=1;val<=9;val++) {				
				if(isitpossible(grid,row,col,val)) {
					
					grid[row][col]=val;//cap
					solver(grid,row,col+1);//recurrsive call
//					System.out.println("hi");
					grid[row][col]=0;//backtracking
					
				};
			}
				
				
				
		}
		return;
		}
		
	
		
	
	
	private static boolean isitpossible(int[][] grid, int row, int col, int val) {
		
	// TODO Auto-generated method stub
		//rowise
		int c=col;
//		int r=row;
	for(int i=0;i<9;i++) {
		if(grid[i][c]==val) {
				return false;
			}
					}
		int r=row;
//		
		for(int i=0;i<9;i++) {
			if(grid[r][i]==val) {
				return false;
			}
			
	}
//		
//		//3*3 matrix
		r=row-row%3;
		c=col-col%3;
		for(int i=r;i<r+3;i++) {
		for(int j=c;j<c+3;j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
//		
		return true;
	}

	
	
	//public static boolean is_it_possible(int[][] grid, int row, int col, int val) {
//		// TODO Auto-generated method stub
//
//		// col
//
//		int r = 0;
//		while (r < 9) {
//			if (grid[r][col] == val) {
//				return false;
//			}
//			r++;
//
//		}
//
//		// row
//		int c = 0;
//		while (c < 9) {
//			if (grid[row][c] == val) {
//				return false;
//			}
//			c++;
//		}
//
//		// 3*3 Matrix
//		r = row - row % 3;
//		c = col - col % 3;
//		for (int i = r; i < r + 3; i++) {
//			for (int j = c; j < c + 3; j++) {
//				if (grid[i][j] == val) {
//					return false;
//				}
//
//			}
//
//		}
//
//		return true;
//	}
//	//display method
//
	private static void display(int[][] grid) {
		// TODO Auto-generated method stub
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
			System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
//		
	}

}




//public class Sudoku_Solver {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
//				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
//				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
//
//	       Sudoku(grid, 0, 0);
//	}
//
//	public static void Sudoku(int[][] grid, int row, int col) {
//
//		if (col >= 9) {
//
//			row++;
//			col = 0;
//		}
//
//		if (row >= 9) {
//			display(grid);
//			return;
//		}
//		// pehle se fill hai
//		if (grid[row][col] != 0) {
//			Sudoku(grid, row, col + 1);
//
//		} else {
//
//			for (int val = 1; val <= 9; val++) {
//				if (is_it_possible(grid, row, col, val)) {
//					grid[row][col] = val;
//					Sudoku(grid, row, col + 1);
//					grid[row][col] = 0;
//				}
//
//			}
//		}
//
//	}
//
//	public static boolean is_it_possible(int[][] grid, int row, int col, int val) {
//		// TODO Auto-generated method stub
//
//		// col
//
//		int r = 0;
//		while (r < 9) {
//			if (grid[r][col] == val) {
//				return false;
//			}
//			r++;
//
//		}
//
//		// row
//		int c = 0;
//		while (c < 9) {
//			if (grid[row][c] == val) {
//				return false;
//			}
//			c++;
//		}
//
//		// 3*3 Matrix
//		r = row - row % 3;
//		c = col - col % 3;
//		for (int i = r; i < r + 3; i++) {
//			for (int j = c; j < c + 3; j++) {
//				if (grid[i][j] == val) {
//					return false;
//				}
//
//			}
//
//		}
//
//		return true;
//	}
//
//	public static void display(int[][] grid) {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < grid.length; i++) {
//			for (int j = 0; j < grid.length; j++) {
//				System.out.print(grid[i][j] + " ");
//			}
//			System.out.println();
//
//		}
//
//	}
//
//}
