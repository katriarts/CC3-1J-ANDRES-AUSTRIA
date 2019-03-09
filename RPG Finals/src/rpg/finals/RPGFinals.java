package rpg.finals;

import java.awt.*;
import javax.swing.*;

public class RPGFinals extends Panel {
    static String name,gender, charClass, avatar = "";
    /**
     * declaration of String values for user to choose
     * which color is to be applied on their avatar.
     */
    //-------------EYES&HAIR--COMPLEXION----THEME
    static String pickColor1, pickColor2, pickColor3 = " ";
    static String color = " ";
    /**
     * color1: for setting the color of the eyes and hair.
     * color2: for setting the complexion.
     * color3: for setting the theme.
     */
    static Color color1, color2, color3;
    /** setting of background color*/
    public RPGFinals(){
        this.setBackground(Color.GRAY);
    } 
    public void paint(Graphics a){
        //grid lang po...UwU
//        a.setColor(Color.lightGray);
//        for( int i=0; i<getWidth(); i+=20){
//            a.drawLine(i, 0, i, getHeight());
//            a.drawLine(0, i, getWidth(), i);
//        }

        //para sa pangalan ng isang nilalang
        /** Header: for the name or drawString output.*/
        a.setColor(new Color(213, 213, 213));
        a.fillRect(100, 5, 400, 40);
        a.setColor(new Color(40, 38, 39));
        a.drawRect(100, 5, 400, 40);

        //bak heyrrr ~~
        /** back hair*/
        if(gender == "Female"){
            a.setColor(color1);
            a.fillArc(210, 85, 170, 150, 0, 180);
            a.fillRect(211, 150, 168, 160);
        }
        else if(gender == "Male"){
            a.setColor(color1);
            a.fillArc(210, 85, 170, 150, 0, 180);
            a.fillOval(210, 100, 170, 150);
        }
        
        //irs
        /** ears*/
        a.setColor(color2);
        a.fillOval(210, 163, 45, 45);//lep
        a.fillOval(335, 163, 45, 45);//rayt
        
        //feyssss...lol
        /** face*/
        a.setColor(color2);
        a.fillOval(220, 100, 150, 150);
        
        //prant heyrrr ~~
        /** front hair*/
        if(gender == "Female"){
            a.setColor(color1);
            a.fillArc(220, 100, 150, 115, 0, 180);
            a.setColor(color2);
            int[] b = {293, 275, 315};
            int[] c = {135, 210, 210};
            a.fillPolygon(b,c, 3);
        }
        else if(gender == "Male"){
            a.setColor(color1);
            a.fillArc(220, 100, 150, 115, 0, 180);
            a.setColor(color2);
            int[] d = {293, 275, 315};
            int[] f = {135, 210, 210};
            a.fillPolygon(d,f, 3);
        }
        
        //blushuuu...(////V////)
        /** blush*/
        a.setColor(new Color(185,7,7));
        a.drawLine(245, 206, 240, 212);//lep1
        a.drawLine(250, 206, 245, 212);//lep2
        a.drawLine(255, 206, 250, 212);//lep3
        a.drawLine(260, 206, 255, 212);//lep4
        a.drawLine(330, 206, 325, 212);//rayt1
        a.drawLine(335, 206, 330, 212);//rayt2
        a.drawLine(340, 206, 335, 212);//rayt3
        a.drawLine(345, 206, 340, 212);//rayt4
        
        //aissssuu...lol
        /** eyes*/
        a.setColor(Color.WHITE);
        a.fillOval(230, 163, 50, 40); //lep
        a.fillOval(310, 163, 50, 40); //rayt
        
        //pupil~ Yung gitna ngay sa mata...lol
        /** pupils*/
        a.setColor(color1);
        a.fillOval(235, 168, 40, 30); //lep
        a.fillOval(315, 168, 40, 30); //rayt
        
        //kilay
        /** eyebrows*/
        a.setColor(new Color (93, 33, 9));
        a.fillOval(248, 140, 28, 10); //lep
        a.fillOval(317, 140, 28, 10); //rayt

        //mouth :o
        /** mouth*/
        a.setColor(new Color(238, 62, 62));
        a.fillArc(280, 195, 25, 28, 180, 180);

        //teeth :D
        /** teeth*/
        a.setColor(Color.WHITE);
        a.fillArc(280, 200, 25, 16, 180, 180);
                

        //hanssszzz... ata...lol
        /** hands*/
        a.setColor(color2);
        a.fillRoundRect(250, 267, 35, 70, 15, 15);//lep
        a.fillRoundRect(298, 267, 35, 70, 15, 15);//rayt

        //upper bodeyyyy...lololol
        /** upper body*/
        a.setColor(color3);
//        a.fillArc(253, 247, 80, 150, 0, 180);
        a.fillRoundRect(262, 255, 60, 70, 15, 15);//shuuurt
        
        a.fillArc(246, 256, 35, 60, 0, 180);//lep arm
        a.fillArc(302, 256, 35, 60, 0, 180);//rayt arm
        
        a.setColor(color2);
        a.fillArc(280, 227, 25, 40, 180, 180);//neck-leeg

        //lower bodeyyy...lololol
        /** lower body*/
        a.setColor(Color.black);
        a.fillRect(262, 315, 60, 35);
        a.fillRoundRect(262, 320, 20, 120, 10, 10);//lep
        int[] g = {270, 270, 288};
        int[] h = {420, 440, 440};
        a.fillPolygon(g, h, 3);
        
        a.fillRoundRect(302, 320, 20, 120, 10, 10);//rayt
        int[] j = {317, 293, 317};
        int[] k = {420, 440, 440};
        a.fillPolygon(j, k, 3);
        
        
        
       
    /**
     * if wizard(M)|| witch(F): 
     *          cape, hat, potion/wand/staff
     * 
     * else Warrior: Knight(M)||Mage(F):
     *          armor, helm,, sword
     * 
     */
    
//    if(avatar == "Wizard"){
//        a.setColor(color3);
        
//    }
//    else if(avatar == "Warrior"){
//        a.setColor(color3);
//    }    
        /** for the header output of class and name.*/
        a.setFont(new Font("DomCasual BT", Font.BOLD, 20));
        a.setColor(new Color(65, 26, 9));
        a.drawString("                              Hello, "+avatar+" "+name+"!", 30, 30);
    }
    /**
     * Changing of eye and hair color
     * @param color1
     * @return chosen color/null
     */
    public static Color changeEH(String color1){
        switch(color1){
            case "Brown":
                return new Color(142, 59, 21);
            case "Gray":
                return new Color(165, 166, 148);  
            case "Black":
                return new Color(34, 21, 15);
            case "Blue":
                return new Color(65, 82, 128);
            case "Green":
                return new Color(123, 183, 143);              
            default:
                break;
        } return null;          
    }
    /**
     * Changing of complexion
     * @param color2
     * @return chosen color/null
     */
    public static Color changeSkin(String color2){
        switch(color2){
            case "Fair":
                return new Color(251, 233, 219);
            case "Tanned":
                return new Color(237, 175, 126);
            case "Dark":
                return new Color(208, 155, 109);
            default:
                break;
        } return null;
    }
    /**
     * Changing of Elemental theme
     * @param color3
     * @return chosen color/null
     */
    public static Color changeTheme(String color3){
        switch(color3){
            case "Pastel":
                return new Color(230, 236, 104);
            case "Neon":
                return new Color(165, 166, 148);
            case "Dark":
                return new Color(87, 28, 50);
            case "Natural":
                return new Color(191, 237, 206);
        } return null;
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame(" CREATE YOUR AVATAR");
        RPGFinals panel = new RPGFinals();
        
        /**
         * User Inputs
         */
        
        name = JOptionPane.showInputDialog( "Name your Avatar: ");
        JOptionPane.showMessageDialog(null, " Hello, " + name + "!");
        
        String[] pickGender = {"Male","Female"};
        String charGender = (String)JOptionPane.showInputDialog(null,"What is your Avatar's Gender?","Gender", JOptionPane.QUESTION_MESSAGE,null,pickGender, pickGender[0]);
        gender = charGender;
        
        String[] pickClass = {"Wizard", "Warrior"};
        String charClass = (String)JOptionPane.showInputDialog(null,"What is your Avatar's Class?:", "Avatar Class", JOptionPane.QUESTION_MESSAGE,null, pickClass, pickClass[0]);
        avatar = charClass;
        switch(avatar){
            case "Wizard":
                System.out.print("Wizard ");
            case "Warrior":
                System.out.print("Warrior ");
        }
        
        String[] pickColor1 = {"Brown", "Gray", "Black", "Blue","Green"};
        String eh = (String)JOptionPane.showInputDialog(null, "What Color is your Avatar's Eyes and Hair?: ","Colors",JOptionPane.QUESTION_MESSAGE,null,pickColor1,pickColor1[0]);
        color1 = changeEH(eh);
        
        String[] pickColor2 = {"Fair","Tanned","Dark"};
        String skin = (String) JOptionPane.showInputDialog(null,"What Color is your Avatar's Skin?:","Colors",JOptionPane.QUESTION_MESSAGE,null,pickColor2,pickColor2[0]);
        color2 = changeSkin(skin);
    
        String[] pickColor3 = {"Pastel", "Neon","Dark","Natural"};
        String theme = (String) JOptionPane.showInputDialog(null, "What Color is your Avatar's Clothing?:", "Colors", JOptionPane.QUESTION_MESSAGE,null,pickColor3,pickColor3[0]);
        color3 = changeTheme(theme);
          
        
//        frame.setLayout(new GridLayout(2,1));
//        frame.add(new Button("Ok"));
//        frame.add(new Button("Exit"));
        
        
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
