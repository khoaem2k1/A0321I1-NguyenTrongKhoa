package b12_java_collection_framework.thuc_hanh.su_dung_hashmap_linkedhashmap_treemap_de_luu_danh_sach_sinh_vien_theo_do_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Hiển thị các mục trong HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nTuổi " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
