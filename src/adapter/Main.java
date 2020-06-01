package adapter;

/**
 * @Author LX
 * @Date 2020/5/31 18:13
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();

        System.out.println("================¿‡  ≈‰∆˜===================");
        VcClassAdapter vcClassAdapter = new VcClassAdapter();
        phone.charging(vcClassAdapter);

        System.out.println("================¿‡  ≈‰∆˜===================");
        VcObjectAdapter vcObjectAdapter = new VcObjectAdapter(new OutVc220());
        phone.charging(vcObjectAdapter);
    }
}
