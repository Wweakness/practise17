//例题：非空整数数组，除了某一个元素只出现了一次以外，其他元素都出现了两次，找出那个元素
import java.util.*;
public class P1 {
   static Map<Integer,Integer> count(int[] numbers){
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:numbers){//遍历map中每个数
            //key数字
            //value该数字出现次数
            //判断下n在不在map中
            //不在，出现次数是1
            //在，出现次数加1
            int c=map.getOrDefault(n,0);
            map.put(n,c+1);
        }
        return map;

    }

    public static void main(String[] args) {
        int[] numbers={2,2,4,5,5,6,6};
        Map<Integer,Integer> map=count(numbers);
        System.out.println(map);
        /*
        keySet();  取出所有的key  取出所有的数字
        values();   取出所有的value  取出所有的出现次数
        entrySet();   所有的数字及其出现次数的键值对
         */
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            /* Map.Entry<Integer,Integer> 实际上一个类型：
            1、静态内部类 Map.Entry Entry是一个类型，但是这个类型是挂靠在外部类Map之中的
            2、泛型 有两个类型变量   <K的类型，V的类型>
            */
            int number=entry.getKey();
            int cnt=entry.getValue();
            if (cnt==1){
                System.out.println(number);
            }
        }

    }

}
