package 用两个栈实现队列;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/22 14:21
 * @Version 1.0
 **/
public class CQueue {

    LinkedList<Integer> A, B;
    public CQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }
    public void appendTail(int value) {
        A.addLast(value);
    }
    public int deleteHead() {
        if(!B.isEmpty()) return B.removeLast();
        if(A.isEmpty()) return -1;
        while(!A.isEmpty())
            B.addLast(A.removeLast());
        return B.removeLast();
    }

//    Stack<Integer> stack1;
//    Stack<Integer> stack2;
//    int size;
//    public CQueue() {
//        stack1 = new Stack<>();
//        stack2 = new Stack<>();
//        size = 0;
//    }
//
//    public void appendTail(int value) {
//        while(!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
//        stack1.push(value);
//        while(!stack2.isEmpty()){
//            stack1.push(stack2.pop());
//        }
//        size++;
//    }
//
//    public int deleteHead() {
//        if(size == 0){
//            return -1;
//        }
//        size--;
//        return stack1.pop();
//    }

}
