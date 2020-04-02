package practice;

import java.util.Scanner;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data;
        private Node next;
        public Node (Object input) {
            this.data = input;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    '}';
        }
    }


    public void addFirst (Object input) {
        Node newNode = new Node(input);

        newNode.next = head;
        head = newNode;
        size ++;
        if(head.next == null) {
            tail = head;
        }
    }

    public void addLast (Object input) {
        Node temp = new Node(input);

        if(size == 0) {
            addFirst(input);
        } else {
            tail.next = temp;
            tail = temp;
            size ++;
        }
    }

    public String toString() {
        // 노드가 없다면 []를 리턴합니다.
        if(head == null){
            return "[]";
        }
        // 탐색을 시작합니다.
        Node temp = head;
        String str = "[";
        // 다음 노드가 없을 때까지 반복문을 실행합니다.
        // 마지막 노드는 다음 노드가 없기 때문에 아래의 구문은 마지막 노드는 제외됩니다.
        while(temp.next != null){
            str += temp.data + ",";
            temp = temp.next;
        }
        // 마지막 노드를 출력결과에 포함시킵니다.
        str += temp.data;
        return str+"]";
    }

    public Object removeFirst () {
        Node temp = head;
        head = temp.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }

    public Object remove (int k) {
        if(k == 0) return removeFirst();

        Node temp = node(k-1);

        Node todoDeleted = temp.next;
        temp.next = temp.next.next;

        Object returnData = todoDeleted.data;
        if(todoDeleted == tail) {
            tail = temp;
        }
        todoDeleted = null;
        size --;
        return returnData;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split("->");
        int index = sc.nextInt();
        LinkedList linkedList = new LinkedList();
        for(int i=0 ; i< input1.length; i++) {
            linkedList.addLast(input1[i]);
        }
        linkedList.remove(input1.length - index);
        System.out.println(linkedList.toString());
    }
}
