package live.midreamsheep.mcja.clazz.attribute;

public enum AttributeEnum {
    CONSTANT_VALUE(1),
    CODE(2),
    STACK_MAP_TABLE(3),
    EXCEPTIONS(4),
    INNER_CLASSES(5),
    ENCLOSING_METHOD(6),
    SYNTHETIC(7),
    SIGNATURE(8),
    SOURCE_FILE(9),
    SOURCE_DEBUG_EXTENSION(10),
    LINE_NUMBER_TABLE(11),
    LOCAL_VARIABLE_TABLE(12),
    LOCAL_VARIABLE_TYPE_TABLE(13),
    DEPRECATED(14),
    RUNTIME_VISIBLE_ANNOTATIONS(15),
    RUNTIME_INVISIBLE_ANNOTATIONS(16),
    RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS(17),
    RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS(18),
    RUNTIME_VISIBLE_TYPE_ANNOTATIONS(19),
    RUNTIME_INVISIBLE_TYPE_ANNOTATIONS(20),
    ANNOTATION_DEFAULT(21),
    BOOTSTRAP_METHODS(22),
    CUSTOM(23);
    ;
    private final int typeId;

    AttributeEnum(int typeId) {
        this.typeId = typeId;
    }

    public int getTypeId() {
        return typeId;
    }
    public AttributeEnum getAttributeEnum(int typeId){
        for (AttributeEnum attributeEnum : AttributeEnum.values()) {
            if (attributeEnum.getTypeId()==typeId){
                return attributeEnum;
            }
        }
        return null;
    }
}
