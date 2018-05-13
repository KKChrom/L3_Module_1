package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i =0; i<eggs.size();i++)
		{
			if(!eggs.get(i).equals("whole"))
			{
				return i;
			}
			
		}
		return -1;
	}
	
	//Add other methods here
	public static int countPearls(List<Boolean> oysters) {
		int x=0;
		for(int i =0; i<oysters.size();i++)
		{
			if(oysters.get(i).equals("true"))
			{
				x++;
			}
			
		}
		return x;
	}
}