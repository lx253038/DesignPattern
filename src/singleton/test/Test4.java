package singleton.test;

import java.util.concurrent.*;

import singleton.lanhanshi.Singleton4;

/**
 * @author LX
 * @date 2018-11-5 18:23
 */
public class Test4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*        Singleton4 s1=Singleton4.getSingleton4();
        Singleton4 s2=Singleton4.getSingleton4();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);*/

        Callable<Singleton4> call = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getSingleton4();
            }
        };
        ExecutorService rs = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = rs.submit(call);
        Future<Singleton4> f2 = rs.submit(call);


        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

    }

}
