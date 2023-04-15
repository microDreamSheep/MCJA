package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;

import java.util.LinkedList;
import java.util.List;

public class LocalVariableTableAttribute extends MCJAAttributeAbstract {
    public static final AttributeEnum type = AttributeEnum.LOCAL_VARIABLE_TABLE;

    private final List<LocalVariableTable> localVariableTable = new LinkedList<>();

    public LocalVariableTableAttribute addTable(short startPc, short length, String name, String descriptor, short index) {
        short nameIndex = context.getConstant().getUtf8Index(name);
        short descriptorIndex = context.getConstant().getUtf8Index(descriptor);
        localVariableTable.add(new LocalVariableTable(startPc, length, nameIndex, descriptorIndex, index));
        return this;
    }

    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        byte[] data = new byte[localVariableTable.size() * 10 + 2];
        data[0] = (byte) (localVariableTable.size() >> 8);
        data[1] = (byte) localVariableTable.size();
        for (int i = 0; i < localVariableTable.size(); i++) {
            LocalVariableTable localVariableTable = this.localVariableTable.get(i);
            data[i * 10 + 2] = (byte) (localVariableTable.getStartPc() >> 8);
            data[i * 10 + 3] = (byte) localVariableTable.getStartPc();
            data[i * 10 + 4] = (byte) (localVariableTable.getLength() >> 8);
            data[i * 10 + 5] = (byte) localVariableTable.getLength();
            data[i * 10 + 6] = (byte) (localVariableTable.getNameIndex() >> 8);
            data[i * 10 + 7] = (byte) localVariableTable.getNameIndex();
            data[i * 10 + 8] = (byte) (localVariableTable.getDescriptorIndex() >> 8);
            data[i * 10 + 9] = (byte) localVariableTable.getDescriptorIndex();
            data[i * 10 + 10] = (byte) (localVariableTable.getIndex() >> 8);
            data[i * 10 + 11] = (byte) localVariableTable.getIndex();
        }
        setData(data);
        return this;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
    public LocalVariableTableAttribute() {
        index = context.getConstant().getUtf8Index(type);
    }
    static class LocalVariableTable {
        private final short startPc;
        private final short length;
        private final short nameIndex;
        private final short descriptorIndex;
        private final short index;

        public LocalVariableTable(short startPc, short length, short nameIndex, short descriptorIndex, short index) {
            this.startPc = startPc;
            this.length = length;
            this.nameIndex = nameIndex;
            this.descriptorIndex = descriptorIndex;
            this.index = index;
        }

        public short getStartPc() {
            return startPc;
        }

        public short getLength() {
            return length;
        }

        public short getNameIndex() {
            return nameIndex;
        }

        public short getDescriptorIndex() {
            return descriptorIndex;
        }

        public short getIndex() {
            return index;
        }
    }
}
