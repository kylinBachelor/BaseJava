import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ServiceLoader;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.util.StringUtils;



class test {


    // public static void main(String[] args) {
    //     String str = "123456789123123";
    //     String removeStr = "123";
    //     System.out.println(removeAllStr(removeStr, str));
    // }

     public static void main(String[] args) {


        CompletableFuture<String> supplyFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("sleep 3s");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello world";
        });
        // try {
        //     System.out.println(supplyFuture.get());
        // } catch (InterruptedException | ExecutionException e) {
        // }
        supplyFuture.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("index:" + i);
        };
        


        /**
         * 栈：    局部变量       用于存储基本数据类型和方法调用信息
         * 堆：    成员变量       用于存储对象和引用 包括对象的实例变量和引用
         * 方法区：静态（类）字段  用于存储类信息、常量、静态变量以及即时编译器编译后的代码等数据
         */


        //  String str = "丛培通_202424238988_739.4_72.3.4.png";
        //  System.out.println(str.indexOf("_"));
        //  String originName = str.substring(0, str.indexOf("_"));
        //  System.out.println(originName);
        //  String prefix = str.substring(str.lastIndexOf(".") + 1);
        //  System.out.println(prefix);

        //  String str1= ",1,2,3,4,5,6,7,8,9,";
        //  String[] split = str1.split(",");
        //  for (String s : split) {
        //      System.out.println(s);
        //  }

        //  BigDecimal a = new BigDecimal(5);
        //  BigDecimal b = new BigDecimal(6);
        //  System.out.println(a.multiply(b));
        //  System.out.println(a);
        //  System.out.println(b);

         
         


    }




    /**
    * 去除第一个找到的字符串
    * @Author congpeitong
    * @Date 2024/7/30 16:15
    * @param removeStr 索要去除的字符串
    * @param sourceStr 原字符串
    * @return java.lang.String
    */
    public static String removeFirstStr(String removeStr, String sourceStr) {
        if (!StringUtils.hasText(sourceStr)) {
            return null;
        }
        if (!StringUtils.hasText(removeStr)) {
            return sourceStr;
        }
        if (removeStr.length() >= sourceStr.length()) {
            return sourceStr;
        }
        int prefixIndex = sourceStr.indexOf(removeStr);
        if (prefixIndex == -1) {
            return sourceStr;
        }
        String frontStr = sourceStr.substring(0, prefixIndex);
        String behindStr = sourceStr.substring(prefixIndex + removeStr.length());
        return frontStr + behindStr;
    }

    public static String removeAllStr(String removeStr, String sourceStr) {
        if (!StringUtils.hasText(sourceStr)) {
            return null;
        }
        if (!StringUtils.hasText(removeStr)) {
            return sourceStr;
        }
        if (removeStr.length() >= sourceStr.length()) {
            return sourceStr;
        }
        String str = removeFirstStr(removeStr, sourceStr);
        if (str == null) {
            return null;
        }
        if (str.indexOf(removeStr) == -1) {
            return str;
        } 
        return removeAllStr(removeStr, str);
        
    }
}
public enum StatusEnum {
    Filling("Filling", "填报中");
    private String code;
    private String name;
    private StatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode(String name) {
        return Arrays.stream(StatusEnum.values()).filter(value -> value.getName().equals(name)).findFirst().get().getCode();
    }

    
}