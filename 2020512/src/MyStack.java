/*
 * @program: 2020512
 * @description
 * 栈
 * @author: mrs.yang
 * @create: 2020 -05 -13 18 :53
 */

import java.util.Arrays;

public class MyStack {
   public int[] arr;
   public  int top;//表示当前可以存放数据元素的下标
   public MyStack(){
       this.arr=new int[10];
       this.top=0;
   }
   public boolean full(){
       if(this.top==this.arr.length){
           return true;
       }
       return false;
   }
    public boolean empty(){
        return this.top==0;
    }
    //入栈
   public void push(int data){
       //判断是否满
       if(full()){
           this.arr= Arrays.copyOf(this.arr,2*this.arr.length);
       }
       this.arr[this.top]=data;
       top++;
   }
  //找到栈顶元素并删除
    public int pop(){
       if(empty()){
           System.out.println("栈为空");
           return -1;
       }
       int val=this.arr[this.top-1];
       this.top--;
       return val;
    }
    //找到栈顶元素并返回
    public int peek(){
       if(empty()){
           return -1;
       }
       return this.arr[this.top-1];
    }
    public int size(){
       return this.top;
    }
   public static void main(String[] args) {
       MyStack stack=new  MyStack();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       System.out.println(stack.size());
       System.out.println(stack.peek());
       System.out.println(stack.pop());
       System.out.println(stack.empty());
   }
}
