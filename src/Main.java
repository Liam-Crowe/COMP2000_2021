import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    public class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g);
        }
    }

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grid = new Grid();
        Canvas canvas = new Canvas();
        setContentPane(canvas);
        pack();
        setVisible(true);
    }

    Grid grid;
}
