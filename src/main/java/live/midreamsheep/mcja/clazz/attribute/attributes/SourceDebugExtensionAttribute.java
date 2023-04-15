package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;

public class SourceDebugExtensionAttribute extends MCJAAttributeAbstract {

    private static final AttributeEnum type = AttributeEnum.SOURCE_DEBUG_EXTENSION;

    @Override
    public void setData(byte[] data) throws IllDataTypeException {
        super.setData(data);
    }

    public SourceDebugExtensionAttribute() {
        index = context.getConstant().getUtf8Index(type);
    }


    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        throw new IllDataTypeException("SourceDebugExtensionAttribute can't load data");
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
}
