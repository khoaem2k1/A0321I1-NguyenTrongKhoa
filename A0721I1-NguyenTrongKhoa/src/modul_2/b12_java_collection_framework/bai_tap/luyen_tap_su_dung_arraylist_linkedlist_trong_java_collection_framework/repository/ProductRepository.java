package b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.repository;

import b12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
    }

    public void addProduct(Product p){
        productList.add(p);
    }

    public boolean editProduct(Product p){
        for (Product product: productList) {
            if (product.getId() == p.getId()){
                product.setName(p.getName());
                product.setPrice(p.getPrice());
                return true;
            }
        }
        return false;
    }

    public  boolean deleteProduct(int id){
        Product p = null;
        for (Product product : productList){
            if (product.getId() == id){
                productList.remove(product);
                return true;
            }
        }
        if (p != null){
            productList.remove(p);
        }
        return false;
    }
    public List<Product> getProductList(){
        return productList;
    }
    public Product getProductById(int id){
        for (Product product : productList){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }
}
