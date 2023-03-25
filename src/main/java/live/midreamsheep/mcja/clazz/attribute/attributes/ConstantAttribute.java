package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.tool.FormatConversion;

public class ConstantAttribute extends MCJAAttributeAbstract {

    private short index;

    private static final AttributeEnum type = AttributeEnum.CONSTANT_VALUE;

    public void setIndex(short index) {
        this.index = index;
    }

    @Override
    public void loadData() throws IllDataTypeException {
        setData(FormatConversion.asByteArray(new short[]{index}));
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }

}
