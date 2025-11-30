package com.latihan;
// JFrame

import javax.swing.JFrame;

public class Latihansatu {
    public static void main(String[] args) {
        // membuat objek jframe
        JFrame frame = new JFrame("Latihan saya");

        // mengatur ukuran jendela
        frame.setSize(600, 400);

        // menutup aplikasi ketika jendela ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // menampilkan jendela
        frame.setVisible(true);
    }
}
