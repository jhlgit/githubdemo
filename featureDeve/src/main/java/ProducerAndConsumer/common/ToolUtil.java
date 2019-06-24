package ProducerAndConsumer.common;

/**
 * Created by Administrator on 2019/3/28.
 */

public class ToolUtil {
    private static int i=0;
    public static ToolUtil toolUtil;
    public synchronized int getNum(){
        return i++;
    }

    public static  ToolUtil getToolUtil(){
        if (null == toolUtil){
            toolUtil = new ToolUtil();
        }
        return toolUtil;
    }

}
