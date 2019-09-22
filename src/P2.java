import java.util.*;

//复制复制链表
public class P2 {
    public static class Node{
        int val;
        Node next;
        Node random;
    }
    //复制复制链表方法、一
    static Node copy(Node head){
        Node p=head;
        while(p!=null){
            Node q=new Node();
            q.val=p.val;
            q.next=p.next;  // 把q插到p的后边
            p.next=q;
            p=q.next;
        }
        p=head;
        while(p!=null){
            Node q=p.next;
            if(p.random!=null){
                q.random=p.random.next;
            }else{
                q.random=null;
            }
            p=q.next;
        }
        //第三步把两个链表拆开 省略
        return head;
    }
    //复制复制链表方法二
    Node copy2(Node head){
        Node p=head;
        Node result=null;
        Node last=null;
        Map<Node,Node> map=new HashMap<>();
        while(p!=null){
            Node q=new Node();
            q.val=p.val;
            if(result==null){
                result=q;
            }else{
                last.next=q;
            }
            last=q;
            map.put(p,q);
            p=q.next;
        }
        p=head;
        Node q=result;
        while(p!=null){
            q.random=map.get(p.random);
            p=p.next;
        }
        return result;
    }
}
