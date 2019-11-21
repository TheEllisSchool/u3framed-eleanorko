import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Framed extends JFrame {
	
	    
    private static final int GRIDSIZE = 3;
    private LightButton [][] lightButton = new LightButton[GRIDSIZE][GRIDSIZE];
    
    public Framed(){
        initGUI();
        
        setTitle("Framed");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
	    
    private void initGUI(){
        JPanel titlePanel = new JPanel(); 
        titlePanel.setBackground(Color.BLACK);
        add(titlePanel, BorderLayout.PAGE_START);
        Font titleFont = new Font("Arial", Font.BOLD, 32);
        JLabel titleLabel = new JLabel("Framed");
        titleLabel.setBackground(Color.BLACK);
        titleLabel.setOpaque(true);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(titleFont);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.add(titleLabel);
        
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(GRIDSIZE, GRIDSIZE));
        add(centerPanel,BorderLayout.CENTER);
        for (int r = 0; r < GRIDSIZE; r++){
            for (int c = 0; c < GRIDSIZE; c++){
                lightButton[r][c] = new LightButton(r, c);
                centerPanel.add(lightButton[r][c]);
            }
        }
       
    }
        
    
	    
	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new Framed();
            }   
        });

	}

}
