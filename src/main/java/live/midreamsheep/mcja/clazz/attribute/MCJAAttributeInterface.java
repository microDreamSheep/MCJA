package live.midreamsheep.mcja.clazz.attribute;

import live.midreamsheep.mcja.error.IllDataTypeException;

public interface MCJAAttributeInterface {

    void setData(byte[] data) throws IllDataTypeException;

    int getAttributeLength();

    AttributeEnum getType();

    byte[] getData();
}
