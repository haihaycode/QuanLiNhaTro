/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author GIGABYTE
 */
public class chonanh {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        // Nếu người dùng chọn một file
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Lấy đường dẫn đến file ảnh
            String imagePath = fileChooser.getSelectedFile().getPath();

            // Tạo đối tượng ImageIcon
            ImageIcon imageIcon = new ImageIcon(imagePath);

            // Tạo JLabel và thêm ảnh vào JLabel
            JLabel label = new JLabel();
            label.setIcon(imageIcon);
            frame.getContentPane().add(label, BorderLayout.CENTER);
        }

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}
