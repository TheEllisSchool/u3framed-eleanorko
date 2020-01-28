import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;


public class LightButton extends JButton {
    private static final int MAXSIZE = 100;
    private int row = 0;
    private int col = 0;
    private int centerR = 1;
    private int centerC = 1;
    private boolean isLit = false;
   // private boolean isOpaque = false;
   // private boolean isLit = false;
    
    public LightButton (int r, int c){
        row = r;
        col = c;
        setBackground(Color.BLACK);
        
        Dimension size = new Dimension(MAXSIZE, MAXSIZE);
        setPreferredSize(size);
    }
    
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    
    public void turnOn(){
        setBackground(Color.RED);
        setOpaque(true);
    }
    public void turnOff(){
        setBackground(Color.BLACK);
        setOpaque(true);
    }
    
    public boolean isLit(){
        Color color = getBackground();
        boolean isLit = (color == Color.RED);
        return isLit;        
    }

    
    
    public void toggle(){
        if (isLit()){
            turnOff();
        } else {
            turnOn();
        }
    }

	public void reset() {
		isLit = false;
		setBackground(Color.BLACK);
		setText("");
		
	}
}
