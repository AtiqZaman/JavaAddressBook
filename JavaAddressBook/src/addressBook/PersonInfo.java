package addressBook;

import javax.swing.JOptionPane;

public class PersonInfo {

	String name;
	String address;
	String phoneNumber;
	
	
	//Parameterized Constructor
	public PersonInfo(String n, String a, String p) {
		name = n;
		address = a;
		phoneNumber = p;
	}
	 
	
	//Method for displaying person record on GUI
	public void print() {
		JOptionPane.showMessageDialog(null, "Name: "+ name +"\nAddress: "+address+"\nPhone#: "+phoneNumber);
	}
	
}
