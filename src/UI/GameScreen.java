package UI;

import UI.game_src.Environment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class GameScreen extends JFrame {
    int width_;
    int height_;
    int angle = 0;
    int step = 90;
    Environment environment_;
    Graphics2D fig;
    public GameScreen(String winTitle, int w, int h) {
        super(winTitle);
        width_ = w;
        height_ = h;
        setSize(width_, height_);
        environment_ = new Environment(0, 0, 0, 0, 10, 20);
        getContentPane().add(BorderLayout.CENTER, environment_);


    }
    public void initKeyListener(KeyListener key_listener) {

    }
    public void rotateFigure(String side) {
        if (side == "left") {
            angle-=45;
        }
        if (side == "right") {
            angle+=45;
        }
        repaint();
    }
}
