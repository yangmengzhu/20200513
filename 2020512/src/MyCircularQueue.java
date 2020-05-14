/*
 * @program: 2020512
 * @description
 * 循环队列==》数组
 * @author: mrs.yang
 * @create: 2020 -05 -13 20 :42
 */

public class MyCircularQueue {
    public int front;
    public int rear;
    public int[] arr;
    public MyCircularQueue(int k){
        this.arr=new int[k];
    }
    public boolean isEmpty(){
        return this.rear==this.front;
    }
    public boolean isFull(){
        //如果rear的下一个数据元素是front就满
        return (this.rear+1)%this.arr.length==this.front;
    }
   public boolean enQueue(int data){//入队
       //判断是否是满
       if(isFull()){
          return false;
       }
       this.arr[this.rear]=data;
       this.rear=(this.rear+1)%this.arr.length;
       return true;
   }
   //出队
   public boolean deQueue(){
       //判断数组是否为空
       if(isEmpty()){
           return false;
       }
       //直接让front后走一步
       this.front=(this.front+1)%this.arr.length;
       return true;
   }
   //得到头位置的元素
    public int front(){
        if(isEmpty()){
            return -1;
        }
        return this.arr[this.front];
    }
    //得到队尾的元素
    public int rear(){
        if(isEmpty()){
            return -1;
        }
        //rear的位置是空白的
        int index=this.rear==0 ? this.arr.length-1 : this.rear-1;
        return this.arr[index];
    }
    //
}
