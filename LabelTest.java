import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelTest extends JFrame{
    LabelTest(String name){
        this.setSize(800,800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("D:/JavaGUI/234628.png");
        this.setIconImage(icon.getImage());
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle(name);
        this.setResizable(false);
    }
    public static void main(String[] args){
        LabelTest frame = new LabelTest("Meow");
        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon("D:/JavaGUI/234628.png");
        Font myFont = new Font("Comic Sans MS",Font.ITALIC,50);
        Border myBorder = BorderFactory.createLineBorder(new Color(0,255,0));
        label.setBounds(0,0,700,600);
        label.setText("This is not so bad actually!!!");
        label.setFont(myFont);
        label.setForeground(new Color(0,255,0));
        label.setBackground(new Color(0,0,0));
        label.setOpaque(true);
        label.setBorder(myBorder);
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        frame.add(label);
    }
}
