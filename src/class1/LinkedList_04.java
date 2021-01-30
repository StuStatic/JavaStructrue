package class1;

/**
 * 单链表
 */
public class LinkedList_04 {

    public static void main(String[] args) {
        //创建数据
//        Node head = new Node();
//        Node node1 = new Node("节点01", head);
//        Node node2 = new Node("节点02", head);
//        Node node3 = new Node("节点03", head);
//        Node node4 = new Node("节点04", head);
//        head.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = null;
        //测试遍历
//        new Node(null).print();

        //测试链表尾部添加,结果应为node1-node2-node3-node4-node5
//        Node node5 = new Node("节点05", head);
//        Node.add(node5);
//        Node.print();

        //测试在pos=3的位置添加，结果应为node1-node2-node5-node3-node4
//        Node node5 = new Node("节点05", head);
//        Node.addByOrder(node5, 3);
//        Node.print();

        //测试链表反转
        Node node1 = new Node("节点01");
        Node node2 = new Node("节点02");
        Node node3 = new Node("节点03");
        Node node4 = new Node("节点04");
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        Node.reverse(node1);
//        Node.print();
    }
}

//定义一个节点Node，每个节点包括数据域和指针域
class Node {
    public String data;
    public Node next;//指向下一个节点
    public static Node head;

    public Node(String data, Node head) {
        this.data = data;
        this.head = head;
    }

    public Node(String data) {
        this.data = data;
    }

    public Node() {

    }

    //在链表尾部直接添加节点
    public static void add(Node node) {
        //1创建temp节点
        Node temp = head;
        //2遍历链表
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
        temp.next = node;
    }

    //在链表指定位置添加节点
    //节点对应pos:head-0;node1-1;node2-2
    public static void addByOrder(Node node, int position) {
        //设置一个标识位
        int pos = 0;
        //设置temp
        Node temp = head;
        //添加到指定位置的前一个节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            pos++;
            temp = temp.next;
            if (pos == position - 1) {
                node.next = temp.next;
                temp.next = node;
            }
        }
    }

    //链表反转
    //先找到node1,node2->temp=node2->temp.next=node1->node3 = node2.next
    public static void reverse(Node node) {
        Node temp = node;//控制链表顺序遍历
        Node revert;//链表反转所用中间变量
        while (true) {
            if (temp == null) {
                break;
            }
            revert = temp.next;
//            System.out.println("revert.data：" + revert.data);
//            if (temp.data == null) {
//                revert.next = null;
//            } else {
//                revert.next = temp;
//                if (revert.next.data != null)
//                    System.out.println("revert.next.data：" + revert.next.data);
//            }
            System.out.println("当前节点：" + temp.data);
            temp = temp.next;
        }
    }

    //打印所有节点
    public static void print() {
        //1先判断链表是否为null
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        //2需要一个辅助temp节点来获取每个节点
        Node temp = head.next;
        while (true) {
            //判断是否到链表最后
            if (temp == null) {
                break;
            }
            System.out.println(temp.data);
            //将temp后移
            temp = temp.next;
        }
    }
}
