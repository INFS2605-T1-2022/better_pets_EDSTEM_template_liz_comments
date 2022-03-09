import java.lang.ClassNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PetDatabase {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		connect();
		insertPets();
		printAllPets();		
		getPets("Cat");
		getPets("Frog");
						
	}
	public static void connect() throws ClassNotFoundException, SQLException{
		Class.forName("org.sqlite.JDBC"); // This just touches SQL to make sure it is there
		// Open DB connection
    // Make pets table 
      //(you can do this using a prepared statment like the betterPets example on github (not this repo), 
      //or just line by line like the tutorial powerpoint on slide 21)  
		// Close DB connection
	}
	
	public static void insertPets() throws SQLException{
		// Open DB connection
		// Insert all pets into the pets table
      // See slide 21 of tute powerpoint for example
		// Close DB connection	
	}
	
	public static void printAllPets() throws SQLException{
		//Open DB connection
    //Print all the pets in the pets table
      // See slide 21 of tute powerpoint for example
		//Close DB connection
		System.out.println("** SEARCH ALL PETS **");
	}
	
	public static void getPets(String species) throws SQLException{
		//Open DB connection
    //Retrieve all pets that are of the species specified in the parameters of this method(i.e. species)
      //See slide 21 of tute powerpointfor example
		//Close DB connection 
		System.out.println("** SEARCH FOR SPECIES = " + species + " **");
	}
	
}
