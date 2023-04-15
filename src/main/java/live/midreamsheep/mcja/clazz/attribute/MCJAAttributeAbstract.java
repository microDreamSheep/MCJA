package live.midreamsheep.mcja.clazz.attribute;

import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.standard.MCJAClazz;
import live.midreamsheep.mcja.tool.FormatConversion;

public abstract class MCJAAttributeAbstract implements MCJAAttributeInterface{

    protected byte[] data;
    protected short index;
    protected MCJAClazz context;

    @Override
    public void setData(byte[] data) throws IllDataTypeException {
        this.data = data;
    }

    @Override
    public abstract MCJAAttributeInterface loadData() throws IllDataTypeException;

    @Override
    public int getAttributeLength() {
        return data.length;
    }

    @Override
    public abstract AttributeEnum getType();

    @Override
    public byte[] getData() {
        byte[] byteArray = FormatConversion.asByteArray(new short[]{index});
        byte[] length = FormatConversion.asByteArray(new int[]{getAttributeLength()});
        byte[] result = new byte[byteArray.length+4 + data.length];
        System.arraycopy(byteArray,0,result,0,byteArray.length);
        System.arraycopy(length,0,result,byteArray.length,4);
        System.arraycopy(data,0,result,byteArray.length+4,data.length);
        return result;
    }


    @Override
    public void setContext(MCJAClazz context) {
        this.context = context;
    }
}
