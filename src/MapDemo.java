import java.util.HashMap;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"hello");
        map.put(2,"java");
        map.put(3,"bit");
        System.out.println(map);
        //遍历key
        for(int i:map.keySet()){  //打印出每个key（1，2，3）
             System.out.println(i);
        }
        //遍历value
        for(String value:map.values()){  //打印出每个value  如果有重复的value，有几次打印几次
            System.out.println(value);
        }
        //遍历键值对
        Set<Map.Entry<Integer,String>> entires=map.entrySet();  //键值对的集合,entries代表这个集合
        for(Map.Entry<Integer,String> entry:entires){  //entry代表每一个取到的键值对，相当于i
            System.out.println(entry.getKey());//取键值对中的key
            System.out.println(entry.getValue());//取键值对中的value
        }

    }
}
