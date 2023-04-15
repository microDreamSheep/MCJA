package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;

import java.util.LinkedList;
import java.util.List;

public class LineNumberTableAttribute extends MCJAAttributeAbstract {

    private static final AttributeEnum type = AttributeEnum.LINE_NUMBER_TABLE;

    private final List<short[]> lineNumberTable = new LinkedList<>();

    public LineNumberTableAttribute addTable(short startPc, short lineNumber) {
        lineNumberTable.add(new short[]{startPc, lineNumber});
        return this;
    }


    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        byte[] data = new byte[lineNumberTable.size() * 4 + 2];
        data[0] = (byte) (lineNumberTable.size() >> 8);
        data[1] = (byte) lineNumberTable.size();
        for (int i = 0; i < lineNumberTable.size(); i++) {
            short[] shorts = lineNumberTable.get(i);
            data[i * 4 + 2] = (byte) (shorts[0] >> 8);
            data[i * 4 + 3] = (byte) shorts[0];
            data[i * 4 + 4] = (byte) (shorts[1] >> 8);
            data[i * 4 + 5] = (byte) shorts[1];
        }
        setData(data);
        return this;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
    public LineNumberTableAttribute() {
        index = context.getConstant().getUtf8Index(type);
    }
}
