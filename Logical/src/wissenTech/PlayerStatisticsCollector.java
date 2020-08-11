package wissenTech;

public interface PlayerStatisticsCollector {

	void putNewInnings(String player, int runs);

	double getAverageRuns(String player);

	int getInningsCount(String player);

}
