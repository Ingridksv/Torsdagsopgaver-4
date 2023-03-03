class Main {

	//Create a class Main with a main method.
	public static void main(String[] args) {
		//From the main method in the Main class, create an instance of the Team class (instantiate the Team class).
		Team TeamA = new Team("Tea");
		Team TeamB = new Team("Milk");
		Team TeamC = new Team("Sugar");
		Team TeamD = new Team("Coffee");

//From the main method, call the method setRank on the instance of Team you created in step 1.g with a number of your choice.		
		TeamA.setRank(1);
		TeamB.setRank(3);
		TeamC.setRank(4);
		TeamD.setRank(2);

		System.out.println(TeamA.toString());
		System.out.println(TeamB.toString());
		System.out.println(TeamC.toString());
		System.out.println(TeamD.toString());

	}
}