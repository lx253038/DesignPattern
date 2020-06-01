package adapter;

/**
 * @Author LX
 * @Date 2020/5/31 16:23
 * @Description 类适配器类（继承源类实现目标接口）
 */
public class VcClassAdapter extends OutVc220 implements OutVc5 {
    @Override
    public int output5v() {
        //得到源电压220v
        int source = outPrint220();
        //转换成目标所需要的5v
        int target = source / 44;
        return target;
    }
}
