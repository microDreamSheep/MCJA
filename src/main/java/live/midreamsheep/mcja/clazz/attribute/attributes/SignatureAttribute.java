package live.midreamsheep.mcja.clazz.attribute.attributes;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeAbstract;
import live.midreamsheep.mcja.clazz.attribute.MCJAAttributeInterface;
import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.tool.FormatConversion;

public class SignatureAttribute extends MCJAAttributeAbstract {

    private static final AttributeEnum type = AttributeEnum.SIGNATURE;

    private short signatureIndex;
    public void setSignatureIndex(String signature) {
        signatureIndex = context.getConstant().getUtf8Index(signature);
    }

    @Override
    public MCJAAttributeInterface loadData() throws IllDataTypeException {
        setData(FormatConversion.asByteArray(new short[]{signatureIndex}));
        return this;
    }

    @Override
    public AttributeEnum getType() {
        return type;
    }
    public SignatureAttribute(){
        index = context.getConstant().getUtf8Index(type);
    }
}
