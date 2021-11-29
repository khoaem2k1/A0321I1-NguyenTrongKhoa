package b16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.nio.file.Files;


public class CopyFile {
    public static void main(String[] args) throws IOException {
        File source = new File("C:\\Users\\KHOA PUG\\Desktop\\result.txt");
        File target = new File("C:\\Users\\KHOA PUG\\Desktop\\result1.txt");

        InputStream ip = null;
        OutputStream op = null;

        try {
            ip = new FileInputStream(source);
            op = new FileOutputStream(target);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = ip.read(bytes))> 0){
                op.write(bytes, 0 , length);
            }
        }finally {
            if (ip != null){
                ip.close();
            }
            if (op != null){
                op.close();
            }
        }
    }
}
