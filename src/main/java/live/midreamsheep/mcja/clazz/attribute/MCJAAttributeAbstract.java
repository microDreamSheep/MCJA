package live.midreamsheep.mcja.clazz.attribute;

import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.standard.MCJAClazz;

public abstract class MCJAAttributeAbstract implements MCJAAttributeInterface{

    protected byte[] data;
    protected MCJAClazz context;

    @Override
    public void setData(byte[] data) throws IllDataTypeException {
        this.data = data;
    }

    @Override
    public abstract void loadData() throws IllDataTypeException;

    @Override
    public int getAttributeLength() {
        return data.length;
    }

    @Override
    public abstract AttributeEnum getType();

    @Override
    public byte[] getData() {
        return data;
    }


    @Override
    public void setContext(MCJAClazz context) {
        this.context = context;
    }
}
