package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class BootstrapMethodsAttribute extends MCJAAttributeAbstract {
    private static final AttributeEnum type = AttributeEnum.BOOTSTRAP_METHODS;
    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        return null;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
    public BootstrapMethodsAttribute() {
        index = context.getConstant().getUtf8Index(type);
    }
}
