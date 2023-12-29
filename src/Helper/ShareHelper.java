/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Model.TaiKhoan;
import UI.LoginForms;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author Admin
 */
public class ShareHelper {

    //ảnh biểu tượng của ứng dụng, xuất hiện trên mọi cửa sổ
    public static final Image APP_ICON;

    static {         // Tải biểu tượng ứng dụng
        String file = "";
        APP_ICON = new ImageIcon(ShareHelper.class.getResource(file)).getImage();
    }

    public static boolean saveLogo(File file) {
        File dir = new File("logos");
        // Tạo thư mục nếu chưa tồn tại  
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
// Copy vào thư mục logos (đè nếu đã tồn tại)
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /*    Đọc hình ảnh logo chuyên đề 
 * @param fileName  là tên file logo 
 * @return ảnh đọc được
     */
    public static ImageIcon readLogo(String fileName) {
        File path = new File("src//image", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
    /*      * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */    public static TaiKhoan USER = null;

    /*       Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất /*       Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất 
     */ public static void logoff() {
        ShareHelper.USER = null;
    }

    /*    
 * Kiểm tra xem đăng nhập hay chưa 
 * @return đăng nhập hay chưa/*    
 * Kiểm tra xem đăng nhập hay chưa 
 * @return đăng nhập hay chưa
     */ public static boolean authenticated() {
        return ShareHelper.USER != null;
    }
    

}
