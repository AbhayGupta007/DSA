package J_24_Tries;

public class Tries {
    private TrieNode root;
    private int wordcount;
    public Tries(){
        root = new TrieNode('\0');
        wordcount = 0;
    }

    public void add(String word)
    {
        addhelper(root, word);
        wordcount++;
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

    public boolean search(String word)
    {
        return searchhelper(root, word);
    }

    private boolean searchhelper(TrieNode root, String word)
    {
        if(word.length() == 0)
        {
            return root.isTerminal;
        }
        int childindex = word.charAt(0) - 'A';
        TrieNode childnode = root.children[childindex];
        if(childnode != null && childnode.data == word.charAt(0))
        {
            return searchhelper(childnode, word.substring(1));
        }
        return false;
    }

    public void remove(String word)
    {
        removehelper(root, word);
        wordcount--;
    }

    private void removehelper(TrieNode root, String word)
    {
        if(word.length() == 0)
        {
            root.isTerminal = false;
            return ;
        }
        int childindex = word.charAt(0) - 'A';
        TrieNode childnode = root.children[childindex];
        if(childnode == null)
        {
            return ;
        }
        removehelper(childnode, word.substring(1));
        if(!childnode.isTerminal && childnode.childcount == 0)
        {
            root.children[childindex] = null;
            root.childcount--;
        }
    }
    
    public int numwords(){
        return wordcount;
    }
}