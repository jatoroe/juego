/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Estudiante
 */
public class NewPanel extends JPanel implements ActionListener, MouseListener {
    private Timer timer;
    private int x,y;
    private int secx;
    
    public NewPanel(){ 
    this.x = 150;
    this.y = 50;
    this.secx = 0;
    
    this.timer = new Timer(50, this);
    this.addMouseListener(this);
    addKeyListener(new TAdapter());
    setFocusable(true);
    
    timer.start();    
    }
    @Override
    protected void paintComponent(Graphics g){       
           
        super.paintComponent(g);
        g.drawImage(loadImage("fondo.png"), 0, 0,1000,350,this);
        g.drawImage(loadImage("cats.gif"),x,200,x+132,280,secx*132,0,132*secx+132,80, this);
        /*
        g.setColor(Color.blue);
        g.fillRect(600, 130, 160 , 200);
        g.setColor(Color.red);
        g.drawRect(0, y, 40, 50);
        g.drawString("Player 1", 0, 30);
        g.setColor(Color.blue);
        g.drawRect(100, y-25, 40, 50);
        g.setColor(Color.red);
        g.drawRect(120, y-25, 40, 50);
        g.setColor(Color.blue);
        g.drawString("Player 2", 100, 15);
        g.setColor(Color.MAGENTA);
        g.drawRect(200, y, 40, 50);        
        g.drawString("Player 3", 200, 40);
        g.setColor(Color.black);
        g.drawOval(100, 100, 40, 40);
        g.drawRect(100, 140, 50, 50);
        g.drawRect(100 ,190, 10 ,30);
        g.drawRect(140 ,190, 10 ,30);
        g.drawString("You", 100, 90);
        //carro1
        g.setColor(Color.CYAN);
        int[] positionx = {x, x+30, x+60, x-30};
        int[] positiony = {200, 200, 230, 230};
        g.fillPolygon(positionx, positiony, 4);
        g.setColor(Color.blue);
        g.fillRect(x-50, 230, 130, 50);
        g.setColor(Color.gray);
        g.fillOval(x-30, 275, 30, 30);
        g.fillOval(x+20, 275, 30, 30);
        g.drawRect(x-60, 130, 160 , 200);*/
        
    }    
    // Colision
    public void checkCollisions(){
        Rectangle eCicle = this.getBounds();
        Rectangle Obs = new Rectangle(600, 130, 160 , 200);
        Rectangle rec1 = new Rectangle(0, y, 40, 50);
        if (eCicle.intersects(Obs)){
            timer.stop();
        }
    }
    
    //Empezar la animacion
    @Override
    public void actionPerformed(ActionEvent e) {
      // this.x+=101;
       this.y+=2;
       secx++;
        if (secx==6) {
            secx=0;
        }
       checkCollisions();
       repaint();       
    
    }
    
    public Image loadImage(String imageName){
        ImageIcon i1 = new ImageIcon(imageName);
        Image image = i1.getImage();
        return image;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Point mp = e.getPoint();
        if (getBounds().contains(mp)) {
           timer.stop();
           
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
              
            }
        }
        
        System.out.println("It works.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    @Override
    public Rectangle getBounds(){
    return new Rectangle(x-60, 130, 160 , 200);
}
    private class TAdapter extends KeyAdapter{ 

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Okey");
             //circle.keyReleased(e);
        } 
   
@Override
public void keyPressed(KeyEvent e){
    System.out.println("ok ");
    int key = e.getKeyCode();
    if(key == KeyEvent.VK_SPACE){
        System.out.println("VK_SPACE");
    }
    if (key == KeyEvent.VK_LEFT) {
        x -= 5;
    }
    if (key == KeyEvent.VK_RIGHT) {
        x += 50;
    }
    //circle.keyPressed(e);
}
    }
}

