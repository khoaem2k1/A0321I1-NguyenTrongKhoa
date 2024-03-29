package b14_thuat_toan_sap_xep.thuc_hanh.cai_dat_thuat_toan_noi_bot;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class BubbleSort {
    static int[] list = {2, 3, 2, 7 ,9 , 10, -1, -2};

    public static void bubbleSort(int[] list){
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++){
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++){
                if (list[i] > list[i + 1]){
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}

