package b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.service;

import b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.entity.Product;
import b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.repository.ProductRepository;
import b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.ultiul.SortProductByNameAsc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();


    public void addProduct(Product p){
        productRepository.addProduct(p);
    }

    public boolean editProduct(Product p){
       return productRepository.editProduct(p);
    }

    public  boolean deleteProduct(int id){
        return productRepository.deleteProduct(id);
    }
    public List<Product> getProductList(){
        return productRepository.getProductList();
    }
    public Product getProductById(int id){
        return productRepository.getProductById(id);
    }
    public List<Product> findProductByName(String name){
        return productRepository.getProductList();
    }
    public void sortByNameAsc(List<Product> list){
        Collections.sort(list, new SortProductByNameAsc());
    }
}
