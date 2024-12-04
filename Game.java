package Exam.Exam.pract;

public class Game 
{
	String Name;
	String players;
	String Stadium_name;
	String Stadium_strength;
	@Override
	public String toString() {
		return "Game [Name=" + Name + ", players=" + players + ", Stadium_name=" + Stadium_name + ", Stadium_strength="
				+ Stadium_strength + "]";
	}
	public Game(String name, String players, String stadium_name, String stadium_strength) {
		super();
		Name = name;
		this.players = players;
		Stadium_name = stadium_name;
		Stadium_strength = stadium_strength;
	}
	

}
