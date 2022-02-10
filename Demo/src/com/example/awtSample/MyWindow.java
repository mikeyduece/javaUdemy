package com.example.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSeriff", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSeriff", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("Java Dev Course", 60,60);
        g.setFont(sansSerifSmall);
        g.drawString("Mike Heft", 60,100);
    }
}
