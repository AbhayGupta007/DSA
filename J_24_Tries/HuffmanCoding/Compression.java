package J_24_Tries.HuffmanCoding;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Comparator;

class node{
    char ch;
    int frequency;
    node leftchild; 
    node rightchild;
}
class comparator implements Comparator<node>{
    public int compare(node x, node y)
    {
        return x.frequency - y.frequency;
    }
}

public class Compression {    
    static HashMap<Character, String> map = new HashMap<>();
    public static void main(String[] args) {
        char chararray[] =     {'a','b','c','d','x','z'};
        int frequencyarray[] = { 30, 10, 8,  15, 4,  2};
        PriorityQueue<node> queue = new PriorityQueue<node>(new comparator());
        for(int i = 0; i< chararray.length; i++)
        {
            node n = new node();
            n.ch = chararray[i];
            n.frequency = frequencyarray[i];
            n.leftchild = null;
            n.rightchild = null;
            queue.add(n);
        }
        node root = null;
        while(queue.size()>1)
        {
            node n1 = queue.poll();
            node n2 = queue.poll();
            node n3 = new node();
            n3.frequency = n1.frequency + n2.frequency;
            n3.leftchild = n1; 
            n3.rightchild = n2;
            queue.add(n3);
            root = n3;
        }
        storecode(root,"");
        Set<Character> keys = map.keySet();
        for(Character i: keys)
        {
            System.out.println(i+": "+map.get(i));
        }
    }
    public static void storecode(node head, String code)
    {
        if(head == null)
        {
            return ;
        }
        if(head.ch != '\0')
        {
            map.put(head.ch, code);
        }
        storecode(head.leftchild, code+"0");
        storecode(head.rightchild, code+ "1");
    }
}