package b11_dsa_stack_queue.thuc_hanh.trien_khai_stack;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Kích thước của ngăn xếp sau các hoạt động đẩy: " + stack.size());
        System.out.printf("1.2. Các phần tử pop từ ngăn xếp : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Kích thước của ngăn xếp sau các hoạt động bật lên : " + stack.size());
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Kích thước của ngăn xếp sau các hoạt động đẩy: " + stack.size());
        System.out.printf("2.2. Các phần tử pop từ ngăn xếp : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Kích thước của ngăn xếp sau các hoạt động bật lên : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1.Sắp xếp chuỗi ");
        stackOfIStrings();

        System.out.println("\n2. Chồng số nguyên");
        stackOfIntegers();
    }
}
