package live.midreamsheep.mcja.standard;

public class MCJAMetaClazz {
    private static final int magic = 0xCAFEBABE;
    private short minor_version = 0;
    private short major_version;
    private short access_flags;
    private short this_class;
    private short super_class;
    private short[] interfaces;

    public MCJAMetaClazz() {
    }

    public short getMinor_version() {
        return minor_version;
    }

    public void setMinor_version(short minor_version) {
        this.minor_version = minor_version;
    }

    public short getMajor_version() {
        return major_version;
    }

    public void setMajor_version(short major_version) {
        this.major_version = major_version;
    }

    public short getAccess_flags() {
        return access_flags;
    }

    public void setAccess_flags(short access_flags) {
        this.access_flags = access_flags;
    }

    public short getThis_class() {
        return this_class;
    }

    public void setThis_class(short this_class) {
        this.this_class = this_class;
    }

    public short getSuper_class() {
        return super_class;
    }

    public void setSuper_class(short super_class) {
        this.super_class = super_class;
    }

    public short[] getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(short[] interfaces) {
        this.interfaces = interfaces;
    }
}
