package MyCollections;

/*
 * 队列接口
 * 
 * 队列实现有两种实现方式，
 *      1. 使用循环数组
 *      2. 使用链表
 */
public interface MyQueue<E> {
    void add(E element); // 增加元素
    E remove(); // 移除元素
    int size(); // 队列元素的大小
}