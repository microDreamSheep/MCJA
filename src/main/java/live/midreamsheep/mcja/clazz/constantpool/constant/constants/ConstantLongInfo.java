package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class ConstantLongInfo implements MCJAConstant {

    private byte[] bytes;
    private final ConstantEnum type = ConstantEnum.CONSTANT_LONG;

    @Override
    public boolean setData(byte[] data) throws IllDataTypeException {
        if(data.length!=8){
            throw new IllDataTypeException("CONSTANT_LONG need eight byte data");
        }
        //数据注入
        bytes = data;
        return true;
    }

    @Override
    public int getLength() {
        return 8;
    }

    @Override
    public byte[] getData() {
        return bytes;
    }

    @Override
    public ConstantEnum getType() {
        return null;
    }
}
