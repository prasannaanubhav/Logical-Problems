package wissenTech;

public class WissenTechnologies {

	public static void main(String[] args) {
		
		PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
		stats.putNewInnings("Virat", 22);
		stats.putNewInnings("Virat", 45);
		stats.putNewInnings("Virat", 66);
		
		stats.putNewInnings("steve", 33);
		stats.putNewInnings("steve", 55);
		
		System.out.println(stats.getAverageRuns("Virat"));
		System.out.println(stats.getAverageRuns("steve"));
		
		System.out.println(stats.getInningsCount("Virat"));
		System.out.println(stats.getInningsCount("steve"));
	}

}
