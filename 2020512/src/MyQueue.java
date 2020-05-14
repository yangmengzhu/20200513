/*
 * @program: 2020512
 * @description
 * 链式队列
 * @author: mrs.yang
 * @create: 2020 -05 -13 19 :35
 */
class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data=data;
    }
}
public class MyQueue {
    public Node front;
    public Node tail;
    public boolean offer(int data){
        Node node=new Node(data);
        if(this.front==null){
            this.front=node;
            this.tail=node;
        }else{
            this.tail.next=node;
            this.tail=node;
        }
      return true;
    }
    public static void main(String[] args) {
    }
}
