package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;

import java.util.LinkedList;
import java.util.List;

public class ExceptionsAttribute extends MCJAAttributeAbstract {

    public static final AttributeEnum type = AttributeEnum.EXCEPTIONS;

    private final List<Short> exceptions = new LinkedList<>();

    public ExceptionsAttribute addException(String exceptionName) throws IllDataTypeException {
        exceptions.add(context.getConstant().getClassIndex(exceptionName));
        return this;
    }

    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        byte[] data = new byte[exceptions.size() * 2 + 2];
        data[0] = (byte) (exceptions.size() >> 8);
        data[1] = (byte) exceptions.size();
        for (int i = 0; i < exceptions.size(); i++) {
            short aShort = exceptions.get(i);
            data[i * 2 + 2] = (byte) (aShort >> 8);
            data[i * 2 + 3] = (byte) aShort;
        }
        setData(data);
        return this;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
    public ExceptionsAttribute() {
        index = context.getConstant().getUtf8Index(type);
    }

}
