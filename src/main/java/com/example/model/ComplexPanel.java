package com.example.model;

import javax.swing.*;
import java.awt.*;

public class ComplexPanel extends JPanel {


    private JButton okButton;
    private JButton cancelButton;
    private JLabel textLabel;

    public ComplexPanel() {
        setBackground(Color.lightGray);
        setBorder(BorderFactory.createTitledBorder("UI Component"));

        setLayout(null);
    }

    public void initializeComponents(int x, int y, int width, int height) {
        setBounds(x - (width / 2), (int) (y - (height * 0.75)), width, height);

        int buttonHeight = height / 6;
        int buttonWidth = width / 4;
        int padding = height / 10;

        textLabel = new JLabel("I'm a complex panel!", SwingConstants.CENTER);
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(textLabel);
        textLabel.setBounds(padding, padding + buttonHeight / 2, width - 2 * padding, buttonHeight);

        okButton = new JButton("OK");
        okButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(okButton);
        okButton.setBounds(padding, height - buttonHeight - padding, buttonWidth, buttonHeight);

        cancelButton = new JButton("Cancel");
        cancelButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(cancelButton);
        cancelButton.setBounds(width - buttonWidth - padding, height - buttonHeight - padding, buttonWidth, buttonHeight);
    }


}
