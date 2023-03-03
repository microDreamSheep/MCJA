package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class ConstantMethodHandleInfo implements MCJAConstant {

    private byte referenceKind;
    private byte[] index;
    private static final ConstantEnum type = ConstantEnum.CONSTANT_METHOD_TYPE;
    @Override
    public boolean setData(byte[] data) throws IllDataTypeException {
        if(data.length!=3){
            throw new IllDataTypeException("CONSTANT_METHOD_TYPE need three byte data");
        }
        this.referenceKind = data[0];
        this.index = new byte[2];
        this.index[0] = data[1];
        this.index[1] = data[2];
        return true;
    }

    @Override
    public int getLength() {
        return 3;
    }

    @Override
    public byte[] getData() {
        return new byte[]{
            referenceKind,index[0],index[1]
        };
    }

    @Override
    public ConstantEnum getType() {
        return type;
    }
}
