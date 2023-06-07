package J_24_Tries;

import java.util.ArrayList;
import J_24_Tries.TrieNode;
import J_24_Tries.Tries;
class TrieNode {
    char data;
    boolean isTerminal;
    TrieNode children[];
    int childcount;
    
    public TrieNode(char data){
        this.data = data;
        this.isTerminal = false;
        this.children = new TrieNode[26];
        this.childcount = 0;
    }
}
class Tries{
    public TrieNode root;
    public Tries(){
        root = new TrieNode('\0');
    }
}
public class AutoComplete {
    TrieNode root = new TrieNode('\0');
    
    public void add(String word)
    {
        addhelper(root, word);
    }

    private void addhelper(TrieNode root, String word)
    {
        if(word.length() == 0 )
        {
            root.isTerminal = true;
            return;
        }
        int childindex = word.charAt(0) - 'A';
        TrieNode child = root.children[childindex];
        if(child == null)
        {
            child = new TrieNode(word.charAt(0));
            root.children[childindex] = child;
            root.childcount++;
        }
        addhelper(child, word.substring(1));
    }
    private static void allpossiblewords(TrieNode root, String word, String output)
	{
		if(root.childcount == 0 )
		{
			if(output.length() >0)
			{
				System.out.println(word+output);
			}
			return;
		}
		if(root.isTerminal)
		{
			System.out.println(word+output);
		}
		for(int i = 0 ; i < root.children.length ; i++)
		{
			if(root.children[i] != null)
			{
				TrieNode childnode = root.children[i];
				String newOutput = output + childnode.data;
				allpossiblewords(childnode, word, newOutput);
			}
		}
	}
	public TrieNode findroot(TrieNode root,String word){
		if(word.length() ==0)
		{
			return root;
		}
		int childindex = word.charAt(0) - 'a';
		TrieNode childnode = root.children[childindex];
		if(childnode == null)
		{
			return null;
		}
		return findroot(childnode, word.substring(1));
	}
	public void autoComplete(ArrayList<String> input, String word) {
		for(String i : input)
		{
			add(i);
		}
		TrieNode temproot = findroot(root, word);
		if(temproot == null || temproot.childcount == 0)
		{
			return ;
		}
		String output = "";
		allpossiblewords(temproot, word, output);
    }
}
