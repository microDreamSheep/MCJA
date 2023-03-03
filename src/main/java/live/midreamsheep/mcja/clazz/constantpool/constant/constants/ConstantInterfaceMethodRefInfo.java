package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class ConstantInterfaceMethodRefInfo implements MCJAConstant {
    private final byte[] classIndex = new byte[2];
    private final byte[] nameAndTypeIndex = new byte[2];

    private final static ConstantEnum type = ConstantEnum.CONSTANT_INTERFACE_METHOD_REF;

    @Override
    public boolean setData(byte[] data) throws IllDataTypeException {
        if(data.length!=4){
            throw new IllDataTypeException("CONSTANT_FIELD_REF_Info need two bytes class_index and two bytes name_and_type_index");
        }
        classIndex[0] = data[0];
        classIndex[1] = data[1];
        nameAndTypeIndex[0] = data[2];
        nameAndTypeIndex[1] = data[3];
        return true;
    }

    @Override
    public int getLength() {
        return 4;
    }

    @Override
    public byte[] getData() {
        return new byte[]{
                classIndex[0],classIndex[1],
                nameAndTypeIndex[0],nameAndTypeIndex[1]
        };
    }

    @Override
    public ConstantEnum getType() {
        return type;
    }
}
