/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Ozmond
 */
public class Logo extends JPanel {
    private Image logo;
    public Logo(){
       logo = new ImageIcon(getClass().getResource("/Gambar/logo.jpg")).getImage();
    }
    
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(logo, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
