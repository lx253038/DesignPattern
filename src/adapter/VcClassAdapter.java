package adapter;

/**
 * @Author LX
 * @Date 2020/5/31 16:23
 * @Description ���������ࣨ�̳�Դ��ʵ��Ŀ��ӿڣ�
 */
public class VcClassAdapter extends OutVc220 implements OutVc5 {
    @Override
    public int output5v() {
        //�õ�Դ��ѹ220v
        int source = outPrint220();
        //ת����Ŀ������Ҫ��5v
        int target = source / 44;
        return target;
    }
}
