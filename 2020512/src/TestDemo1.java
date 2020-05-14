/*
 * @program: 2020512
 * @description
 * 编写代码使用 A 这个泛型类
 * @author: mrs.yang
 * @create: 2020 -05 -13 16 :43
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestDemo1 {
    public static void main(String[] args) {
       List<String> list=new ArrayList<>();//默认是10，超过以1.5倍扩容
       list.add("hello");
       list.add("bit");
        List<String> list1=new ArrayList<>();//list1需要实现collection接口，
        // 而且类型必须是E的子类或者本身
       list1.add("java");
        list.addAll(list1);
        System.out.println(list);
        String ret=list.remove(0);
        System.out.println(ret);
        list.remove("bit");
        System.out.println(list);
        ret=list.get(0);
        System.out.println(ret);
        list.set(0,"world");//相当于是更新，将0号下标内容替换为world
        System.out.println(list);
        System.out.println(list.contains("world"));
        System.out.println(list.indexOf("world"));
        //从后往前查找第一次出现字符串的下标
        list.add("test");
        list.add("world");
        System.out.println(list.lastIndexOf("world"));
        List<String> ret1=list.subList(0,2); //相当于浅拷贝，通过set修改ret1也会改变
    }
    public static void main1(String[] args) {//去掉重复的字符
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            StringBuffer ret = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String tmp = ret.toString();
                if (!tmp.contains(ch + "")) {
                    ret.append(ch);
                }
            }
            System.out.println(ret);
        }
    }
}
