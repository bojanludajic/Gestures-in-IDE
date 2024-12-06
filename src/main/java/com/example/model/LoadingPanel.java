package com.example.model;

import javax.swing.*;
import java.awt.*;

public class LoadingPanel extends ScalablePanel {

    JLabel loadingLabel;
    private final int[] info = new int[4];
    private boolean loading;

    public LoadingPanel(int initialWidth, int initialHeight) {
        this.initialWidth = initialWidth;
        this.initialHeight = initialHeight;
        loading = false;

        setBackground(Color.gray);

        loadingLabel = new JLabel("Place me!", SwingConstants.CENTER);

        setLayout(null);

        add(loadingLabel);
    }

    @Override
    public void growRightLeft(int x, int y) {
        if(loading) return;

        super.growRightLeft(x, y);

        updateComponentBounds();
        updateInfo(x, y, width, height);
    }

    @Override
    public void growLeftRight(int x, int y) {
        if(loading) return;

        super.growLeftRight(x, y);

        updateComponentBounds();
        updateInfo(x, y, width, height);
    }

    @Override
    public void growBottomUp(int x, int y) {
        if(loading) return;

        super.growBottomUp(x, y);

        updateComponentBounds();
        updateInfo(x, y, width, height);
    }

    @Override
    public void growTopDown(int x, int y) {
        if(loading) return;

        super.growTopDown(x, y);

        updateComponentBounds();
        updateInfo(x, y, width, height);
    }

    private void updateComponentBounds() {
        int padding = Math.max(10, height / 20);

        int labelHeight = Math.max(30, height / 5);
        int labelWidth = width - 2 * padding;

        loadingLabel.setBounds(padding, padding, labelWidth, labelHeight);
    }

    private void updateInfo(int x, int y, int width, int height) {
        info[0] = x;
        info[1] = y;
        info[2] = width;
        info[3] = height;
    }

    public int[] getInfo() {
        loading = true;
        return info;
    }

}
