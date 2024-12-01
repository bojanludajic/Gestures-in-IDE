package com.example.model;

import com.example.interfaces.Scalable;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel implements Scalable {

    private int width = 200;
    private int height = 200;
    private Image background;

    public ImagePanel() {
        this.setSize(width, height);
        this.setBackground(null);
        display();
    }

    private void display() {
        File imagefile = new File("src/main/resources/meme.jpeg");
        try {
            background = ImageIO.read(imagefile);
        } catch (IOException e) {
            this.setBackground(Color.red);
            e.printStackTrace();
        }
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, width, height, this);
    }

    /*
       function  for growth f(x) = -(x / 350) + 2
       f(700) = 0 : right border = quarter size
       f(350) = 1 : middle = full size
    */
    @Override
    public void growRightLeft(int x, int y) {
        double factor = -((double) 1 / 350) * x + 2;
        factor = factor > 1 ? 1 : factor;

        width = (int) (50 + 150 * factor);
        height = (int) (50 + 150 * factor);

        this.setBounds(x - (width / 2), (int) (y - (height * 0.75)), width, height);
    }

    /*
        function  for growth f(x)= (x - 1) / (350 - 1)
        f(1) = 0 : left border = quarter size
        f(350) = 1 : middle of the screen = full size
     */
    @Override
    public void growLeftRight(int x, int y) {
        double factor = ((double) x - 1) / (350 - 1);
        factor = factor > 1 ? 1 : factor;

        width = (int) (50 + 150 * factor);
        height = (int) (50 + 150 * factor);

        this.setBounds(x - (width / 2), (int) (y - (height * 0.75)), width, height);
    }

    /*
        function  for growth f(x)= (500 - y) / 250
        f(500) = 0 : bottom border = quarter size
        f(250) = 1 : middle of the screen = full size
     */
    @Override
    public void growBottomUp(int x, int y) {
        double factor = ((double) 500 - y) / 250;

        factor = factor > 1 ? 1 : factor;
        width = (int) (50 + 150 * factor);
        height = (int) (50 + 150 * factor);

        this.setBounds(x - (width / 2), (int) (y - (height * 0.75)), width, height);
    }

    /*
        function  for growth f(x)= (x - 1) / (250 - 1)
        f(1) = 0 : top border = quarter size
        f(350) = 1 : middle of the screen = full size
     */
    @Override
    public void growTopDown(int x, int y) {
        double factor = ((double) y - 1) / (250 - 1);
        factor = factor > 1 ? 1 : factor;

        width = (int) (50 + 150 * factor);
        height = (int) (50 + 150 * factor);

        this.setBounds(x - (width / 2), (int) (y - (height * 0.75)), width, height);
    }

}
