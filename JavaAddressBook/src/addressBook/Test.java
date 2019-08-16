package addressBook;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		AddressBook ad = new AddressBook();

		String input, s;
		int ch;

		while (true) {

			input = JOptionPane.showInputDialog(
					"Enter 1 to add" + "\n Enter 2 to search \n Enter 3 to Delete \n" + "Enter 4 to Exit");

			ch = Integer.parseInt(input);

			switch (ch) { 

			  case 1:
				  ad.addPerson();
				  break;
			  case 2:
				  s = JOptionPane.showInputDialog("Enter name to search: ");
				  ad.searchPerson(s);
				  break;
			  case 3:
				  s = JOptionPane.showInputDialog("Enter name to Delete: ");
				  ad.deletePerson(s);
				  break;
			  case 4:
				 // ad.savePersons();
				  System.exit(0);
			}
		
		} //End While loop
	
	}//End main
}
