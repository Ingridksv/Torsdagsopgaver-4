import java.util.Scanner;


class Main {

	//In the main mehod start by printing a message to the user: "..."
	static String name = "Please type your name";
	return name; 

	//Create a Main Class with a main method.
public static void main(String[] args){


	

	//Create a Scanner object for reading the command line (remember to import the Scanner class from the util library: import java.util.Scanner; )
	Scanner scan = new Scanner(System.in);

 	String input ="";

   System.out.println(name);

	//Declare a String variable, name and assign it the content of the scanner's call to nextLine().
   input = scan.nextLine();

	//Print the name of the user in a greeting, followed by the message "Please type your age"
	System.out.println("Hello " + name + ", Please type your age: ");

	

    //Declare another variable of type int, age and assign it the value returned by the nextInt method of the Scanner object. (you may reuse the Scanner object created in 2.c).
    int age = scan.nextInt();
    //Print the value the user writes (the age vaiable)
   //System.out.println(age);

//Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. You may assume retirement starts at 67 years. Print the result.
    int retirement = -67;
    while(scan.hasNext()){
    	retirement = retirement + scan.nextInt();
    	System.out.println(retirement);
    	if (retirement == -67){
    		System.out.println("Your retirement is in " + retirement + " years.");
    		break;
    	}
    }


	}
}