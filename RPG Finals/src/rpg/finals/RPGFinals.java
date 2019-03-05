package rpg.finals;
//import java.util.*;
import java.awt.*;
import javax.swing.*;

public class RPGFinals extends Panel{
    static String name = " ";
    public RPGFinals(){
        this.setBackground(Color.WHITE);
    } 
    public void paint(Graphics a){
        //grid lang po
        a.setColor(Color.lightGray);
        a.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        a.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        
        //for neyyymuu
        a.setColor(new Color(213, 213, 213));
        a.fillRect(100, 5, 400, 40);
        
        //feyssss...lol
        a.setColor(new Color(251, 233, 219));
        a.fillOval(220, 100, 150, 150);
        
        //aissssuu...lol 
        a.setColor(Color.white);
        a.fillOval(230, 163, 50, 40); //lep
        a.fillOval(310, 163, 50, 40); //rayt
        
        //aisssuuu... hailayt~
        a.setColor(new Color(93,33,9));
        a.drawOval(230, 163, 50, 40); //lep
        a.drawOval(310, 163, 50, 40); //rayt

        //pupil~
        a.setColor(new Color (93, 33, 9));
        a.fillOval(240, 173, 30, 20); //lep
        a.fillOval(320, 173, 30, 20); //rayt
        //kilay
        a.setColor(new Color (93, 33, 9));
        a.fillOval(248, 140, 28, 10); //lep
        a.fillOval(317, 140, 28, 10); //rayt

        //mouth :o
        a.setColor(new Color(238, 62, 62));
        a.fillArc(280, 195, 25, 28, 180, 180);

        //teeth :D
        a.setColor(Color.WHITE);
        a.fillArc(280, 200, 25, 16, 180, 180);
        
        //blushuu~~
        a.setColor(new Color(234, 153, 159));
        
        //upper bodeyyyy...lololol
        a.setColor(new Color (98, 218, 217));
        a.fillRoundRect(235, 250, 120, 120, 15, 15);
//        int[] b = { 210, 378, 290};
//        int[] c = { 250, 250, 380};
//        a.fillPolygon(b, c, 3);

        //lower bodeyyy...lololol
        a.setColor(Color.black);
        a.fillRoundRect(235, 330, 120, 75, 15, 15);

        //clowdsuu~
        
        
//        //panlakad.... LEFT1
//        a.setColor(Color.blue);
////        int[] d = { 243, 294, 235};
////        int[] e = { 317, 347, 480};
////        a.fillPolygon(d, e, 3);
//        a.fillRect(243, 370, 50, 50);

        //panlakad.... RIGHT1
        a.setColor(Color.black);
//        int[] f = { 294, 342, 350};
//        int[] g = { 347, 317, 480};
//        a.fillPolygon(f, g, 3);
        
       
        
        //wepoooonssssuuuuu...
        a.setColor(Color.black);
        //armouurrrruuuuuu...
        a.setColor(Color.black);
    
    
        a.setFont(new Font("Century Gothic", Font.BOLD, 20));
        a.setColor(new Color(65, 26, 9));
        a.drawString("                              Hello, "+name+"!", 30, 30);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame(" CREATE YOUR AVATAR");
        RPGFinals panel = new RPGFinals();

        frame.add(panel);
        frame.setSize(600, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        //user inputs
        name = JOptionPane.showInputDialog( "NAME YOUR AVATAR: ");
        JOptionPane.showMessageDialog(null, " Hello, " + name + "!");
        
    }
    
}
