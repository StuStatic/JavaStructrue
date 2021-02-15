package leetcode;

/**
 * Created by chengpiyan on 2021/2/15 10:35 PM
 *
 * @DESCRIPTION:给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */
public class leetcode04 {

    public static void main(String[] args){
        ListNode head = new ListNode();
        ListNode node01 = new ListNode(1);
        ListNode node02 = new ListNode(2);
        ListNode node03 = new ListNode(2);
        ListNode node04 = new ListNode(4);
        ListNode node05 = new ListNode(4);
        ListNode node06 = new ListNode(5);
        head.next = node01;
        node01.next = node02;
        node02.next = node03;
        node03.next = node04;
        node04.next = node05;
        node05.next = node06;
        node06.next = null;

        print(delDuplicates(head));

    }

    public static ListNode delDuplicates(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){//相邻结点比较;保留值第一次出现时的结点；
                temp.next = temp.next.next;//后结点值与当前结点值相等，就删除后结点
            }else{//不相等,后移尾指针;
                temp = temp.next;
            }
        }
        return head;
    }

    public static void print(ListNode head){
        if(head.next == null){
            System.out.println("当前列表为空");
            return;
        }
        ListNode temp = head.next;
        while (true) {
            //判断是否到链表最后
            if (temp == null) {
                break;
            }
            System.out.println(temp.val);
            //将temp后移
            temp = temp.next;
        }
    }
}

class ListNode{
    int val;
    ListNode next;

    public ListNode(){

    }

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
