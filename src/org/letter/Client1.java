package org.letter;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {


    //bad code
    public static void main(String[] args)throws Exception {


        Socket socket = new Socket("10.10.10.90",7777); // 로컬호스트=127.0.0.1
        System.out.println(socket);
        InputStream in = socket.getInputStream();
        OutputStream out = new FileOutputStream("c:\\zzz\\sample2.jpg");

        byte[] buffer = new byte[1024*8];


        //read write
        while(true) {
            int count = in.read(buffer);
            System.out.println("COUNT: " + count);

            if (count == -1) {
                System.out.println("끝났어 그만받아 ㅡㅡ;");
                break;
            }
            out.write(buffer, 0, count); // 0번째부터 카운트까지 씀.

        }



        in.close();  //close를 해줘야 메모리 할당된것을 풀어줌.
        out.close();

        socket.close();
    }
}
