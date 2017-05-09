/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;
import javax.swing.*;
import java.awt.Graphics;
/**
 *
 * @author Estudiante
 */
public class Juegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestPaintComponent frame = new TestPaintComponent();
       frame.setTitle("TestPaintComponent");
       frame.setSize(1000,350);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
    
}
