package com.example.loading;

/**
 * 
 * @author zhaopengcheng
 *         <p>
 *         计算岛的周长
 *         </p>
 * 
 *
 */
public class IsLandCircumference {
	int[] dx = { 1, 0, -1, 0 };
	int[] dy = { 0, 1, 0, -1 };

	private boolean valid(int x, int y, int[][] grid) {
		if (0 <= x && x < grid.length && 0 <= y && y < grid[x].length) {
			return grid[x][y] == 0;
		}
		return true;
	}

	public int isLandPerimeter(int[][] grid) {
		int perimeter = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					for (int k = 0; k < 4; k++) {
						if (valid(i + dx[k], j + dy[k], grid)) {
							perimeter++;
						}
						System.out.println("current is:" + perimeter);
					}
				}
			}
		}
		return perimeter;
	}

}
