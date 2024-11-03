/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan12;
import java.awt.*;

/**
 *
 * @author rolis
 */
public class AwtTest1 {
    public AwtTest1() {
        Frame f = new Frame();
        Button btn = new Button("Button Test");
        btn.setBounds(80, 80, 100, 50);
        f.add(btn);
        f.setSize(300, 250);
        f.setTitle("AWT Test");
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        AwtTest1 awt = new AwtTest1();
    }
}
