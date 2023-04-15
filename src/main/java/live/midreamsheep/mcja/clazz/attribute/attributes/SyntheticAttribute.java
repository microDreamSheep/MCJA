package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class SyntheticAttribute extends MCJAAttributeAbstract {

    private static final AttributeEnum type = AttributeEnum.SYNTHETIC;

    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        throw new IllDataTypeException("SyntheticAttribute can't load data");
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }

    public SyntheticAttribute() {
        data = new byte[]{0x00,0x00,0x00,0x00};
        index = context.getConstant().getUtf8Index(type);
    }
}
