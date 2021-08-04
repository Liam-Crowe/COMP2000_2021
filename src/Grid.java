// import javax.swing.*;
import java.awt.*;

public class Grid {
    public Grid() {
        int xCell = 20;
        int yCell = 20;
        cells = new Cell[xCell][yCell];
        int x, y = 0;
        for(int i = 0; i < xCell; i = i + 1) {
            x = 10;
            y = y + 35;
            for(int j = 0; j < yCell; j = j + 1) {
                cells[i][j] = new Cell(x,y);
                x = x + 35;
                }
            }
        }
    
    public void paint(Graphics g) {
        for(int i = 0; i < xCell; i = i + 1) {
            for(int j = 0; j < yCell; j = j + 1) {
                cells[i][j].paint(g);
            }
        }
    }
    int xCell, yCell;
    Cell[][] cells;
}