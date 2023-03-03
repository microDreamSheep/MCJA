package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class ConstantStringInfo implements MCJAConstant {

    private byte[] index;
    private static final ConstantEnum type = ConstantEnum.CONSTANT_STRING;
    @Override
    public boolean setData(byte[] data) throws IllDataTypeException {
        if(data.length!=2){
            throw new IllDataTypeException("ConstantStringInfo need four byte");
        }
        index = data;
        return true;
    }

    @Override
    public int getLength() {
        return 2;
    }

    @Override
    public byte[] getData() {
        return index;
    }

    @Override
    public ConstantEnum getType() {
        return type;
    }
}
