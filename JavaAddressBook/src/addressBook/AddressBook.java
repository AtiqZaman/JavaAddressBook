package addressBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AddressBook {

	ArrayList persons;

	// Constructor
	public AddressBook() {
		persons = new ArrayList();
		//loadPersons();
	}

	// Add new person to arraylist after taking input
	public void addPerson() {
		String name = JOptionPane.showInputDialog("Enter Name: ");
		String addr = JOptionPane.showInputDialog("Address: ");
		String pNum = JOptionPane.showInputDialog("Phone: ");

		// Construct new person object
		PersonInfo p = new PersonInfo(name, addr, pNum);

		// Add the above person info object to arraylist
		persons.add(p);

	}// End addperson()

	// Search person by name by itrating over arraylist
	public void searchPerson(String n) {

		for (int i = 0; i < persons.size(); i++) {

			PersonInfo p = (PersonInfo) persons.get(i);

			if (n.equals(p.name)) {
				p.print();
			}

		} // End for

	}// End searchPerson

	// Delete person record by name by iterating over arraylist
	public void deletePerson(String n) {

		for (int i = 0; i < persons.size(); i++) {

			PersonInfo p = (PersonInfo) persons.get(i);

			if (n.equals(p.name)) {
				persons.remove(i);
			}
		}
	}
	
	//uncomment this code to fulfill the persistence in code 

//	// Method to Save data for persistence through filing
//	public void loadPersons() {
//
//		String tokens[] = null; 
//		String name, add, ph;
//
//		try {
//
//			FileReader fr = new FileReader("Persons.txt");
//			BufferedReader br = new BufferedReader(fr);
//
//			String line = br.readLine();
//
//			while (line != null) {
//
//				tokens = line.split(",");
//				name = tokens[0];
//				add = tokens[1];
//				ph = tokens[2];
//
//				PersonInfo p = new PersonInfo(name, add, ph);
//				persons.add(p);
//
//				line = br.readLine();
//			} // End while Loop
//
//			br.close();
//			fr.close();
//
//		} // End Try method
//		catch (IOException ioEx) {
//			System.out.println(ioEx);
//		}
//
//	} // End loadPerson() method
//
//	// Method to load data for persistence through filing
//	public void savePersons() {
//
//		try {
//			
//			PersonInfo p;
//			String line;
//			
//			FileWriter fw = new FileWriter("Persons.txt");
//			PrintWriter pw = new PrintWriter(fw);
//
//			for (int i = 0; i < persons.size(); i++) {
//				p = (PersonInfo)persons.get(i);
//				line = p.name+","+p.address+","+p.phoneNumber;
//				
//				//Write line to file (Perosn.txt)
//				pw.println();
//			}
//
//			pw.flush();
//			pw.close();
//			fw.close(); 
//
//		} // End Try method
//		catch (IOException ioEx) {
//			System.out.println(ioEx);
//		}
//	
//	} //End save person method

}