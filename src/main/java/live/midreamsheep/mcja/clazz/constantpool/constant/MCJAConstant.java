package live.midreamsheep.mcja.clazz.constantpool.constant;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.error.IllDataTypeException;

public interface MCJAConstant {

    boolean setData(byte[] data) throws IllDataTypeException;

    int getLength();
    /**
     * 获取字节数据
     * */
    byte[] getData();

    ConstantEnum getType();
}