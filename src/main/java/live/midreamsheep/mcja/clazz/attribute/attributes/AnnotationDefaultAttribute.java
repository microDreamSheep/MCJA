package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class AnnotationDefaultAttribute extends MCJAAttributeAbstract{


    private static final AttributeEnum type = AttributeEnum.ANNOTATION_DEFAULT;



    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        return this;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
}
