package live.midreamsheep.mcja.clazz.attribute;

import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.standard.MCJAClazz;

public interface MCJAAttributeInterface {

    void setData(byte[] data) throws IllDataTypeException;

    MCJAAttributeInterface loadData() throws IllDataTypeException;

    int getAttributeLength();

    AttributeEnum getType();

    byte[] getData();

    void setContext(MCJAClazz context);
}
