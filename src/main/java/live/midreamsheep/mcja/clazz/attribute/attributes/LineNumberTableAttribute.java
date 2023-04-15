package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;

import java.util.List;

public class LineNumberTableAttribute extends MCJAAttributeAbstract {

    private static final AttributeEnum type = AttributeEnum.LINE_NUMBER_TABLE;

    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        return null;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
    public LineNumberTableAttribute() {
        index = context.getConstant().getUtf8Index(type);
    }
}
