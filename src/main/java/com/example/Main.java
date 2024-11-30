package com.example;

import com.example.model.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;



public class Main {
    static final int FRAME_WIDTH = 700;
    static final int FRAME_HEIGHT = 400;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);

        ImagePanel ip = new ImagePanel();
        frame.add(ip);
        ip.setBackground(Color.BLUE);
        ip.setVisible(false);

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {

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