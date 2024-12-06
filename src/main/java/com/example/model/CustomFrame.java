package com.example.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomFrame extends JFrame {

    static final int FRAME_WIDTH = 700;
    static final int FRAME_HEIGHT = 500;
    private ScalablePanel panel;
    private int direction = 0;


    public CustomFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(300, 200);
        setTitle("Gestures in IDE");
        setResizable(false);
        setVisible(true);

        getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                if(panel == null) return;
                int mouseX = e.getX();
                int mouseY = e.getY();

                switch (direction) {
                    case 1:
                        panel.growRightLeft(mouseX, mouseY);
                        break;
                    case 2:
                        panel.growLeftRight(mouseX, mouseY);
                        break;
                    case 3:
                        panel.growTopDown(mouseX, mouseY);
                        break;
                    case 4:
                        panel.growBottomUp(mouseX, mouseY);
                        break;
                    default:
                        break;
                }
            }
        });

        getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                if(panel == null) return;
                panel.setSize(0, 0);
                panel.setVisible(false);
                setBackground(Color.RED);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if(panel == null) return;
                panel.setVisible(true);
                setBackground(Color.GREEN);

                int x = e.getX();
                int y = e.getY();

                if (x <= 20) {
                    direction = 2;
                } else if (x >= FRAME_WIDTH - 10) {
                    direction = 1;
                } else if (y <= 10) {
                    direction = 3;
                } else if (y >= FRAME_HEIGHT - 45) {
                    direction = 4;
                }
            }
        });

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                panel.setVisible(false);
            }
        });
    }

    public void setPanel(ScalablePanel panel) {
        this.panel = panel;
        add(panel);
    }

    public void unsetPanel(ScalablePanel panel) {
        remove(panel);
        this.panel = null;
    }

}
