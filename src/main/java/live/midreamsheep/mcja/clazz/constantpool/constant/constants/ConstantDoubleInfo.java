package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class ConstantDoubleInfo implements MCJAConstant {
    private byte[] data;
    private static final ConstantEnum type = ConstantEnum.CONSTANT_DOUBLE;

    @Override
    public boolean setData(byte[] data) throws IllDataTypeException {
        if(data.length!=8){
            throw new IllDataTypeException("CONSTANT_DOUBLE need eight byte data");
        }
        this.data = data;
        return true;
    }

    @Override
    public int getLength() {
        return 8;
    }

    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public ConstantEnum getType() {
        return type;
    }
}
