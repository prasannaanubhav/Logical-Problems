package GenericsChallenge;

public class Main {

	public static void main(String[] args) {
		
		FootballTeam mu = new FootballTeam("Manchester United", "Sir Alex Ferguson");
		FootballTeam chelsea = new FootballTeam("Chelsea", "Abrahamovic");
		
		FootballTeam mu1 = new FootballTeam("Manchester United", "Sir Alex Ferguson");
		
		LeagueTable<FootballTeam> ft = new LeagueTable<>();
		ft.addTeam(mu);
		ft.addTeam(chelsea);
		ft.getTeams();
		
		BasketBallTeam la = new BasketBallTeam("LA Lakers", "Tim Bhuchalka");
		BasketBallTeam pa = new BasketBallTeam("American Idols","John Terry");
		
		LeagueTable<BasketBallTeam> bt = new LeagueTable<>();
		bt.addTeam(pa);
		bt.addTeam(la);
		bt.getTeams();
	
		

	}

}
