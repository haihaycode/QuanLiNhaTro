/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

/**
 *
 * @author HAIP
 */
public class  CheckValidate {
    public boolean areAllNotEmpty(String... strings) {
    for (String str : strings) {
        if (str.trim().equals("")) {
            return false;
        }
    }
    return true;
}

}
