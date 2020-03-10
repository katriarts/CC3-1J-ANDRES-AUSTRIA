package pacman;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.util.Random;
public class Pacman extends Panel implements KeyListener{
    
    static int y = 90, x = 100, sa = 23, mouth = 315;
    static int fx = 250, fy = 120;
    static int score = 0, count = 0;
    static Color color = Color.YELLOW;
    int red, green, blue;
    static Random rand = new Random();
    static Color food1; 
    static Color food2 = Color.WHITE;
//    static Color winner = Color.BLACK;
    
    public Pacman(){
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paint(Graphics g){
        //display "WINNER! OwO" kapag score>10
        if(count == 10){
            g.setFont(new Font("Kimmun", Font.BOLD, 25));
            g.setColor(Color.WHITE);
            g.drawString("WINNER! OwO", 110, 90);
        }
        //pagkain bruh~
        if(count <=9){
            red = rand.nextInt(255);
            green = rand.nextInt(255);
            blue = rand.nextInt(255);
            food1 = new Color(red, green, blue);
            g.setColor(food1);
            g.fillOval(fx, fy, 40, 40);
            g.setColor(food2);
            g.drawOval(fx, fy, 40, 40);
        }
        //si pacman...lol
        g.setColor(color);
        g.fillArc(x, y, 100, 100, sa, mouth);
        
        //iskorrrrr~~
        g.setFont(new Font("Kimmun", Font.BOLD, 15));
        g.setColor(Color.WHITE);
        g.drawString("SCORE: ", 10, 20);
        g.drawString(String.valueOf(score), 80, 20);
//        g.drawString(x+" and "+y, 30, 30);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Pacman panel = new Pacman();
        panel.addKeyListener(panel);
        frame.add(panel);
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_UP){
            if((x+50) == (fx+20)){
                if((y+50) == (fy+20)){
                    score+=1;
                    count+=1;
                    food1 = Color.BLACK;
                    if(food1 == Color.BLACK){
                        fx= (int) Math.random();
                        fy= (int) Math.random();
                    }
                    if(count == 10){
                        food1 = Color.BLACK;
                        food2 = Color.BLACK;
                        fx = 0;
                        fy = 0;
                    }
                }
            }
            //////////////////////////////
            if(y <= 0) y = (getHeight());
            else y-=5;
            sa = 113;
            //////////////////////////////
            if(y % 2 == 0)mouth = 360;
            else mouth = 315;
           //collision detection
           if (y >=5){
               y = y;
           }else y=5;
           
           if (fy >= 45){
                fy = +fy;
            }else fy = 45;
       }
       if(e.getKeyCode() == KeyEvent.VK_DOWN){
           if((x+50) == (fx+20)){
                if((y+50) == (fy+20)){
                    score+=1;
                    count+=1;
                    food1 = Color.BLACK;
//                    food2 = Color.BLACK;
                    if(food1 == Color.BLACK ){ 
                        fx= (int) Math.random();
                        fy= (int) Math.random();
                        
                    }
                    if(count == 10){
//                        winner = Color.WHITE;
                        food1 = Color.BLACK;
                        food2 = Color.BLACK;
                        fx = 0;
                        fy = 0;
                    }
                }
            }
            //////////////////////////////
           if(y >= (getHeight()-100))
               y=-90;
           else
               y+=5;                
           sa = 293;
           if(y % 2 == 0)
               mouth = 360;
           else
               mouth = 315;
           //collision detection
           if(y <= 160){
               y = y;
           }else y = 160;
           
           if(fy <= 105){
                fy = fy;
            }else fy = 105;
       }
       if(e.getKeyCode() == KeyEvent.VK_LEFT){
           if((x+50) == (fx+20)){
                if((y+50) == (fy+20)){
                    score+=1;
                    count+=1;
                    food1 = Color.BLACK;
//                    food2 = Color.BLACK;
                    if(food1 == Color.BLACK ){ //&& food2 == Color.BLACK){
                        fx= (int) Math.random();
                        fy= (int) Math.random();
                        
                       
                    }
                    if(count == 10){
//                        winner = Color.WHITE;
                        food1 = Color.BLACK;
                        food2 = Color.BLACK;
                        fx = 0;
                        fy = 0;
                    }
                    
                }
            }
            //////////////////////////////
           if(x <= -100)
               x= getWidth();
           else
               x-=5;
           sa = 203;
           if(x % 2 == 0)
               mouth = 360;
           else
               mouth = 315;
           //collision detection
           if(x>= 0){
               x = x;
           }else x = 0;
            if(fx >= 55){
                fx = fx;
            }else fx = 55;
           
       }
       if(e.getKeyCode() == KeyEvent.VK_RIGHT){
           if((x+50) == (fx+20)){
                if((y+50) == (fy+20)){
                    score+=1;
                    count+=1;
                    food1 = Color.BLACK;
//                    food2 = Color.BLACK;
                    if(food1 == Color.BLACK ){ //&& food2 == Color.BLACK){
                        fx= (int) Math.random();
                        fy= (int) Math.random();
                         
                    }
                    if(count == 10){
//                        winner = Color.WHITE;
                        food1 = Color.BLACK;
                        food2 = Color.BLACK;
                        fx = 0;
                        fy = 0;
                    }
                    
                }
            }
            //////////////////////////////
           if(x >= 285)
               x = -100;
//               x =+90;
           else
               x+=5;
           sa = 23;
           if(x % 2 == 0)
               mouth = 360;
           else 
               mouth = 315;
           
           //collision detection
           if(x<= 280){
               x = x;
           } else x = 280;
            if(fx >= 215){
                fx = fx;                
            }else 
                fx = 215;
       }
       
       repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
