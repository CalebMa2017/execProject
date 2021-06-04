package month01.week03;

/**
 * 实现递归：增加 插入
 * 删除 value index
 * update value index
 * 查找 value isexist? index
 */
public class HomeTest {
    public static void main(String[] args) {
        NodeManage nm = new NodeManage();
        nm.print();
        nm.add(3);
        nm.add(4);
        nm.add(3);
        nm.add(6);
        nm.add(6);
        nm.add(6);
        nm.print();
        System.out.println(nm.lastIndexOf(3));
    }
}
class NodeManage {
    private Node root;
    int currentIndex;

    /**
     * 末索引
     * @param value
     * @return
     */
    public int lastIndexOf(int value) {
        if(null==root) return -1;
        currentIndex=0;
        return root.lastIndexOfNode(value);
    }
    /**
     * 首索引
     * @param value
     * @return
     */
    public int firstIndexOf(int value) {
        currentIndex=0;
        if(null==root) return -1;
        return root.firstIndexOfNode(value);
    }
    /**
     * 把指定索引的值更新
     * @param value
     * @param index
     */
    public void updateByValue(int value,int index) {
        currentIndex = 0;
        if(null!=root) {
            root.updateNode1(value,index);
        }
    }
    /**
     * 插入结点
     * @param value
     */
    public void insert(int value,int index) {
        currentIndex = 0;
        if(index==0) {
            Node node = new Node(value);
            node.next=root;
            root = node;
        }else {
            root.insertNode(value,index);
        }
    }
    /**
     * 根据索引删除   1   1    1    1   1
     * @param index
     */
    public void deleteByIndex(int index) {
        if(index<0) {
            System.out.println("索引有误");
            return;
        }
        if(root == null) {
            System.out.println("不能进行操作");
            return;
        }
        if(index == currentIndex) {
            root = root.next;
        }else {
            root.deleteNode2(index);
        }

    }
    /**
     * 根据值删除
     * @param value 1 1 1 1 1
     */
    public void delete(int value) {
        if(root==null) return;
        if(root.val==value) {
            root.deleteNode(value);
            root = root.next;
        }
        else root.deleteNode(value);
    }
    public void add(int val) {
        if(null==root) root = new Node(val);
        else root.addNode(val);
    }
    public void print() {//生成方法的快捷键
        if(null==root) System.out.println("null");
        else root.printNode();
    }
    class Node {
        private int val;
        Node next;
        Node(int val) {this.val = val;}

        /**
         * 尾索引
         * @param value
         * @return
         */
        public int lastIndexOfNode(int value) {
            int result=-1;
            Node p=this;
            while (null!=p) {
                if(p.val==value){
                    result=currentIndex;
                }
                p = p.next;
                currentIndex++;
            }
            return result;
        }
        /**
         * 首索引
         * @param value
         * @return
         */
        public int firstIndexOfNode(int value) {
            if(this.val==value) return currentIndex;
            currentIndex++;
            return this.next.firstIndexOfNode(value);
        }
        /**
         * 更新结点
         * @param value
         * @param index
         */
        public void updateNode1(int value,int index) {
            if(currentIndex++==index) {
                this.setVal(value);
            }else {
                this.next.updateNode1(value,index);
            }
        }
        /**
         * 根据索引插入结点
         * @param value
         * @param index
         */
        public void insertNode(int value,int index){
            if(++currentIndex==index){
                this.next = new Node(index);
            }else {
                this.next.insertNode(value,index);
            }
        }
        public void deleteNode2(int index) {
            if(++currentIndex==index) {
                this.next = this.next.next;
            }else {
                this.next.deleteNode2(index);
            }
        }
        /**
         * 根据值删除
         * @param val  1 1 1 1 1
         */
        public void deleteNode(int val) {
            if(this.next==null) return;
            if(this.next.val==val){
                this.next= this.next.next;
                this.deleteNode(val);
            }else {
                this.next.deleteNode(val);
            }
        }
        /**
         * addNode的第一种逻辑
         * @param val
         */
        public void addNode(int val) {
            if(null!=this.next){
                this.next.addNode(val);
                return;
            }
            this.next = new Node(val);
        }
        /**
         * 打印结点
         * @return
         */
        public void printNode() {
            if(this.next==null) System.out.println(this.getVal());
            else {
                System.out.print(this.getVal()+"->");
                this.next.printNode();
            }
        }
        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}