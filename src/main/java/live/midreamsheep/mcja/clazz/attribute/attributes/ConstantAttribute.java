package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.tool.FormatConversion;

public class ConstantAttribute extends MCJAAttributeAbstract {


    private static final AttributeEnum type = AttributeEnum.CONSTANT_VALUE;

    private short constantValueIndex;

    public void setConstantLong(long value) throws IllDataTypeException {
        constantValueIndex = (short) (context.getConstant().addConstantLong(value).getConstantCount()-1);
    }
    public void setConstantFloat(float value) throws IllDataTypeException {
        constantValueIndex = (short) (context.getConstant().addConstantFloat(value).getConstantCount()-1);
    }
    public void setConstantDouble(double value) throws IllDataTypeException {
        constantValueIndex = (short) (context.getConstant().addConstantDouble(value).getConstantCount()-1);
    }
    public void setConstantInteger(int value) throws IllDataTypeException {
        constantValueIndex = (short) (context.getConstant().addConstantInteger(value).getConstantCount()-1);
    }
    public void setConstantString(String value) throws IllDataTypeException {
        constantValueIndex = (short) (context.getConstant().addConstantString(value).getConstantCount()-1);
    }

    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        setData(FormatConversion.asByteArray(new short[]{constantValueIndex}));
        return this;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
    public ConstantAttribute(){
        index = context.getConstant().getUtf8Index(type);
    }

}
