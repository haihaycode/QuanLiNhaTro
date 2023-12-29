/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class XImage {

    public static Image getAppIcon() {
        URL url = XImage.class.getResource("D:\\DUANDAUTAY\\QuanLiNhaTro (1)\\src\\Image\\user (2).png");
        return new ImageIcon(url).getImage();
    }

    public static void saveFile(File src) {
        File dst = new File("logos", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();// Tạo thu mục
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING); // copy file vào thu mục logo
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
