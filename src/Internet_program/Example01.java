package Internet_program;

import java.io.IOException;
import java.net.InetAddress;
public class Example01 {
    public static void main(String[] args) throws IOException {
        InetAddress loccalAddress = InetAddress.getLocalHost();
        InetAddress remoteName = InetAddress.getByName("www.itcast.cn");
        System.out.println("本机的ip地址" + loccalAddress.getHostAddress());
        System.out.println("itcast的ip地址" + remoteName.getHostAddress());
        System.out.println("3秒是否可达" + remoteName.isReachable(3000));
        System.out.println("itcast的主机名" + remoteName.getHostAddress());



    }
}
