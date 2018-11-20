/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supervisedandunsupervised;

import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import javax.swing.UIManager;

public class Main {
    
    public static void main(String[] args) 
    {        
        try
        {                    						
            UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());  //ok							
			
            MainFrame mf=new MainFrame();
            mf.setTitle("Aspect Category Detection");
            mf.setVisible(true);
            mf.setResizable(false);        			
        }
	catch (Exception ex)
	{
			
	}        
    }
}
