/*
 * @program: 2020512
 * @description
 * @author: mrs.yang
 * @create: 2020 -05 -12 14 :13
 */

import java.util.Scanner;

/*class MyException extends Exception {
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}*/
class UserException extends Exception{
    public UserException(String message){
        super(message);
    }
}
class PasswordException extends Exception{
    public PasswordException(String message){
        super(message);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName=scan.nextLine();
        System.out.println("请输入密码");
        String password=scan.nextLine();
       try{
          login(userName,password);
       }catch(UserException userException){
           userException.printStackTrace();
       }catch(PasswordException passwordException){
           passwordException.printStackTrace();
       }
    }
    public static void login(String userName,String password) throws UserException, PasswordException {
        if(!userName.equals("admin")){
            throw new UserException("用户名登录错误");
        }
        if(!password.equals("123456")){
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }
    /*public int num=10;
    public static void main(String[] args) {
        //空指针异常
       TestDemo t=null;
       try{
           System.out.println(t.num);
       }catch(NullPointerException  e){
           e.printStackTrace();
       }

    }*/
    public static void main1(String[] args) {
        //throwable类是runtimeException（可以由程序解决）和error（程序员解决）的父类
        //数组越界异常
        int[] arr={1,2,3,};
        try{
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印栈追踪
        }

    }
    /*public static void login(String password) throws MyException {
        if(!password.equals("123456")){
            throw new MyException("密码错误");
        }
        System.out.println("登陆成功");
    }
    public static void main(String[] args)  {
        System.out.println("请输入密码");
        Scanner scan=new Scanner(System.in);
        String password=scan.nextLine();
        try{
            login(password);
        }catch(MyException  MyException){
            MyException.printStackTrace();
        }
    }*/
    /*private static String userName="admin";
    private static String password="123456";
    public static void login(String userName,String password){
        if(!TestDemo.userName.equals(userName)){

        }
        if(!TestDemo.password.equals(password)){

        }
        System.out.println("登陆成功");
    }
    public static void main(String[] args) {
       login("admin","123456");
    }*/
}
