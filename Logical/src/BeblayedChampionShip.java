import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BeblayedChampionShip {

	public static void main(String[] args) {

		int[] arr = new int[4];
		int teamG[] = { 3,20,10,40 };
		int teamAll[] = { 15,30,100,10 };
		int temp = 0;

		List<Integer> listTeamG = new LinkedList<>();
		List<Integer> listTeamAll =  new LinkedList<>();

		for (int i = 0; i < teamG.length; i++) {
			listTeamG.add(teamG[i]);
			listTeamAll.add(teamAll[i]);
		}
		Collections.sort(listTeamG);
		System.out.println(listTeamG);
		System.out.println(listTeamAll);

		for (int i = 0; i < teamG.length; i++) {

			for(int j = 0 ; j<listTeamAll.size();j++) {
				if(listTeamAll.get(j)<listTeamG.get(i)) {
					temp++;
					listTeamAll.remove(j);
					break;
				}
			
			}
			
		}
		System.out.println(temp);
	}

}
