package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.tool.FormatConversion;

public class ConstantAttribute implements MCJAAttributeInterface {

    //固定长度为2
    private static final int length = 2;

    private static final AttributeEnum type = AttributeEnum.CONSTANT_VALUE;

    private byte[] data;

    public void setIndex(short index) throws IllDataTypeException {
        setData(FormatConversion.asByteArray(new short[]{index}));
    }

    @Override
    public void setData(byte[] data) throws IllDataTypeException {
        if(data.length != length){
            throw new IllDataTypeException("ConstantAttribute length must be 2");
        }
        this.data = data;
    }

    @Override
    public int getAttributeLength() {
        return length;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }

    @Override
    public byte[] getData() {
        return data;
    }
}
