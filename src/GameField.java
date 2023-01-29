import javax.swing.*;
import java.awt.*;
public class GameField extends JPanel {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = false;
    private boolean up = true;
    private boolean down = false;
    private boolean inGame = true;
    Image pic;
    public GameField(){
        ImageIcon obj = new ImageIcon("minimap.png");
        pic = obj.getImage();
    }


    public void loadImages(){
        JFrame frame = new JFrame();
        GameField pic = new GameField();
        frame.add(pic);
        ImageIcon imageIconApple = new ImageIcon("apple.png");
        apple = imageIconApple.getImage();
        ImageIcon imageIconDot = new ImageIcon("dot.png");
        dot = imageIconDot.getImage();
    }
}
