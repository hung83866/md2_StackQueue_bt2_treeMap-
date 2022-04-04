package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "dong doi voi vang luot qua , chot nhu chiec hon thoi ma , doi moi chia lam doi , doi ta dang mong vay thoi";
        str.replaceAll(",","");
        String newStr[] = str.split(" ");
        String key = "";
        int value;
        TreeMap<String , Integer> map = new TreeMap<>();
        for (int i = 0; i < newStr.length; i++) {
            key = newStr[i];
            if (map.containsKey(key)){
                value = map.get(key);
                map.remove(key);
                value++;
            }else {
                value =1;
            }
            map.put(key,value);
            }
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            key = (String)iterator.next();
            System.out.println("Từ '"+key+"' xuất hiện "+map.get(key)+" lần");
        }

    }
}
