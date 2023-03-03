package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;

public class ConstantInvokeDynamicInfo implements MCJAConstant {
    private byte[] bootstrapMethodAttrIndex;
    private byte[] nameAndTypeIndex;

    private static final ConstantEnum type = ConstantEnum.CONSTANT_INVOKE_DYNAMIC;

    @Override
    public boolean setData(byte[] data) {
        this.bootstrapMethodAttrIndex = new byte[2];
        this.nameAndTypeIndex = new byte[2];
        System.arraycopy(data, 0, bootstrapMethodAttrIndex, 0, 2);
        System.arraycopy(data, 2, nameAndTypeIndex, 0, 2);
        return true;
    }

    @Override
    public int getLength() {
        return 4;
    }

    @Override
    public byte[] getData() {
        return new byte[]{
                bootstrapMethodAttrIndex[0],
                bootstrapMethodAttrIndex[1],
                nameAndTypeIndex[0],
                nameAndTypeIndex[1]
        };
    }

    @Override
    public ConstantEnum getType() {
        return type;
    }

}
