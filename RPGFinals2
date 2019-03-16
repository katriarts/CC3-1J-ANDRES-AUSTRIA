package rpgfinals2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RPGFinals2 extends Panel implements KeyListener{
    static String name,gender, avatar;
    static Color color1, color2;
    static int y=0, x=0;
    public RPGFinals2(){        
        this.setBackground(Color.DARK_GRAY);
    }
    public void paint(Graphics a){
        //grid lang po...UwU
//        a.setColor(Color.lightGray);
//        for( int i=0; i<getWidth(); i+=25){
//            a.drawLine(i, 0, i, getHeight());
//            a.drawLine(0, i, getWidth(), i);
//        }
        /**character shape*/
        if(avatar == "Wizard" || avatar == "Witch"){
                /**arms*/
                a.setColor(color1);
                a.fillRoundRect(175+x,330+y, 40, 10, 5, 5);//left
                a.fillRoundRect(335+x, 330+y, 40, 10, 5, 5);//right
                a.setColor(color1.darker());
                a.fillRect(195+x,330+y, 20, 10);//left shadow
                a.fillRect(335+x, 330+y, 20, 10);//right shadow
                /**legs*/
                a.setColor(color1);
                a.fillRoundRect(235+x, 380+y, 10, 40, 5, 5);//left
                a.fillRoundRect(300+x, 380+y, 10, 40, 5, 5);//right
                a.setColor(color1.darker());
                a.fillRect(235+x, 380+y, 10, 20);//left shadow
                a.fillRect(300+x, 380+y, 10, 20);//right shadow
                /**body*/
                a.setColor(color1);
                a.fillOval(200+x, 250+y, 150, 150);
        }else if(avatar == "Knight"){
                /**arms*/
                a.setColor(color1);
                a.fillRoundRect(170+x,335+y, 40, 10, 5, 5);//left
                a.fillRoundRect(340+x, 335+y, 40, 10, 5, 5);//right
                a.setColor(color1.darker());
                a.fillRect(195+x,335+y, 20, 10);//left shadow
                a.fillRect(335+x, 335+y, 20, 10);//right shadow            
                /**legs*/
                a.setColor(color1);
                a.fillRoundRect(230+x, 390+y, 10, 40, 5, 5);//left
                a.fillRoundRect(305+x, 390+y, 10, 40, 5, 5);//right
                a.setColor(color1.darker());
                a.fillRect(230+x, 390+y, 10, 20);//left shadow
                a.fillRect(305+x, 390+y, 10, 20);//right shadow
                /**body*/
                a.setColor(color1);   
                a.fillRect(200+x, 250+y, 150, 150);
        }else if(avatar == "Mage"){
                /**arms*/
                a.setColor(color1);
                a.fillRoundRect(175+x,335+y, 40, 10, 5, 5);//left
                a.fillRoundRect(335+x, 335+y, 40, 10, 5, 5);//right
                a.setColor(color1.darker());
                a.fillRect(200+x,335+y, 20, 10);//left shadow
                a.fillRect(330+x, 335+y, 20, 10);//right shadow
                /**legs*/
                a.setColor(color1);
                a.fillRoundRect(230+x, 380+y, 10, 40, 5, 5);//left
                a.fillRoundRect(305+x, 380+y, 10, 40, 5, 5);//right
                a.setColor(color1.darker());
                a.fillRect(230+x, 380+y, 10, 20);//left shadow
                a.fillRect(305+x, 380+y, 10, 20);//right shadow
                a.setColor(color2);
                int[] f = {280+x, 171+x, 374+x};
                int[] g  = {215+y, 375+y, 375+y};
                a.fillPolygon(f, g, 3);
                /**body*/
                a.setColor(color1);
                int[] b = {280+x, 175+x, 370+x};
                int[] c = {220+y, 390+y,390+y};
                a.fillPolygon(b, c, 3);
                a.setColor(color2);
                int[] h = {280+x, 242+x, 315+x};
                int[] k = {220+y, 280+y, 280+y};
                a.fillPolygon(h, k, 3);
        }
        /**eyebrows*/
        if(gender == "Male"){
            a.setColor(Color.black.brighter());
            a.fillOval(220+x, 280+y, 35, 10);//left
            a.fillOval(295+x, 280+y, 35, 10);//right
        }/**eyelashes*/ 
        else if(gender =="Female"){
            a.setColor(Color.black.brighter());
            a.drawLine(230+x, 290+y, 230+x, 300+y);//left1
            a.drawLine(235+x, 290+y, 235+x, 299+y);//left2
            a.drawLine(240+x, 290+y, 240+x, 300+y);//left3
            a.drawLine(305+x, 290+y, 305+x, 300+y);//right1
            a.drawLine(310+x, 290+y, 310+x, 299+y);//right2
            a.drawLine(315+x, 290+y, 315+x, 300+y);//right3
        }
        /**eyes*/
        a.setColor(Color.WHITE);
        a.fillOval(215+x, 300+y, 45, 45);//left
        a.fillOval(290+x, 300+y, 45, 45);//right
        /**pupils*/
        a.setColor(Color.black.brighter());
        a.fillOval(230+x, 315+y, 15, 15);//left
        a.fillOval(305+x, 315+y, 15, 15);//right
        /**mouth*/
        a.setColor(new Color(238, 62, 62));
        a.fillArc(260+x, 330+y, 30, 35, 180, 180);
        /**teeth*/
        a.setColor(Color.WHITE);
        a.fillArc(267+x, 340+y, 15, 15, 180, 180);
        /**blush*/
        a.setColor(new Color(185, 7,7));
        a.drawLine(225+x, 346+y, 220+x, 351+y);//left1
        a.drawLine(230+x, 346+y, 225+x, 351+y);//left2
        a.drawLine(235+x, 346+y, 230+x, 351+y);//left3
        a.drawLine(240+x, 346+y, 235+x, 351+y);//left4
        a.drawLine(245+x, 346+y, 240+x, 351+y);//left5
        a.drawLine(305+x, 346+y, 300+x, 351+y);//right1
        a.drawLine(310+x, 346+y, 305+x, 351+y);//right2
        a.drawLine(315+x, 346+y, 310+x, 351+y);//right3
        a.drawLine(320+x, 346+y, 315+x, 351+y);//right4
        a.drawLine(325+x, 346+y, 320+x, 351+y);//right5 
  
        /**character class*/
        if(avatar == "Wizard"|| avatar == "Witch"){
            a.setColor(color2);
            int[] d = {274+x, 239+x, 309+x};
            int[] e = {180+y, 260+y, 260+y};
            a.fillPolygon(d, e, 3);
            a.setColor(color2.darker());
            a.fillRoundRect(230+x, 255+y, 90, 5, 5, 5);
            /**item*/
            a.setColor(color2.darker());
            a.fillRect(364+x, 278+y, 7, 75);
            a.setColor(color2);
            a.fillOval(350+x, 265+y, 35, 35);
            a.setColor(color2.brighter());
            a.fillOval(355+x, 268+y, 20, 20);
            a.fillOval(370+x, 290+y, 5, 5);
        }else if(avatar == "Knight"){
            a.setColor(color2);
            a.fillRoundRect(255+x, 250+y, 40, 50, 5, 5);
            a.fillRoundRect(195+x, 245+y, 160, 30, 5, 5);
            a.fillRoundRect(190+x, 245+y, 20, 150, 5, 5);
            a.fillRoundRect(340+x, 245+y, 20, 150, 5, 5);
            a.fillRoundRect(190+x, 360+y, 60, 45, 5, 10);
            a.fillRoundRect(300+x, 360+y, 60, 45, 5, 10);
            a.setColor(color2.darker());
            a.fillRect(190+x, 400+y, 60, 5);
            a.fillRect(300+x, 400+y, 60, 5);
            /**item*/
            a.setColor(color2.darker());
            a.fillRect(375+x, 325+y, 7, 35);
            a.fillRect(364+x, 320+y, 30, 7);
            a.setColor(color2);
            int[] k = {379+x, 367+x, 367+x, 392+x, 392+x};
            int[] l = {250+y, 260+y, 320+y, 320+y, 260+y};
            a.fillPolygon(k, l, 5);
            a.setColor(color2.brighter());
            a.fillRoundRect(370+x, 265+y, 6, 35, 5, 5);
            a.fillRoundRect(370+x, 305+y, 6, 6, 5, 5);
        }else if(avatar == "Mage"){
            a.setColor(color2);
            a.fillRect(172+x, 375+y, 202, 25);
            a.setColor(color2.darker());
            a.fillRect(172+x, 395+y, 202, 5);
            a.fillOval(265+x, 377+y, 15, 15);
            /**item*/
            a.setColor(color2);
            a.fillRect(367+x, 280+y, 10, 40);
            a.fillOval(355+x, 290+y, 35, 35);
            a.setColor(color2.darker());
            a.fillRect(356+x, 277+y, 34, 5);
            a.setColor(color2.brighter());
            a.fillOval(360+x, 295+y, 20, 20);
            a.fillOval(370+x, 317+y, 5, 5);
        }
        
        
        /** Header: for the name or drawString output.*/
        a.setColor(new Color(213, 213, 213));
        a.fillRect(100, 5, 400, 40);
        a.setColor(new Color(40, 38, 39));
        a.drawRect(100, 5, 400, 40);
        /** for the header output of class and name.*/
        a.setFont(new Font("DomCasual BT", Font.BOLD, 20));
        a.setColor(new Color(65, 26, 9));
//        a.drawString("                              Hello, "+avatar+" "+name+"!" +x +"bbbbb"+y, 30, 30);
        a.drawString("                              Hello, "+avatar+" "+name+"!", 30, 30);

    }

    private static Color changeComplex(String color1) {
        switch(color1){
            case "Pale": return new Color(248, 240, 233);
            case "Fair": return new Color(251, 233, 219);
            case "Tanned": return new Color(237, 175, 126);
            case "Dark": return new Color(208, 155, 109);
            default: break;
        } return null;
    }
    
    private static Color changeTheme(String color2) {
        switch(color2){
            case "Earth": return new Color(162, 250, 192);
            case "Water": return new Color(98, 218, 217);
            case "Air": return new Color(214, 239, 239);
            case "Fire": return new Color(185, 7,7);
        } return null;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("CREATE YOUR AVATAR");
        RPGFinals2 panel = new RPGFinals2();
        panel.addKeyListener(panel);
        /** user inputs*/
        name = JOptionPane.showInputDialog("Name Your Avatar: ");
        JOptionPane.showMessageDialog(null, " Hello, "+name+"!");

        /**character gender*/
        String[] pickGender = {"Male","Female"};
        String charGender = (String)JOptionPane.showInputDialog(null,"What is your Avatar's Gender?","GENDER", JOptionPane.QUESTION_MESSAGE,null,pickGender, pickGender[0]);
        gender = charGender;
        
        if(charGender == "Male"){
            String[] pickClass1 = {"Wizard", "Knight"};
            String charClass = (String)JOptionPane.showInputDialog(null,"What is your Avatar's Class?:", "AVAATR CLASS", JOptionPane.QUESTION_MESSAGE,null, pickClass1, pickClass1[0]);
            avatar = charClass;
            switch(avatar){
                case "Wizard": System.out.print("Wizard ");
                case "Warrior": System.out.print("Warrior ");
            }
        } else if(charGender == "Female"){
            String[] pickClass2 = {"Witch", "Mage"};
            String charClass = (String)JOptionPane.showInputDialog(null,"What is your Avatar's Class?:", "AVATAR CLASS", JOptionPane.QUESTION_MESSAGE,null, pickClass2, pickClass2[0]);
            avatar = charClass;
            switch(avatar){
                case "Witch": System.out.print("Witch ");
                case "Mage": System.out.print("Mage ");
            }
        }
        
        /**character complexion*/
        String[] pickColor1 = {"Pale","Fair", "Tanned","Dark"};
        String complexion = (String) JOptionPane.showInputDialog(null, "What is your Avatar's Complexion?: ", "COMPLEXION", JOptionPane.QUESTION_MESSAGE, null, pickColor1, pickColor1[0]);
        color1 = changeComplex(complexion);
        
        String[] pickColor2 = {"Earth","Water","Air","Fire"};
        String theme = (String) JOptionPane.showInputDialog(null, "What is your avatar's elemental theme?: ", "ELEMENTAL THEME", JOptionPane.QUESTION_MESSAGE,null, pickColor2, pickColor2[0]);
        color2 = changeTheme(theme);
    
    frame.add(panel);
    frame.setSize(600, 700);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            if(avatar == "Wizard"|| avatar == "Witch"){
                if(y <=-120){y = y;}
                else y -=10;
            }
            else if(avatar == "Knight"){
                if(y <=-190){y = y;}
                else y -=10;
            }
            else if(avatar == "Mage"){
                if(y <=-160){y = y;}
                else y -=10;
            } else {
            }
        }if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y+=10;
            if(y <=230){
                y = y;
            } else {
                y =230;
            }
        }if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x-=10;
            if(x == -380){
                x =380;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x+=10;
            if(x == 380){
                x = -380;
            }
        }repaint();
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    

    
    
}
