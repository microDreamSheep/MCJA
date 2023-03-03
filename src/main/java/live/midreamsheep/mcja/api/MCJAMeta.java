package live.midreamsheep.mcja.api;

import live.midreamsheep.mcja.standard.MCJAClazz;
import live.midreamsheep.mcja.metadata.MajorVersionEnum;

public interface MCJAMeta {
    //设置主版本信息
    MCJAMeta setMajorVersion(MajorVersionEnum versionEnum);
    MCJAMeta setMajorVersion(short versionEnum);
    //设置次版本信息
    MCJAMeta setMinorVersion(short versionEnum);
    /**
     * 设置类名
     * @return 类信息常量池索引
     * */
    MCJAMeta setClassName(String className);
    /**
     * 设置父类名
     * @return 父类信息常量池索引
     * */
    MCJAMeta setSuperClassName(String className);
    /**
     * 增加接口
     * @return 接口信息常量池索引
     * */
    MCJAMeta addInterface(String interfaceName);
    /**
     * 获取clazz
     * */
    MCJAClazz getClazz();

}
