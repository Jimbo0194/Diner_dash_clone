package diner_dash;

import javax.swing.JFrame;
/**
 *
 * @author luisdiegomontealegrebadilla
 */
public class WarningPanel extends JFrame{
    
    public WarningPanel(){
        setTitle("¡Cuidado!");
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);
    }
    
    private void closepanel(){

        this.getContentPane().setVisible(false);
        this.dispose();

    }
}
