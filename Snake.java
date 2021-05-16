package snake;



import java.awt.EventQueue;
import javax.swing.JButton;

import javax.swing.JFrame;

public class Snake extends JFrame {

    public Snake() {
        
        initUI();
    }
    
    private void initUI() {
        
        
        add(new Snakegame());
        
        setResizable(false);
        pack();
        
        setTitle("Hadík");
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     
             }
    
  
    
    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            
            
            JFrame frame = new Snake();
            frame.setVisible(true);
            
            
            
           
         
       
            
        });
    }
}