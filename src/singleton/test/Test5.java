package singleton.test;

import java.util.concurrent.*;

import singleton.lanhanshi.Singleton4;
import singleton.lanhanshi.Singleton5;

/**
 * @author LX
 * @date 2018-11-5 18:23
 */
public class Test5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*        Singleton5 s1=Singleton4.getSingleton4();
        Singleton5 s2=Singleton5.getSingleton5();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);*/

        Callable<Singleton5> call = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };
        ExecutorService rs = Executors.newFixedThreadPool(2);
        Future<Singleton5> f1 = rs.submit(call);
        Future<Singleton5> f2 = rs.submit(call);


        Singleton5 s1 = f1.get();
        Singleton5 s2 = f2.get();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

    }

}
