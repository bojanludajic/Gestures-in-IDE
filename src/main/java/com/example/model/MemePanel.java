package com.example.model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MemePanel extends ScalablePanel {

    private Image background;

    public MemePanel() {
        getImage();
    }

    private void getImage() {
        File imagefile = new File("src/main/resources/meme.jpeg");
        try {
            background = ImageIO.read(imagefile);
        } catch (IOException e) {
            this.setBackground(Color.red);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, width, height, this);
    }

}
