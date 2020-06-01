package adapter;

/**
 * @Author LX
 * @Date 2020/5/31 16:23
 * @Description 对象适配器类（实现目标接口持有源类对象，并通过构造方法传入源对象）
 */
public class VcObjectAdapter implements OutVc5 {

    private OutVc220 outVc220;

    public VcObjectAdapter(OutVc220 outVc220) {
        this.outVc220 = outVc220;
    }

    @Override
    public int output5v() {
        //得到源电压220v
        int source = outVc220.outPrint220();
        //转换成目标所需要的5v
        int target = source / 44;
        return target;
    }
}
