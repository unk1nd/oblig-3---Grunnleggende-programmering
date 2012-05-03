package oppgave3;

// by the coding heads of Trond Larsen && Mikael Bendiksen

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StemmeTellerPanel extends JPanel
{
	private String stilling;
    private int stemmerForXman, stemmerForNemi, stemmerForPondus;
    private JButton nemi, pondus, xman;
    private JLabel etikettNemi, etikettPondus, leder, etikettXman;

    
    public StemmeTellerPanel()
    {
    	stemmerForPondus = 0;
    	stemmerForNemi = 0;
    	stemmerForXman = 0;
    	stilling = "Uavgjort";
	
    	pondus = new JButton("Stem på Pondus");
    	pondus.addActionListener(new StemmeKnappLytter());
	
    	nemi = new JButton("Stem på Nemi");
    	nemi.addActionListener(new StemmeKnappLytter2());
	
    	xman = new JButton("Stem på X-Men");
    	xman.addActionListener(new StemmeKnappLytter3());

    	etikettNemi = new JLabel("Stemmer for Nemi: " + stemmerForNemi);
    	etikettPondus = new JLabel("Stemmer for Pondus: " + stemmerForPondus);
    	leder = new JLabel("Stilling: " + stilling);
    	etikettXman = new JLabel("Stemmer for X-men: " + stemmerForXman);
	
    	add(nemi);
    	add(xman);
	
    	add(pondus);
	
    	add(etikettPondus);
    	add(etikettXman);
    	add(etikettNemi);
	
    	add(leder);
	
    	setPreferredSize(new Dimension(200, 200));
    	setBackground(Color.gray);
    }

    
    private class StemmeKnappLytter implements ActionListener
    {
	
    	public void actionPerformed(ActionEvent event)
    	{
    		stemmerForPondus++;
    		etikettPondus.setText("Stemmer for Pondus: " + stemmerForPondus);
    		if (stemmerForPondus<stemmerForNemi && stemmerForNemi>stemmerForXman)
    			{
    				leder.setText("Stilling: Nemi leder.");
    			}

    		else if (stemmerForXman>stemmerForNemi && stemmerForXman>stemmerForPondus)
    			{
    				leder.setText("Stilling: X-men leder.");
    			}
    		else if (stemmerForPondus>stemmerForNemi && stemmerForPondus>stemmerForXman)
    			{
    				leder.setText("Stilling: Pondus leder.");
    			}
    		else
    			{
    				leder.setText("Stilling: Uavgjort.");
    			}
    	}
    }
    
    private class StemmeKnappLytter2 implements ActionListener
    {
	
    	public void actionPerformed(ActionEvent event)
    	{
    		stemmerForNemi++;
    		etikettNemi.setText("Stemmer for Nemi: " + stemmerForNemi);
    		if (stemmerForPondus<stemmerForNemi && stemmerForNemi>stemmerForXman)
			{
				leder.setText("Stilling: Nemi leder.");
			}

    		else if (stemmerForXman>stemmerForNemi && stemmerForXman>stemmerForPondus)
			{
				leder.setText("Stilling: X-Men leder.");
			}
    		else if (stemmerForPondus>stemmerForNemi && stemmerForPondus>stemmerForXman)
			{
				leder.setText("Stilling: Pondus leder.");
			}
    		else
			{
				leder.setText("Stilling: Uavgjort.");
			}

    	}
    }
    
    private class StemmeKnappLytter3 implements ActionListener
    {
	
    	public void actionPerformed(ActionEvent event)
    	{
    		stemmerForXman++;
    		etikettXman.setText("Stemmer for X-men: " + stemmerForXman);
    		if (stemmerForPondus<stemmerForNemi && stemmerForNemi>stemmerForXman)
			{
				leder.setText("Stilling: Nemi leder.");
			}

		else if (stemmerForXman>stemmerForNemi && stemmerForXman>stemmerForPondus)
			{
				leder.setText("Stilling: X-men leder.");
			}
		else if (stemmerForPondus>stemmerForNemi && stemmerForPondus>stemmerForXman)
			{
				leder.setText("Stilling: Pondus leder.");
			}
		else
			{
				leder.setText("Stilling: Uavgjort.");
			}

    		
    	}
    }
    
}

