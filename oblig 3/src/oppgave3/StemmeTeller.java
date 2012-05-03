package oppgave3;

// by the coding heads of Trond Larsen && Mikael Bendiksen

import javax.swing.JFrame;


public class StemmeTeller
{
    public static void main(String[] args)
    {
    	JFrame frame = new JFrame("StemmeTeller");
	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	frame.getContentPane().add(new StemmeTellerPanel());

    	frame.pack();
    	frame.setVisible(true);
    }
}
