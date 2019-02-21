import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
public class SortSimulator {
	
	public static void main(String [] args){
		
		int [] array = {456,768,23,67,34};
		Arrays.sort(array);
		for(int i=0 ; i< array.length ; i++)
			System.out.println(array[i]);
	}

}
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border; 
public class SortSimulator
{ 
    private JFrame frame; 
  
    public static void main(String[] args) 
    { 
        SortSimulator sim = new SortSimulator(); 
        
     // creating instance of Jsim.frame with name "first way" 
        sim.frame =new JFrame(); 
          
        // creates instance of JButton 
        JButton button1 = new JButton("Sort Numbers"); 
        button1.setBounds(50, 50, 120, 50); 

        JLabel label = new JLabel();
        label.setText("sorted number output:");
        label.setBounds(100, 200, 300, 100);
        Border border = BorderFactory.createLineBorder(Color.cyan, 1);
        label.setBorder(border);

 
        sim.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        TextField t1 = new TextField (20);
        
        JRadioButton rb1 = new JRadioButton("ASC");
        JRadioButton rb2 = new JRadioButton("Descanding");
        ButtonGroup bg=new ButtonGroup();  
        rb1.setSelected(true);
        bg.add(rb1);bg.add(rb2);
        
        button1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e) {
            		try{
            				label.setText(sim.sortNumbers(t1,rb1.isSelected()));
            		}catch(Exception exp){
            			label.setText(" something went wrong");
            		}
            }  
            });
        
        JPanel panel1 = new JPanel();
        panel1.add(button1);
        panel1.add(t1);
        panel1.add(rb1);panel1.add(rb2);
        panel1.setBackground(Color.darkGray);
        Border border2 = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1);
        panel1.setBorder(border2);
        sim.frame.add(panel1,BorderLayout.SOUTH);
        
        
        JPanel panel2 = new JPanel();
        Border border3 = BorderFactory.createLineBorder(Color.black, 3);
        panel2.setBorder(border3);
        panel2.add(label, BorderLayout.NORTH);
        sim.frame.add(panel2);
        
        sim.frame.setSize(600, 400); 
        
        sim.frame.setTitle("Sor Number");
        // uses no layout managers 
        //sim.frame.setLayout(null); 
          
        // makes the sim.frame visible 
        sim.frame.setVisible(true); 
    } 
    
    
    public String sortNumbers(TextField tf, boolean flag){
    	
    	String [] split = tf.getText().split(",");
    	
    	List<Integer> nums = new ArrayList();
    	
    	for( String s: split){
    		nums.add(Integer.parseInt(s));
    	}
    	if(flag)
    		Collections.sort(nums);
    	else
    		Collections.sort(nums, Collections.reverseOrder());
    	
    	return  new String(nums.toString());
    }
} 