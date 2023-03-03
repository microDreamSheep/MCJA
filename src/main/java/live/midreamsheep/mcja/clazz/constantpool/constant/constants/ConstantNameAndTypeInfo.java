package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class ConstantNameAndTypeInfo implements MCJAConstant {

    private final byte[] nameIndex = new byte[2];
    private final byte[] descriptorIndex = new byte[2];
    private static final ConstantEnum type = ConstantEnum.CONSTANT_NAME_AND_TYPE;
    @Override
    public boolean setData(byte[] data) throws IllDataTypeException {
        if(data.length!=4){
            throw new IllDataTypeException("ConstantNameAndTypeInfo need four byte");
        }
        nameIndex[0] = data[0];
        nameIndex[1] = data[1];
        descriptorIndex[0] = data[2];
        descriptorIndex[1] = data[3];
        return true;
    }

    @Override
    public int getLength() {
        return 4;
    }

    @Override
    public byte[] getData() {
        return new byte[]{
                nameIndex[0],nameIndex[1],
                descriptorIndex[0],descriptorIndex[1]
        };
    }

    @Override
    public ConstantEnum getType() {
        return type;
    }
}
