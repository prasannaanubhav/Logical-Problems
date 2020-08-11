package GenericsChallenge;

import java.util.ArrayList;
import java.util.Iterator;

public class LeagueTable<T extends Teams> {

	private ArrayList<T> allTeams = new ArrayList<>();

	public void addTeam(T Teams) {

		if (allTeams.contains(Teams.getName())) {
			System.out.println(Teams.getName()+"this team is already been added");
		} else {
			allTeams.add(Teams);
		}
	}
	
	public void getTeams() {
		Iterator<T> iterator = allTeams.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
