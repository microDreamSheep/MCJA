package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;

public class ConstantUtf8Info implements MCJAConstant {

    private byte[] data;

    private static final ConstantEnum type = ConstantEnum.CONSTANT_UTF8;

    @Override
    public boolean setData(byte[] data){
        this.data = data;
        return true;
    }

    @Override
    public int getLength() {
        return data.length;
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
