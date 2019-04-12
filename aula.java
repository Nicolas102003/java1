package aula44;

import javax.swing.JOptionPane;
public class aula {


 public static void main (String args[]) {
	String x =JOptionPane.showInputDialog("digite um numero");
	 //TODO AUTO GENERATED METHOD STUB
	 System.out.println("ebaaaa");
	  try {
		  int j = Integer.parseInt(x);
		  
		  while(j < 10 ) {
			  System.out.println(j);  
			  j = j + 1;
			  
		  }
		   
	  }catch(Exception  e) {
		  e.printStackTrace();
	  }
	  	  
	  
 
 
 }
}