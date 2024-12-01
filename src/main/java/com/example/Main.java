package com.example;

import com.example.model.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;


public class Main {
    static final int FRAME_WIDTH = 700;
    static final int FRAME_HEIGHT = 500;
    private static int direction = 1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setResizable(false);
        frame.setVisible(true);

        ImagePanel ip = new ImagePanel();
        frame.add(ip);
        ip.setVisible(false);

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();


                switch (direction) {
                    case 1:
                        ip.growRightLeft(mouseX, mouseY);
                        break;
                    case 2:
                        ip.growLeftRight(mouseX, mouseY);
                        break;
                    case 3:
                        ip.growTopDown(mouseX, mouseY);
                        break;
                    case 4:
                        ip.growBottomUp(mouseX, mouseY);
                        break;
                    default:
                        break;
                }
            }
        });

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                ip.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ip.setVisible(true);
            }
        });

    }
}