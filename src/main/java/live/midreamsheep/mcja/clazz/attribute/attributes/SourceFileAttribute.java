package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.tool.FormatConversion;

public class SourceFileAttribute extends MCJAAttributeAbstract {

    private static final AttributeEnum type = AttributeEnum.SOURCE_FILE;
    private short sourceFileIndex;
    public void setSourceFileName( String sourceFileName) throws IllDataTypeException {
        sourceFileIndex = context.getConstant().getUtf8Index(sourceFileName);
    }

    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        setData(FormatConversion.asByteArray(new short[]{sourceFileIndex}));
        return this;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
    public SourceFileAttribute(){
        index = context.getConstant().getUtf8Index(type);
    }
}
