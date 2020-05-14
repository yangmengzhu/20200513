/*
 *
 * @program: 2020512
 * @description
 * 实现一个单链表
 * @author: mrs.yang
 * @create: 2020 -05 -13 14 :52
 */
/*class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}*/
/*
public class MyLinkedList {
    public Node head;
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }
    //打印链表
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        Node cur=this.head;
        if(this.head==null){
            this.head=node;
            return;
        }
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
    //单链表的长度
    public int size(){
        Node cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //在index位置插入元素data
    private Node searchIndex(int index){
        Node cur=this.head;
        if(this.head==null){
            return null;
        }
        while(index-1!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex(int index,int data){
        Node node=new Node(data);
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==this.size()){
            addLast(data);
            return;
        }
        Node prev=searchIndex(index);
        if(prev==null){
          return;
        }
        node.next=prev.next;
        prev.next=node;
    }
    //是否包含关键字key
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
           cur=cur.next;
        }
        return false;
    }
    //删除第一次出现关键字 key的节点
    private Node searchPrev(int key){
        Node prev=this.head;
        if(this.head==null){
            return null;
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
        while(prev.next!=null){
            if(prev.next.data==key){
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }
    public void remove(int key){
        Node prev=searchPrev(key);
        if(prev==null){
            return;
        }
        Node del=prev.next;
        prev.next=del.next;
    }
    //删除所有出现的关键字key
    public void removeAll(int key){
        //判断是否是头节点
        //判断是否为空
        if(this.head==null){
            return;
        }
        Node prev=this.head;
        Node cur=this.head.next;
        while(cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
            if(this.head.data==key){
                this.head=this.head.next;
            }
        }
    }
    public void clear(){
        this.head=null;
    }
}
*/
