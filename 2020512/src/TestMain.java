/*
 *
 * @program: 2020512
 * @description
 * 集合
 * @author: mrs.yang
 * @create: 2020 -05 -12 17 :06
 */

import java.util.*;
/*class MyArraysList{
    public int usedSize;
    public int[] arr;
    public MyArraysList(){
        this.usedSize=0;
        this.arr=new int[10];
    }
    private boolean isFull(){
        if(this.usedSize==this.arr.length){
            return true;
        }
        return false;
    }
    public void add(int pos,int data){
        //判断数组是否已满
        if(isFull()){
            //增容2倍
            this.arr=Arrays.copyOf(this.arr,2*this.arr.length);
        }
        //判断POS是否合法
        if(pos<0||pos>this.usedSize){
            return;
        }
        //放置
        for (int i = this.usedSize-1; i >=pos ; i--) {
           this.arr[i+1]=this.arr[i];
        }
        this.arr[pos]=data;
        this.usedSize++;
    }
    public void display(){
        for (int i = 0; i < this.usedSize ; i++) {
           System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }
    public boolean contains(int toFind){
        for (int i = 0; i < this.usedSize ; i++) {
            if(this.arr[i]==toFind){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for (int i = 0; i < this.usedSize ; i++) {
            if(this.arr[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    private boolean isEmpty(){
        if(this.usedSize==0){
            return true;
        }
        return false;
    }
    public int getPos(int pos){
        //判断数组是否为空
        if(isEmpty()){
            throw new RuntimeException("顺序表为空");
        }
        //判断pos位置是否合法
        if(pos<0||pos>=this.usedSize){
            return -1;
        }
        return this.arr[pos];
    }
    //删除元素中第一次出现的关键字
    public void remove(int key){
        int index=search(key);
        if(index==-1){
            System.out.println("没有要删除的元素");
            return;
        }
        for (int i = index; i <this.usedSize-1 ; i++) {
            this.arr[i]=this.arr[i+1];
        }
        this.usedSize--;
    }
    public void clear(){
        this.usedSize=0;
    }
}*/
public class TestMain {
    public static void main(String[] args) {
       /* MyLinkedList list=new MyLinkedList();
       *//* list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();*//*
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(4);
        list.addLast(2);
        *//*list.display();
        System.out.println(list.size());
        /*list.addIndex(0,0);
        list.display();
        list.addIndex(5,5);
        list.display();
        list.addIndex(2,6);
        list.display();
        System.out.println(list.contains(5));
        list.remove(0);
        list.display();*//*
        list.removeAll(2);
        list.display();*/
    }
    /*public static void main(String[] args) {
        //实现ArrayList类
        MyArraysList list=new MyArraysList();
        for (int i = 0; i < 10; i++) {
            list.add(i,i+1);
        }
        list.display();
        System.out.println(list.contains(8));
        System.out.println(list.search(7));
        System.out.println(list.getPos(8));
        list.remove(11);
        list.display();
        list.clear();
        list.display();
    }*/
    public static void main3(String[] args) {
        //装箱   拆箱
        int i=10;
        Integer ii=new Integer(i);//装箱
        Integer ij=Integer.valueOf(i);//装箱
        int j=ii.intValue();//拆箱
    }
    public static void main2(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("女神","高圆圆");//k-->v
        map.put("男神","思聪");
        map.put("及时雨","宋江");
       // map.put("及时雨","宋江1");
        System.out.println(map);//底层实现tostring方法
        System.out.println(map.get("及时雨"));//get (k)-->v
        System.out.println(map.getOrDefault("及时雨", "lisi"));
        //k值如果重复，打印出来的v值是最后的那个值（最新的）
        System.out.println(map.get("及时雨"));//宋江1
        //哈希表打印数据时不会按照存储的顺序
        System.out.println(map.containsKey("女神"));
        System.out.println(map.containsValue("高圆圆"));
        //返回所有键值对,放到Map.Entry<String,String>类型的集合中
        Set<Map.Entry<String,String>> set=map.entrySet();
        for (Map.Entry<String,String> entry:set) {
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
    }
    public static void main1(String[] args) {
        Collection<String> collection=new ArrayList<>();//collection是接口，发生向上转型
        collection.add("bit");
        collection.add("hello");
        collection.add("zhangsan");
        collection.add("lisi");
        System.out.println(collection);
        for (String s:collection) {//可以使用for each->实现了Iterable接口
            System.out.print(s);
        }
        /*System.out.println(collection.isEmpty());//false
        collection.remove("bit");
        System.out.println(collection);//[hello]
        System.out.println(collection.size());//1*/
        /*Object[] object=collection.toArray();
        System.out.println(Arrays.toString(object));*/
    }
}
