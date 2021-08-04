import java.awt.*;

public class Cell {
    public Cell(int xCell, int yCell) {
        x = xCell;
        y = yCell;
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 35, 35);
        g.setColor(Color.BLACK);
        g.drawRect(x , y, 35, 35);
    }

    int x, y;
}
