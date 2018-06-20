public class BattleShip {
	private boolean[][] grid;

	public BattleShip() {
		grid = new boolean[10][10];
	}

	// places one unit fishing boat
	public void placeFishingBoat(int x, int y) {
		grid[x][y] = true;
	}

	public void placeCarrierBoat(int x, int y, String orientation) {
		String newOrientation = orientation.toLowerCase();

		try {
			if (orientation.equals("vertical"))

			{
				grid[x][y] = true;
				grid[x + 1][y] = true;
				grid[x - 1][y] = true;
			}

			else if (orientation.equals("horizontal")) {
				grid[x][y] = true;
				grid[x][y + 1] = true;
				grid[x][y - 1] = true;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(" cannnot place the boat ");
		}

	}

	public void printGrid() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void attack(int x, int y) {
		if (grid[x][y]) {
			System.out.println("hit");
		} else {
			System.out.println("miss");
		}
	}
}
