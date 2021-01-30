package class1;

/**
 * 单链表
 */
public class LinkedList_04 {

    public static void main(String[] args) {
        //创建数据
        ListNode head = new ListNode();
        ListNode listNode1 = new ListNode("节点01", head);
        ListNode listNode2 = new ListNode("节点02", head);
        ListNode listNode3 = new ListNode("节点03", head);
        ListNode listNode4 = new ListNode("节点04", head);
        head.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        //测试遍历
//        new ListNode(null).print();

        //测试链表尾部添加,结果应为ListNode1-ListNode2-ListNode3-ListNode4-ListNode5
//        ListNode listNode5 = new ListNode("节点05", head);
//        ListNode.add(listNode5);
//        ListNode.print();

        //测试在pos=3的位置添加，结果应为ListNode1-ListNode2-ListNode5-ListNode3-ListNode4
//        ListNode listNode5 = new ListNode("节点05", head);
//        ListNode.addByOrder(listNode5, 3);
//        ListNode.print();

        //测试链表反转
        ListNode listNode = ListNode.reverse(head);
        ListNode.revertPrint(listNode);
    }
}

//定义一个节点ListNode，每个节点包括数据域和指针域
class ListNode {
    public String data;
    public ListNode next;//指向下一个节点
    public static ListNode head;

    public ListNode(String data, ListNode head) {
        this.data = data;
        this.head = head;
    }

    public ListNode(String data) {
        this.data = data;
    }

    public ListNode() {

    }

    //在链表尾部直接添加节点
    public static void add(ListNode listNode) {
        //1创建temp节点
        ListNode temp = head;
        //2遍历链表
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
        temp.next = listNode;
    }

    //在链表指定位置添加节点
    //节点对应pos:head-0;ListNode1-1;ListNode2-2
    public static void addByOrder(ListNode listNode, int position) {
        //设置一个标识位
        int pos = 0;
        //设置temp
        ListNode temp = head;
        //添加到指定位置的前一个节点
        while (true) {
            if (temp.next == null) {
                break;
            }
            pos++;
            temp = temp.next;
            if (pos == position - 1) {
                listNode.next = temp.next;
                temp.next = listNode;
            }
        }
    }

    //链表反转
    public static ListNode reverse(ListNode head) {
        ListNode front = head;//01
        ListNode after = head.next;//02
        ListNode temp;
        while (after != null) {
            temp = after.next;//03
            after.next = front;//02->01
            front = after;//01
            after = temp;
        }
        head.next = null;
        return front;
    }

    //打印所有节点(不包括链表反转方法的打印)
    public static void print() {
        //1先判断链表是否为null
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        //2需要一个辅助temp节点来获取每个节点
        ListNode temp = head.next;
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

    public static void revertPrint(ListNode listNode){
        ListNode temp = listNode;//遍历用到的临时变量
        while (true) {
            if(temp.next == null){
                break;
            }
            System.out.println(temp.data);
            //将temp后移
            temp = temp.next;
        }
    }

}
