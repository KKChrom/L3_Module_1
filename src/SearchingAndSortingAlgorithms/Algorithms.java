package SearchingAndSortingAlgorithms;

import java.util.Collections;
import java.util.Comparator;
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
			if(oysters.get(i).equals(true))
			{
				x++;
			}
			
		}
		return x;
	}
	public static double findTallest(List<Double> peeps)
	{
		double x = 0;
		for(int i = 0;i<peeps.size();i++)
		{
			if(x<peeps.get(i))
			{
				x=peeps.get(i);
			}
			
		}
		return x;
	}
	public static String findLongestWord(List<String> words)
	{
		String x = "";
		for(int i = 0;words.size()>i;i++)
		{
			if(x.length()<words.get(i).length())
			{
				x = words.get(i);
			}
		}
		return x;
	}
	public static boolean containsSOS(List<String> message)
	{
		for(int i =0; message.size()> i; i++)
		{
			if(message.get(i).contains("... --- ..."))
			{
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> results)
	{
		 Collections.sort(results);
		 return results;
	}
	public static List<String> sortDNA(List<String> unsortedSequences)
	{
		 Comparator<String> cmp = Comparator.comparingInt(String::length)
	             .thenComparing(String.CASE_INSENSITIVE_ORDER);
		 Collections.sort(unsortedSequences,cmp);
		 return unsortedSequences;
	}
	public static List <String>sortWords (List<String> words)
	{
		Collections.sort(words);
		return words;
	}
}