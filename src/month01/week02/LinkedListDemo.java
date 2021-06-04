package month01.week02;

/**
 * 链表模块
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //尾插法创建链表
        Node l1 = new Node(-1);
        Node p = l1;
        for (int i = 0; i < 10; i++) {
            p.next = new Node(888);
            p = p.next;
        }
        //头插法
        Node l2 = new Node(-1);
        for (int i = 0; i < 10; i++) {
            Node q = new Node(888);
            q.next = l2.next;
            l2.next = q;
        }
    }
}

/**
 * 声明节点结构
 * 单指针
 */
class Node {
    public int value;
    public Node next;
    public Node() {}
    public Node(int val) {value=val;}
    public Node(int value,Node next) {
        this.value = value;
        this.next = next;
    }
}
/**
 * 双指针节点
 */
class DualNode{
    public int value;
    public Node pre;
    public Node next;
    public DualNode() {}
    public DualNode(int value) {this.value =  value;}
    public DualNode(int value,Node pre,Node next) {
        this.value = value;
        this.pre = pre;
        this.next = next;
    }
}