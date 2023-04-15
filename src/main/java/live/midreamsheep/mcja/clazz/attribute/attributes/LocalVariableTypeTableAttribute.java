package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;


public class LocalVariableTypeTableAttribute extends MCJAAttributeAbstract {
    public static final AttributeEnum type = AttributeEnum.LOCAL_VARIABLE_TYPE_TABLE;
    private final LocalVariableTableAttribute localVariableTableAttribute = new LocalVariableTableAttribute();
    public LocalVariableTypeTableAttribute addTable(short startPc, short length, String name, String signature, short index) {
        localVariableTableAttribute.addTable(startPc, length, name, signature, index);
        return this;
    }

    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        localVariableTableAttribute.loadData();
        setData(localVariableTableAttribute.getData());
        return this;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
    public LocalVariableTypeTableAttribute() {
        index = context.getConstant().getUtf8Index(type);
    }

}
