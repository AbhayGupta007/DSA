package J_24_Tries;
import java.util.ArrayList;
public class PatternMatching {

	public boolean patternMatching(ArrayList<String> vect, String pattern) {
        // Write your code here.
		Tries suffixtrie = new Tries(); 
		for(String i : vect)
		{
			for(int j = 0; j < i.length(); j++)
			{
				suffixtrie.add(i.substring(j));
			}
		}
		return suffixtrie.search(pattern);
	}
}