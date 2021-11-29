package b10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

import java.util.Arrays;

public class MyList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    //sức chưa  mặc định khi khởi tạo contructor không có tham số
    public MyList() {
        elements  =  new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        if (capacity >= 0){
            elements =  new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    //phương thức trả về số lượng phần tử
    public int size(){
        return this.size;
    }

    //phương tức clear arrayList
    public void clear(){
        size = 0;
        for (int i =0; i < elements.length; i++){
            elements[i] = null;
        }
    }


    //tăng gấp đôi kích thước của mảng
    private void ensureCapa(int minCapacity){
        if (minCapacity >= 0){
            int newSize = size * 2;
            elements = Arrays.copyOf(elements, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    //phương thức thêm một phần tử vảo mylist
    public boolean add(T t){
        if (size == elements.length){
            ensureCapa(5);
        }
        elements[size] = t;
        size++;
        return true;
    }

    public void add(T t, int index){
        if (index > elements.length){
            throw new IllegalArgumentException("index: " + index);
        }else if(elements.length == size){
            this.ensureCapa(5);
        }
        if (elements[index]==null){
            elements[index] = t;
            size++;
        }else {
            for (int i = size + 1; i >= index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = t;
            size++;
        }
    }

    //phưng thức lấy 1 element tại vị trí index
    public T get(int index){
        return (T) elements[index];
    }
    //phương thức lấy 1 index của phần tử
    public int indexOf(T t){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(t)){
                return i;
            }
        }
        return index;
    }
    //phương thức kiểm tra 1 phần tử có trong mylisst
    public boolean contains (T t){
        return this.indexOf(t) >= 0;
    }

//Phương thức tạo ra một bản sao của Mylisst hiện tại
    public MyList<T> clone(){
        MyList<T> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }
    //xóa 1 phần tử
    public T remove(int index){
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index: " + index);
        }
        T t = (T) elements[index];
        for (int i = index; i < size - 1; i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return t;

    }
}
