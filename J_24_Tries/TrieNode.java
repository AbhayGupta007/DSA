package J_24_Tries;

public class TrieNode {
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