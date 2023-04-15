package live.midreamsheep.mcja.clazz.constantpool;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;
import live.midreamsheep.mcja.error.IllDataTypeException;

@SuppressWarnings({"all"})
public interface ConstantPoolInter {
    int getConstantCount();
    MCJAConstant getConstant(int index);
    @Deprecated
    ConstantPoolInter addConstantPool(MCJAConstant constant);
    ConstantPoolInter addConstantUTF8(String str);
    ConstantPoolInter addConstantString(String str) throws IllDataTypeException;
    ConstantPoolInter addConstantClass(String classname) throws IllDataTypeException;
    ConstantPoolInter addConstantInteger(int data) throws IllDataTypeException;
    ConstantPoolInter addConstantFloat(float data) throws IllDataTypeException;
    ConstantPoolInter addConstantDouble(double data) throws IllDataTypeException;
    ConstantPoolInter addConstantLong(long data) throws IllDataTypeException;
    ConstantPoolInter addConstantNameAndType(String name,String type) throws IllDataTypeException;
    ConstantPoolInter addConstantMethodRef(String classname,String name,String type) throws IllDataTypeException;
    ConstantPoolInter addConstantFieldRef(String classname,String name,String type) throws IllDataTypeException;
    ConstantPoolInter addConstantInterfaceMethodRef(String classname,String name,String type) throws IllDataTypeException;
    ConstantPoolInter addConstantMethodType(String type);
    ConstantPoolInter addConstantMethodHandle(int referenceKind,String reference) throws IllDataTypeException;
    ConstantPoolInter addConstantInvokeDynamic(int bootstrapMethodAttrIndex,String nameAndType);
    short getUtf8Index(AttributeEnum type);
    short getUtf8Index(String str);
    short getClassIndex(String classname) throws IllDataTypeException;
}
