package live.midreamsheep.mcja.standard;

import live.midreamsheep.mcja.api.MCJAMeta;
import live.midreamsheep.mcja.metadata.MajorVersionEnum;

public class MCJAMetaClazzBuilder implements MCJAMeta {
    private final MCJAMetaClazz meta;

    private final MCJAClazz clazz;

    public MCJAMetaClazzBuilder() {
        meta = new MCJAMetaClazz();
        clazz = new MCJAClazz();
        clazz.setMetaData(meta);
    }


    @Override
    public MCJAMeta setMajorVersion(MajorVersionEnum versionEnum) {
        setMajorVersion(versionEnum.getVersionData());
        return this;
    }

    @Override
    public MCJAMeta setMajorVersion(short versionEnum) {
        meta.setMajor_version(versionEnum);
        return this;
    }

    @Override
    public MCJAMeta setMinorVersion(short versionEnum) {
        meta.setMinor_version(versionEnum);
        return this;
    }

    @Override
    public MCJAMeta setClassName(String className) {
        //todo
        return this;
    }

    @Override
    public MCJAMeta setSuperClassName(String className) {
        //todo
        return this;
    }

    @Override
    public MCJAMeta addInterface(String interfaceName) {
        //todo
        return this;
    }

    @Override
    public MCJAClazz getClazz() {
        return clazz;
    }

}
