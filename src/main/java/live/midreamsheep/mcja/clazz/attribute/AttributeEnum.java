package live.midreamsheep.mcja.clazz.attribute;

public enum AttributeEnum {
    CONSTANT_VALUE(1, "ConstantValue"),
    CODE(2, "Code"),
    STACK_MAP_TABLE(3, "StackMapTable"),
    EXCEPTIONS(4, "Exceptions"),
    INNER_CLASSES(5, "InnerClasses"),
    ENCLOSING_METHOD(6, "EnclosingMethod"),
    SYNTHETIC(7, "Synthetic"),
    SIGNATURE(8, "Signature"),
    SOURCE_FILE(9, "SourceFile"),
    SOURCE_DEBUG_EXTENSION(10, "SourceDebugExtension"),
    LINE_NUMBER_TABLE(11, "LineNumberTable"),
    LOCAL_VARIABLE_TABLE(12, "LocalVariableTable"),
    LOCAL_VARIABLE_TYPE_TABLE(13, "LocalVariableTypeTable"),
    DEPRECATED(14, "Deprecated"),
    RUNTIME_VISIBLE_ANNOTATIONS(15, "RuntimeVisibleAnnotations"),
    RUNTIME_INVISIBLE_ANNOTATIONS(16, "RuntimeInvisibleAnnotations"),
    RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS(17, "RuntimeVisibleParameterAnnotations"),
    RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS(18, "RuntimeInvisibleParameterAnnotations"),
    RUNTIME_VISIBLE_TYPE_ANNOTATIONS(19, "RuntimeVisibleTypeAnnotations"),
    RUNTIME_INVISIBLE_TYPE_ANNOTATIONS(20, "RuntimeInvisibleTypeAnnotations"),
    ANNOTATION_DEFAULT(21, "AnnotationDefault"),
    BOOTSTRAP_METHODS(22, "BootstrapMethods"),
    CUSTOM(23, null);
    ;
    private final int typeId;
    private final String name;

    AttributeEnum(int typeId, String name) {
        this.typeId = typeId;
        this.name = name;
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

    public String getName() {
        return name;
    }
}
