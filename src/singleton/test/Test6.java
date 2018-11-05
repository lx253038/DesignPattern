package singleton.test;

import java.util.concurrent.*;

import singleton.lanhanshi.Singleton6;

/**
 * @author LX
 * @date 2018-11-5 18:23
 */
public class Test6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*        Singleton6 s1=Singleton6.getInstance();
        Singleton6 s2=Singleton6.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);*/
        Callable<Singleton6> call = new Callable<Singleton6>() {
            @Override
            public Singleton6 call() throws Exception {
                return Singleton6.getInstance();
            }
        };
        ExecutorService rs = Executors.newFixedThreadPool(2);
        Future<Singleton6> f1 = rs.submit(call);
        Future<Singleton6> f2 = rs.submit(call);


        Singleton6 s1 = f1.get();
        Singleton6 s2 = f2.get();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

    }

}
