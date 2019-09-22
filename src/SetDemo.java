import java.util.HashMap;
import java.util.*;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("hello");
        set.add("bit");
        set.add("hello");
        set.add("java");
        set.add("bit");
        System.out.println(set);  //set中重复的不打印
        //查看set中是否包含某key,包含true,不包含false
        System.out.println(set.contains("hello"));
        System.out.println(set.contains("zzx"));

        //遍历set方法一
        Iterator<String> it=set.iterator();//取出set的迭代器
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //遍历set方法二
        for(String s:set){
            System.out.println(s);
        }







    }
}
