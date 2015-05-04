package normalTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class normalTest {

	@Test
	public void test() {
		List<String> tableNames = new ArrayList<String>();
		tableNames.add("mgs_fish_boss_relay_weekly_rank_201502");
		tableNames.add("mgs_fish_boss_relay_weekly_rank_201501");
		tableNames.add("mgs_fish_boss_relay_weekly_rank");
		tableNames.add("mgs_fish_boss_relay_weekly_rank_201503");
		
		List<String> filters = new ArrayList<String>();
		filters.add("201501");
		filters.add("201502");
		filters.add("201503");
		
		for (String filter : filters) {
			for (int i=0;i<tableNames.size();i++) {
				if (tableNames.get(i).endsWith(filter)) {
					tableNames.remove(i);
				}
			}
		}
		
		System.out.println(tableNames);
	}
}
