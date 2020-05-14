/*
 *
 * @program: 2020512
 * @description
 * 左右括号是否匹配
 * 1.左右括号不匹配
 * 2.左括号多
 * 3.右括号多
 * 4.匹配
 * @author: mrs.yang
 * @create: 2020 -05 -13 21 :30
 */

import java.util.Scanner;
import java.util.Stack;

public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                //放入栈中
                stack.push(ch);
            }else{//不是左括号
                //判断栈中是否为空
                if(stack.empty()){
                    System.out.println("右括号多");
                    //return false;
                }else{//栈中不为空
                    //拿到栈顶的元素
                    char ch2=stack.peek();
                    if((ch2=='('&&ch==')')||(ch2=='['&&ch==']')||(ch2=='{'&&ch=='}')){
                        System.out.println("左右括号匹配");
                        stack.pop();
                    }else{
                        System.out.println("左右括号不匹配");
                        //return false;
                    }
                }
            }
        }
        if(!stack.empty()){
            System.out.println("左括号多");
            //return false;
        }
        //return true;
    }
}
