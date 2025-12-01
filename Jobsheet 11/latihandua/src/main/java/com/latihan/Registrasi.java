package com.latihan;

import javax.swing.*;
import java.awt.event.*;

public class Registrasi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Registrasi Mahasiswa");
        frame.setSize(400, 350);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label Nama
        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(20, 20, 100, 25);
        frame.add(lblNama);

        // Input Nama
        JTextField txtNama = new JTextField();
        txtNama.setBounds(130, 20, 200, 25);
        frame.add(txtNama);

        // Label NIM
        JLabel lblNim = new JLabel("NIM:");
        lblNim.setBounds(20, 60, 100, 25);
        frame.add(lblNim);

        // Input NIM
        JTextField txtNim = new JTextField();
        txtNim.setBounds(130, 60, 200, 25);
        frame.add(txtNim);

        // Label Prodi
        JLabel lblProdi = new JLabel("Prodi:");
        lblProdi.setBounds(20, 100, 100, 25);
        frame.add(lblProdi);

        // Input Prodi
        JTextField txtProdi = new JTextField();
        txtProdi.setBounds(130, 100, 200, 25);
        frame.add(txtProdi);

        // Tombol Simpan
        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(20, 150, 140, 30);
        frame.add(btnSimpan);

        // Tombol Reset
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(190, 150, 140, 30);
        frame.add(btnReset);

        // TextArea untuk menampilkan hasil
        JTextArea areaHasil = new JTextArea();
        areaHasil.setBounds(20, 200, 330, 100);
        areaHasil.setEditable(false);
        frame.add(areaHasil);

        // EVENT : Simpan data
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText().trim();
                String nim = txtNim.getText().trim();
                String prodi = txtProdi.getText().trim();

                // VALIDASI INPUT KOSONG
                if (nama.isEmpty() || nim.isEmpty() || prodi.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Semua field harus diisi!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Jika valid: tampilkan data
                areaHasil.setText("Data Berhasil Disimpan:\n");
                areaHasil.append("Nama  : " + nama + "\n");
                areaHasil.append("NIM   : " + nim + "\n");
                areaHasil.append("Prodi : " + prodi + "\n");
                JOptionPane.showMessageDialog(frame, "Data berhasil disimpan!", "Sukses",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // EVENT : Reset form
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNama.setText("");
                txtNim.setText("");
                txtProdi.setText("");
                areaHasil.setText("");
            }
        });

        frame.setVisible(true);
    }
}
