import com.demo.spi.HelloService;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Start {
    public static void main (String [] args) {
        ServiceLoader<HelloService> loader =ServiceLoader.load(HelloService.class);
        Iterator<HelloService> iter = loader.iterator();
        while(iter.hasNext()){
            iter.next().sayHello();
        }
        System.out.println("done");
    }
}
