package J_21_Hashmaps.HashMap_build;

import java.util.ArrayList;

public class Map<K,V>{
    ArrayList<Mapnode<K,V>> bucket;
    int count ; //Element count;
    int bucketcount;

    public Map()
    {
        bucket = new ArrayList<>();
        this.bucketcount = 5;
        for(int i = 0; i < bucketcount; i++)
        {
            bucket.add(null);
        }
    }

    private void reHash(){
        bucketcount = 2 * bucket.size();
        ArrayList<Mapnode<K,V>> tempbucket = bucket;
        bucket = new ArrayList<>();
        for(int i = 0; i < bucketcount ; i++)
        {
            bucket.add(null);
        }
        count = 0;
        for(Mapnode<K,V> head : tempbucket)
        {
            while(head != null)
            {
                insert(head.key, head.value);
                head = head.next;
            }
        }
    }
    
    private int getbucketindex(K key)
    {
        int hc = key.hashCode();
        int index = hc % bucketcount;
        return index;
    }

    public V getvalue(K key)
    {
        int bucketindex = getbucketindex(key);
        Mapnode<K,V> head = bucket.get(bucketindex);
        while(head != null)
        {
            if(head.key.equals(key))
            {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void insert(K key, V value){
        int bucketindex = getbucketindex(key);
        Mapnode<K,V> head = bucket.get(bucketindex); 
        while(head != null)
        {
            if(head.key.equals(key))
            {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = bucket.get(bucketindex);
        Mapnode<K,V> newnode = new Mapnode<K,V>(key, value);
        newnode.next = head;
        bucket.set(bucketindex, newnode);
        count++;
        double loadfactor = getloadfactor();
        if(loadfactor > 0.7)
        {
            System.out.println("Rehashed");
            reHash();
        }
    }

    public double getloadfactor()
    {
        double lf = (1.0 * count)/ bucketcount;
        return lf;
    }

    public boolean ispresent(K key)
    {
        Boolean ans = false;
        int bucketindex = getbucketindex(key);
        Mapnode<K,V> head = bucket.get(bucketindex);
        while(head != null)
        {
            if(head.key.equals(head))
            {
                ans = true;
                break;
            }
            head = head.next;
        }
        return ans;
    }

    public V removekey(K key)
    {
        /*  My-Method
        V removedvalue = null;
        int bucketindex = getbucketindex(key);
        Mapnode<K,V> head = bucket.get(bucketindex);
        if(head.key.equals(key))
        {
            removedvalue = head.value;
            bucket.set(bucketindex, head.next);
            return removedvalue;
        }
        while(head != null)
        {
            if(head.next != null && head.next.key.equals(key))
            {
                removedvalue = head.next.value;
                head.next = head.next.next;
                count--;
                return removedvalue;
            }
            head = head.next;
        }
        return removedvalue;
        */
        int bucketindex = getbucketindex(key);
        Mapnode<K,V> head = bucket.get(bucketindex);
        Mapnode<K,V> prev = null;
        while(head != null)
        {
            if(head.key.equals(key))
            {
                V removedvalue = head.value;
                if(prev != null)
                {
                    prev.next = head.next;
                }
                else
                {
                    bucket.set(bucketindex, head.next);
                }
                count--;
                return removedvalue;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }
}