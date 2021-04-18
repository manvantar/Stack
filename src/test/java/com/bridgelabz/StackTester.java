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

}
