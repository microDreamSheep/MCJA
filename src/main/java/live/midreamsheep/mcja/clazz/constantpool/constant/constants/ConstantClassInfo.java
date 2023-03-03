package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class ConstantClassInfo implements MCJAConstant {
    private final byte[] name_index = new byte[2];
    private final ConstantEnum type = ConstantEnum.CONSTANT_CLASS;
    @Override
    public boolean setData(byte[] data) throws IllDataTypeException {
        if(data.length!=2){
            throw new IllDataTypeException("CONSTANT_CLASS_INFO need two byte name_index");
        }
        name_index[0] = data[0];
        name_index[1] = data[1];
        return true;
    }

    @Override
    public int getLength() {
        return 2;
    }

    @Override
    public byte[] getData() {
        return name_index;
    }

    @Override
    public ConstantEnum getType() {
        return type;
    }
}
