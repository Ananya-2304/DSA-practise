import java.awt.Color;
import javax.swing.*;
public class MainFrame extends JFrame{
    MainFrame(String name){
        this.setVisible(true);
        this.setSize(420,420);
        this.setResizable(false);
        this.setTitle(name);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("D:/chiguru/20230128_25931pmByGPSMapCamera.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0,0,0));
    }
    public static void main(String[] args){
        new MainFrame("Hello");
    }
}
