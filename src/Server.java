import java.net.*;
import java.io.*;
public class Server {
    public static void main(String args[])
    {
        try{
            ServerSocket svs=new ServerSocket(2525);

            System.out.println("等候客戶端的請求...");
            Socket s=svs.accept();
            System.out.println("客戶端已和本機連上線...");

            OutputStream out=s.getOutputStream();
            String str="Honor shows the man.";
            System.out.println("資料正在傳送終");
            out.write(str.getBytes());
            out.close();
            s.close();
            System.out.println("資料傳送完畢...");
        } catch (Exception e){
            System.out.println("發生了"+e+"例外");
        }

    }
}
