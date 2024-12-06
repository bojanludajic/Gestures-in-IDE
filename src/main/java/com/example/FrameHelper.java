package com.example;

import com.example.model.ComplexPanel;
import com.example.model.CustomFrame;
import com.example.model.LoadingPanel;

import java.awt.*;

public class FrameHelper {

    private final CustomFrame frame;
    private LoadingPanel lp;

    public FrameHelper(CustomFrame frame, LoadingPanel lp) {
        this.frame = frame;
        this.lp = lp;
    }

    public void loadComponents() {
        frame.setPanel(lp);

        ComplexPanel cp = new ComplexPanel();

        long loadingEndTime = System.currentTimeMillis() + 5 * 1000;
        long curTime;
        frame.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        do {
            curTime = System.currentTimeMillis();
        } while (curTime < loadingEndTime);

        int[] loadingPanelInfo = lp.getInfo();
        int x = loadingPanelInfo[0];
        int y = loadingPanelInfo[1];
        int width = loadingPanelInfo[2];
        int height = loadingPanelInfo[3];

        frame.unsetPanel(lp);
        frame.setCursor(Cursor.getDefaultCursor());
        cp.initializeComponents(x, y, width, height);
        frame.add(cp);
        frame.repaint();
    }

}
