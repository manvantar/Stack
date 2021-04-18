package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTester {
    MyNode<Integer> node1 = new MyNode<>(30);
    MyNode<Integer> node2 = new MyNode<>(56);
    MyNode<Integer> node3 = new MyNode<>(70);


    @Test
    public void testpushFirstAtFirst() {
        Stack Stack2 = new Stack();
        Stack2.push(node1);
        Stack2.push(node2);
        Stack2.push(node3);
        String result2 = Stack2.printMyNodes();
        Assertions.assertEquals("70->56->30", result2);
    }
    @Test
    public void testpop(){
        Stack Stack2 = new Stack();
        Stack2.push(node1);
        Stack2.push(node2);
        Stack2.push(node3);
        INode result=Stack2.pop();
        Assertions.assertEquals(node3,result);
        Stack2.printMyNodes();
        INode result2=Stack2.pop();
        Stack2.printMyNodes();
        Assertions.assertEquals(node2,result2);
        INode result5=Stack2.pop();
        Assertions.assertEquals(node1,result5);
        Stack2.printMyNodes();

    }
}
