package adapter;

/**
 * @Author LX
 * @Date 2020/5/31 16:23
 * @Description �����������ࣨʵ��Ŀ��ӿڳ���Դ����󣬲�ͨ�����췽������Դ����
 */
public class VcObjectAdapter implements OutVc5 {

    private OutVc220 outVc220;

    public VcObjectAdapter(OutVc220 outVc220) {
        this.outVc220 = outVc220;
    }

    @Override
    public int output5v() {
        //�õ�Դ��ѹ220v
        int source = outVc220.outPrint220();
        //ת����Ŀ������Ҫ��5v
        int target = source / 44;
        return target;
    }
}
