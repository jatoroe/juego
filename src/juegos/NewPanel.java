/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
/**
 *
 * @author Estudiante
 */
public class NewPanel extends JPanel implements ActionListener {
    private Timer timer;
    private int x,y;
    
    public NewPanel(){ 
    this.x = 200;
    this.timer = new Timer(5, this);
    timer.start();
    }
    @Override
    protected void paintComponent(Graphics g){
        System.out.println("Click");
      
       
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawRect(0, 50, 40, 50);
        g.drawString("Player 1", 0, 30);
        g.setColor(Color.blue);
        g.drawRect(100, 25, 40, 50);
        g.setColor(Color.red);
        g.drawRect(120, 25, 40, 50);
        g.setColor(Color.blue);
        g.drawString("Player 2", 100, 15);
        g.setColor(Color.MAGENTA);
        g.drawRect(200, 50, 40, 50);        
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
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.x+=1;
       repaint();       
    
    }
}
