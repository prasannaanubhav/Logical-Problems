package wissenTech;

import java.util.HashMap;
import java.util.Map;

public class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
	
	Map<String, Integer> map = new HashMap<>();
	Map<String, Integer> inMap = new HashMap<>();
	@Override
	public void putNewInnings(String player, int runs) {
		int inningsCount =0;
		if(player !=null && runs>0) {
			if(!map.containsKey(player)) {
		map.put(player, runs);
		inningsCount++;
		inMap.put(player, inningsCount);
		return;
		}		
			else {
				if(map.containsKey(player)) {
					int count = inMap.get(player);
					inningsCount = count+1;
					inMap.put(player, inningsCount);
				}
				
				int totalrun = map.get(player);
				totalrun = totalrun+runs;
				map.put(player, totalrun);
			}
		}
		
	}

	@Override
	public double getAverageRuns(String player) {

		int runs = map.get(player);
		int inCount  = inMap.get(player);
		double avg = (double)runs/(double)inCount;
		return avg;
	}

	@Override
	public int getInningsCount(String player) {

		int innings = inMap.get(player);
		return innings;
	}

}
