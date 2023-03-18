package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;

public class CustomAttribute implements MCJAAttributeInterface {

    private static final AttributeEnum type = AttributeEnum.CUSTOM;

    private byte[] data;
    @Override
    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public int getAttributeLength() {
        return data.length;
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
