package b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.controller;

import b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.entity.Product;
import b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service.ProductService;

import java.util.List;

public class ProductManager {
    public static void main(String[] args) {
        Product p1 = new Product(1,"Giay", 2000);
        Product p2 = new Product(1,"Áo", 2100);
        Product p3 = new Product(1,"Quần", 2200);
        Product p4 = new Product(1,"Sách", 2300);
        Product p5 = new Product(1,"Vở", 2400);
        Product p6 = new Product(1,"Giay", 2500);
        ProductService service = new ProductService();
        service.addProduct(p1);
        service.addProduct(p2);
        service.addProduct(p3);
        service.addProduct(p4);
        service.addProduct(p5);
        service.addProduct(p6);

        List<Product> products = service.getProductList();
        service.sortByNameAsc(products);
        products.stream().forEach(p -> System.out.println(p));
    }
}
