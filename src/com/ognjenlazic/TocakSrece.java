package com.ognjenlazic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TocakSrece extends JFrame{
    private JButton zavrtiTocakPronadjiPitanjeButton;
    private JPanel panel1;
    private JLabel pitanje;

    public TocakSrece(List<String> listaPitanja) {
        setSize(1000, 300);
        setTitle("Točak Sreće UOP");
        setLocationRelativeTo(null);

        add(panel1);

        zavrtiTocakPronadjiPitanjeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indexPitanja = (int) ((Math.random() * (listaPitanja.size() - 0)) + 0);
                System.out.println(pitanje);

                String izvucenoPitanje = listaPitanja.get(indexPitanja);

                pitanje.setText(izvucenoPitanje);

            }
        });
    }
}
