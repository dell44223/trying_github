import java.util.*;
import java.io.*;
public class L9P2 {

	public static void main(String[] args) {
		String userInput = null; //User Input
		int userInt = 0;
		int idCheck = 0;
		HashMap<Integer, ArrayList<String>> students = new HashMap<Integer, ArrayList<String>>(); //Create the HashMap for mapping Student ID to Class
		
		ArrayList<String> classes = new ArrayList<String>(); //Creates the array list of classes
		
		Scanner inputStream = new Scanner(System.in);
		while(userInt!=-1){
			userInt = inputStream.nextInt(); //Gets the id of the Student
			if(userInt!=-1){ //Only Executes if the user did not type -1
				userInput = inputStream.nextLine(); //Gets rest of line including the beginning space
				//Right here is where I need to get id
				if(students.get(userInt)== null){ //Checks if ID exists
					ArrayList<String> temp = new ArrayList<String>(); //Creates a temporary array list
					temp.add(userInput.trim()); //Trims all the spaces out and adds string to array
					students.put(userInt, temp);//add to hashmap
				}else{
					students.get(userInt).add(userInput.trim());//if the id is found, add to the array
				}
			}
		}
		System.out.println("All data:");
		System.out.println("----------------------------------------");
		int hash_size = students.size();
		for(int i = 1; i<(hash_size+1); i++){
			if(students.get(i)!= null){
				if(i>1){
					System.out.println(" ");
				}
				System.out.println("Student ID: " +i);
				System.out.println("Classes:");
				for(int j = 0; j<(students.get(i).size());j++){
					System.out.println("  " + students.get(i).get(j));
				}
			}
		}
		System.out.println("----------------------------------------");
		System.out.println("End of the Program");
	}

}
