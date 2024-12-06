package com.example.model;


import com.example.interfaces.Scalable;

import javax.swing.*;
/**
    This class implements the {@code Scalable} interface and provides it to
    inheriting classes. The class also contains a method for moving and
    resizing the panel based on the current mouse location.
 */
abstract public class ScalablePanel extends JPanel implements Scalable {


    protected int initialWidth = 200;
    protected int initialHeight = 200;
    protected int width;
    protected int height;

    public void updateBounds(int x, int y, double factor) {
        width = (int) (initialWidth * 0.25 + initialWidth * 0.75 * factor);
        height = (int) (initialHeight * 0.25 + initialHeight * 0.75 * factor);
        this.setBounds(x - (width / 2), (int) (y - (height * 0.75)), width, height);
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

        updateBounds(x, y, factor);
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

        updateBounds(x, y, factor);
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

        updateBounds(x, y, factor);
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

        updateBounds(x, y, factor);
    }

}