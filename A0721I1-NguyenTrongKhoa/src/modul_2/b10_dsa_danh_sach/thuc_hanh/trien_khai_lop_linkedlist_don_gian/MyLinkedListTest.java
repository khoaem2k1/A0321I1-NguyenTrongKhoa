package b10_dsa_danh_sach.thuc_hanh.trien_khai_lop_linkedlist_don_gian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);

        ll.add(4,5);
        ll.add(4,5);
        ll.printList();
    }
}
