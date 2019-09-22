//宝石和石头  ：  J代表宝石的种类，不可以重复，例如J=aA,则宝石种类有a,A两种，S代表已拥有的石头个数，如S=aAAkk,则拥有的宝石有a,A,A三个
import java.util.*;
public class Jewels {
        public static int numJewelsInStones(String J, String S) {
            Set<Character> jewels=new HashSet<>();
            for(char ch:J.toCharArray()){
                jewels.add(ch);
            }
            int count=0;
            for(char a:S.toCharArray()){
                if(jewels.contains(a)){
                    count++;
                }

            }
            return count;
        }

    public static void main(String[] args) {
        String m=("aA");
        String n=("aAAM");
        int b= numJewelsInStones(m,n);
        System.out.println(b);
    }
}
