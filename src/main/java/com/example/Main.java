package com.example;

import com.example.model.CustomFrame;
import com.example.model.MemePanel;
import com.example.model.LoadingPanel;

public class Main {
    public static void main(String[] args) {
        CustomFrame frame = new CustomFrame();
        LoadingPanel lp = new LoadingPanel(500, 150);
        FrameHelper fh = new FrameHelper(frame, lp);

        fh.loadComponents();
    }
}

class MemeDemo {
    public static void main(String[] args) {
        CustomFrame frame = new CustomFrame();
        MemePanel ip = new MemePanel();

        frame.setPanel(ip);
    }

}