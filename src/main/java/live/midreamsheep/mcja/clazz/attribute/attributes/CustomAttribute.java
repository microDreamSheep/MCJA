package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class CustomAttribute extends MCJAAttributeAbstract {

    private static final AttributeEnum type = AttributeEnum.CUSTOM;


    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        throw new IllDataTypeException("CustomAttribute can't load data");
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }

}
