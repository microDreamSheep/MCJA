package live.midreamsheep.mcja.standard;

import live.midreamsheep.mcja.clazz.attribute.MCJAAttributePoolInter;
import live.midreamsheep.mcja.clazz.constantpool.ConstantPoolInter;
import live.midreamsheep.mcja.clazz.filed.MCJAFiledPoolInter;
import live.midreamsheep.mcja.clazz.method.MCJAMethodPoolInter;

public class MCJAClazz {
    private MCJAMetaClazz metaData;
    private ConstantPoolInter constant;
    private MCJAFiledPoolInter filedPoolInter;
    private MCJAMethodPoolInter methodPoolInter;
    private MCJAAttributePoolInter mcjaAttributePoolInter;


    public ConstantPoolInter getConstant() {
        return constant;
    }

    public void setConstant(ConstantPoolInter constant) {
        this.constant = constant;
    }

    public MCJAMetaClazz getMetaData() {
        return metaData;
    }

    public void setMetaData(MCJAMetaClazz meta_data) {
        this.metaData = meta_data;
    }

    public MCJAFiledPoolInter getFiledPoolInter() {
        return filedPoolInter;
    }

    public void setFiledPoolInter(MCJAFiledPoolInter filedPoolInter) {
        this.filedPoolInter = filedPoolInter;
    }

    public MCJAMethodPoolInter getMethodPoolInter() {
        return methodPoolInter;
    }

    public void setMethodPoolInter(MCJAMethodPoolInter methodPoolInter) {
        this.methodPoolInter = methodPoolInter;
    }

    public MCJAAttributePoolInter getMCJAAttributePoolInter() {
        return mcjaAttributePoolInter;
    }

    public void setMCJAAttributePoolInter(MCJAAttributePoolInter mcjaAttributePoolInter) {
        this.mcjaAttributePoolInter = mcjaAttributePoolInter;
    }
}
