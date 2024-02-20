package com.example.demo.geeks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class GameWithString {
    static int minValue(String s, int k) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!h.containsKey(s.charAt(i)))
            {
                h.put(s.charAt(i),1);
            }
            else
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
        }
        // a - 1
        // a - 2

        for(int i=0;i<k;i++)
        {
            int max = Collections.max(h.values());
            for(Map.Entry<Character,Integer> map:h.entrySet())
            {
                if(map.getValue()==max)
                {
                    h.put(map.getKey(),max-1);
                    break;
                }
            }
        }
        int sum=0;
        for(Map.Entry<Character,Integer> hash:h.entrySet())
        {
            sum=sum+(hash.getValue()*hash.getValue());
        }
        return sum;
    }
}
