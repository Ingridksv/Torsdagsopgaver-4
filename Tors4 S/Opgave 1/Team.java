class Team{
	//Add a private instance variable a.k.a attribute to Team to hold the team name.
	private String teamName;
	//Add another private instance variable to hold the Teams rank (some number).
	private int teamRank;
	//Add yet another private instance variable to hold the name of the players in the team.
	private String playersName;

//Add a constructor with a parameter, so that the Team can be instantiated with a team name. Make sure the parameter value is assigned to the matching instance variable. 
public Team(String teamName){
	this.teamName=teamName;
}

	//From the main method, call the method setRank on the instance of the Team you created in step 1.g witha number of your choise. 
public void setRank(int rank){
	this.teamRank=rank;
}

public String toString(){
	String s = "Hold: " + this.teamName + " Rank: " + this.teamRank;
	return s;
 }
}