package 最小栈;

import com.sun.xml.internal.ws.encoding.policy.MtomPolicyMapConfigurator;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/7 18:49
 * @Version 1.0
 **/
public class MinStack {

    private Deque<Integer> data;

    private Deque<Integer> helper;

    public MinStack() {
        data = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
        data.addFirst(x);
        if (helper.isEmpty() || helper.getFirst() >= x) {
            helper.addFirst(x);
        }else {
            helper.addFirst(helper.getFirst());
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            helper.removeFirst();
            data.removeFirst();
        }
    }

    public int top() {
        if (!data.isEmpty()) {
            return data.getFirst();
        }
        throw new RuntimeException("栈中元素为空");
    }

    public int getMin() {
        if (!helper.isEmpty()) {
            return helper.getFirst();
        }
        throw new RuntimeException("栈中元素为空");
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
