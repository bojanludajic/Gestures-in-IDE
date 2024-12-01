package com.example.model;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    private int width = 200;
    private int height = 200;

    public ImagePanel() {
        this.setSize(width, height);
        this.setBackground(Color.green);
    }

    /*
        function  for growth f(x) = -(x / 350) + 2
        f(700) = 0 : right border = quarter size
        f(350) = 1 : middle = full size
     */
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
    public void growTopDown(int x, int y) {
        double factor = ((double) y - 1) / (250 - 1);
        factor = factor > 1 ? 1 : factor;

        width = (int) (50 + 150 * factor);
        height = (int) (50 + 150 * factor);

        this.setBounds(x - (width / 2), (int) (y - (height * 0.75)), width, height);
    }

}
