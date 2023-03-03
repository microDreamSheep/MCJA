package live.midreamsheep.mcja.clazz.constantpool;

public enum ConstantEnum {
    CONSTANT_CLASS(7),
    CONSTANT_FIELD_REF(9),
    CONSTANT_METHOD_REF(10),
    CONSTANT_INTERFACE_METHOD_REF(11),
    CONSTANT_STRING(8),
    CONSTANT_INTEGER(3),
    CONSTANT_FlOAT(4),
    CONSTANT_LONG(5),
    CONSTANT_DOUBLE(6),
    CONSTANT_NAME_AND_TYPE(12),
    CONSTANT_UTF8(1),
    CONSTANT_METHOD_HANDLE(15),
    CONSTANT_METHOD_TYPE(16),
    CONSTANT_INVOKE_DYNAMIC(18)
    ;
    private final int tag;

    ConstantEnum(int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

}
