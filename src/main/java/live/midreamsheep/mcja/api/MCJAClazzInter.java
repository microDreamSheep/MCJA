package live.midreamsheep.mcja.api;

import live.midreamsheep.mcja.standard.MCJAResult;
import live.midreamsheep.mcja.clazz.constantpool.ConstantPoolInter;

public interface MCJAClazzInter extends MCJAMeta {

    /**
     * 构建出字节码
     * */
    MCJAResult build();
    /**
     * 获取常量池
     * */
    ConstantPoolInter getConstantPool();


}