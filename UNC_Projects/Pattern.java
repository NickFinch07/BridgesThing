package UNC_Projects;
import bridges.connect.Bridges;
import bridges.validation.RateLimitException;

import java.io.IOException;

import bridges.base.Color;
import bridges.base.ColorGrid;

public class Pattern
{

	// SAMPLE PROBLEM: method to draw sample  (use this as a template)
	public static void drawSample(ColorGrid grid, Bridges bridges) throws RateLimitException, IOException {
		//Display a two-eyeballs pattern to the grid (two meager beady eyes -- how lame)
		// first eyeball
		grid.set(5, 6, new Color("yellow"));
		// second eyeball
		grid.set(5, 9, new Color("yellow"));
		// call to the Bridges object called ‘bridges’ -- set the data structure to the Grid type
		bridges.setDataStructure(grid);
		// call to the Bridges object called ‘bridges’ -- show the ColorGrid object called ‘grid’
		bridges.visualize();
	}  // end method drawSample()


    // YOUR METHODS (for problems 1 through 7)  HERE:
    // PROBLEM 1: method to draw horizontal stripes
    public void drawHorizontalStripes(ColorGrid grid, Bridges bridges, String color1, String color2) throws RateLimitException, IOException {
        for (int row = 0; row < grid.getHeight(); row++) {
            for (int col = 0; col < grid.getWidth(); col++) {
                if (row % 2 == 0) {
                    grid.set(row, col, new Color(color1));
                }
                if (row % 2 == 1) {
                    grid.set(row, col, new Color (color2));
                }
            }
        }
        bridges.setDataStructure(grid);
        bridges.visualize();
    }
	// PROBLEM 2: method to draw vertical stripes
    public void drawVerticalStripes(ColorGrid grid, Bridges bridges, String color1, String color2) throws RateLimitException, IOException {
        for (int col = 0; col < grid.getWidth(); col++) {
            for (int row = 0; row < grid.getHeight(); row++) {
                if (col % 2 == 0) {
                    grid.set(row, col, new Color(color1));
                }
                if (col % 2 == 1) {
                    grid.set(row, col, new Color (color2));
                }
            }
        }
        bridges.setDataStructure(grid);
        bridges.visualize();
    }


	// PROBLEM 3: method to draw checkerboard
    public void drawCheckerboard(ColorGrid grid, Bridges bridges, String color1, String color2) throws RateLimitException, IOException {
        int i = 0;
        for (int row = 0; row < grid.getHeight(); row++) {
            i++;
            for (int col = 0; col < grid.getWidth(); col++) {
                i++;
                if (i % 2 == 0) {
                    grid.set(row, col, new Color(color1));
                }
                if (i % 2 == 1) {
                    grid.set(row, col, new Color(color2));
                }
            }
        }
        bridges.setDataStructure(grid);
        bridges.visualize();
    }

	// PROBLEM 4: method to draw border
    public void drawBorder(ColorGrid grid, Bridges bridges, String color1, String color2) throws RateLimitException, IOException {
        for (int row = 0; row < grid.getHeight(); row++) {
            for (int col = 0; col < grid.getWidth(); col++) {
                if (row == 0 || row == (grid.getHeight() - 1) || col == 0 || col == (grid.getWidth() - 1)) {
                    grid.set(row, col, new Color(color1));
                }
                else {
                    grid.set(row, col, new Color(color2));
                }
            }
        }
        bridges.setDataStructure(grid);
        bridges.visualize();
    }
	// PROBLEM 5: method to draw X
    public void drawX(ColorGrid grid, Bridges bridges, String color1, String color2) throws RateLimitException, IOException {
        int i = 0;
        int j = grid.getHeight() - 1;
        int k = grid.getWidth() - 1;
        for (int row = 0; row < grid.getHeight(); row++) {
            j--;
            k--;
            i++;
            for (int col = 0; col < grid.getWidth(); col++) {
                if (row == i || col == i || row == j || col == k) {
                    grid.set(row, col, new Color(color1));
                }
                else {
                    grid.set(row, col, new Color(color2));
                }
            }
        }
        bridges.setDataStructure(grid);
        bridges.visualize();
    }
	// PROBLEM 6: method to draw diagonal split



	// PROBLEM 7: method to draw 4 quadrants



}  // end class
