package live.midreamsheep.mcja.standard.constant;

import live.midreamsheep.mcja.clazz.attribute.AttributeEnum;
import live.midreamsheep.mcja.clazz.constantpool.ConstantPoolInter;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;
import live.midreamsheep.mcja.clazz.constantpool.constant.constants.*;
import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.tool.FormatConversion;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MCJAConstantPool implements ConstantPoolInter {

    private final List<MCJAConstant> constants = new LinkedList<>();
    private final Map<String,Short> utf8Map = new HashMap<>();
    private final Map<String,MCJAConstant> existMap = new HashMap<>();

    @Override
    public int getConstantCount() {
        return constants.size();
    }

    @Override
    public MCJAConstant getConstant(int index) {
        return constants.get(index);
    }

    @Override
    public ConstantPoolInter addConstantPool(MCJAConstant constant) {
        constants.add(constant);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantUTF8(String str) {
        if (utf8Map.containsKey(str)){
            return this;
        }
        ConstantUtf8Info utf8Info= new ConstantUtf8Info();
        utf8Info.setData(str.getBytes());
        constants.add(utf8Info);
        utf8Map.put(str, (short) constants.indexOf(utf8Info));
        return this;
    }

    @Override
    public ConstantPoolInter addConstantString(String str) throws IllDataTypeException {
        utf8Check(str);
        ConstantStringInfo stringInfo = new ConstantStringInfo();
        stringInfo.setData(FormatConversion.asByteArray(new short[]{utf8Map.get(str)}));
        constants.add(stringInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantClass(String classname) throws IllDataTypeException {
        if(constantCheck(classname)){
            return this;
        }
        utf8Check(classname);
        ConstantClassInfo constantClassInfo = new ConstantClassInfo();
        constantClassInfo.setData(FormatConversion.asByteArray(new short[]{utf8Map.get(classname)}));
        constants.add(constantClassInfo);
        existMap.put(classname,constantClassInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantInteger(int data) throws IllDataTypeException {
        if(constantCheck(String.valueOf(data))){
            return this;
        }
        ConstantIntegerInfo constantIntegerInfo = new ConstantIntegerInfo();
        constantIntegerInfo.setData(FormatConversion.asByteArray(new int[]{data}));
        constants.add(constantIntegerInfo);
        existMap.put(String.valueOf(data),constantIntegerInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantFloat(float data) throws IllDataTypeException {
        if(constantCheck(String.valueOf(data))){
            return this;
        }
        ConstantFloatInfo constantFloatInfo = new ConstantFloatInfo();
        constantFloatInfo.setData(FormatConversion.asByteArray(new float[]{data}));
        constants.add(constantFloatInfo);
        existMap.put(String.valueOf(data),constantFloatInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantDouble(double data) throws IllDataTypeException {
        if (constantCheck(String.valueOf(data))){
            return this;
        }
        ConstantDoubleInfo constantDoubleInfo = new ConstantDoubleInfo();
        constantDoubleInfo.setData(FormatConversion.asByteArray(new double[]{data}));
        constants.add(constantDoubleInfo);
        existMap.put(String.valueOf(data),constantDoubleInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantLong(long data) throws IllDataTypeException {
        if (constantCheck(String.valueOf(data))){
            return this;
        }
        ConstantLongInfo constantLongInfo = new ConstantLongInfo();
        constantLongInfo.setData(FormatConversion.asByteArray(new long[]{data}));
        constants.add(constantLongInfo);
        existMap.put(String.valueOf(data),constantLongInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantNameAndType(String name, String type) throws IllDataTypeException {
        if (constantCheck("ConstantNameAndType:"+name+";"+type)){
            return this;
        }
        utf8Check(name,type);
        ConstantNameAndTypeInfo constantNameAndTypeInfo = new ConstantNameAndTypeInfo();
        constantNameAndTypeInfo.setData(FormatConversion.asByteArray(new short[]{utf8Map.get(name),utf8Map.get(type)}));
        constants.add(constantNameAndTypeInfo);
        existMap.put("ConstantNameAndType:"+name+";"+type,constantNameAndTypeInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantMethodRef(String classname, String name,String type) throws IllDataTypeException {
        if (constantCheck("ConstantMethodRef:"+classname+";"+name+";"+type)){
            return this;
        }
        utf8Check(classname,name,type);
        if(!existMap.containsKey("ConstantNameAndType:"+name+";"+type)){
            addConstantNameAndType(name,type);
        }
        ConstantMethodRefInfo constantMethodRefInfo = new ConstantMethodRefInfo();
        constantMethodRefInfo.setData(FormatConversion.asByteArray(new short[]{utf8Map.get(classname), (short) constants.indexOf(existMap.get("ConstantNameAndType:"+name+";"+type))}));
        constants.add(constantMethodRefInfo);
        existMap.put("ConstantMethodRef:"+classname+";"+name+";"+type,constantMethodRefInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantFieldRef(String classname, String name,String type) throws IllDataTypeException {
        if(constantCheck("ConstantFieldRef:"+classname+";"+name+";"+type)){
            return this;
        }
        utf8Check(classname,name,type);
        if(!existMap.containsKey("ConstantNameAndType:"+name+";"+type)){
            addConstantNameAndType(name,type);
        }
        ConstantFieldRefInfo constantFieldRefInfo = new ConstantFieldRefInfo();
        constantFieldRefInfo.setData(FormatConversion.asByteArray(new short[]{utf8Map.get(classname), (short) constants.indexOf(existMap.get("ConstantNameAndType:"+name+";"+type))}));
        constants.add(constantFieldRefInfo);
        existMap.put("ConstantFieldRef:"+classname+";"+name+";"+type,constantFieldRefInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantInterfaceMethodRef(String classname, String name,String type) throws IllDataTypeException {
        if (constantCheck("ConstantInterfaceMethodRef:"+classname+";"+name+";"+type)){
            return this;
        }
        utf8Check(classname,name,type);
        if(!existMap.containsKey("ConstantNameAndType:"+name+";"+type)){
            addConstantNameAndType(name,type);
        }
        ConstantInterfaceMethodRefInfo constantInterfaceMethodRefInfo = new ConstantInterfaceMethodRefInfo();
        constantInterfaceMethodRefInfo.setData(FormatConversion.asByteArray(new short[]{utf8Map.get(classname), (short) constants.indexOf(existMap.get("ConstantNameAndType:"+name+";"+type))}));
        constants.add(constantInterfaceMethodRefInfo);
        existMap.put("ConstantInterfaceMethodRef:"+classname+";"+name+";"+type,constantInterfaceMethodRefInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantMethodType(String type) {
        if (constantCheck("ConstantMethodType:"+type)){
            return this;
        }
        utf8Check(type);
        ConstantMethodTypeInfo constantMethodTypeInfo = new ConstantMethodTypeInfo();
        constantMethodTypeInfo.setData(FormatConversion.asByteArray(new short[]{utf8Map.get(type)}));
        constants.add(constantMethodTypeInfo);
        existMap.put("ConstantMethodType:"+type,constantMethodTypeInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantMethodHandle(int referenceKind, String reference) throws IllDataTypeException {
        if (constantCheck("ConstantMethodHandle:"+referenceKind+";"+reference)){
            return this;
        }
        utf8Check(reference);
        ConstantMethodHandleInfo constantMethodHandleInfo = new ConstantMethodHandleInfo();
        constantMethodHandleInfo.setData(FormatConversion.asByteArray(new short[]{(short) referenceKind,utf8Map.get(reference)}));
        constants.add(constantMethodHandleInfo);
        existMap.put("ConstantMethodHandle:"+referenceKind+";"+reference,constantMethodHandleInfo);
        return this;
    }

    @Override
    public ConstantPoolInter addConstantInvokeDynamic(int bootstrapMethodAttrIndex, String nameAndType) {
        if (constantCheck("ConstantInvokeDynamic:"+bootstrapMethodAttrIndex+";"+nameAndType)
                || bootstrapMethodAttrIndex < 0 || bootstrapMethodAttrIndex > 65535){
            return this;
        }
        utf8Check(nameAndType);
        ConstantInvokeDynamicInfo constantInvokeDynamicInfo = new ConstantInvokeDynamicInfo();
        constantInvokeDynamicInfo.setData(FormatConversion.asByteArray(new short[]{(short) bootstrapMethodAttrIndex,utf8Map.get(nameAndType)}));
        constants.add(constantInvokeDynamicInfo);
        existMap.put("ConstantInvokeDynamic:"+bootstrapMethodAttrIndex+";"+nameAndType,constantInvokeDynamicInfo);
        return this;
    }

    @Override
    public short getUtf8Index(AttributeEnum type) {
        return getUtf8Index(type.getName());
    }

    @Override
    public short getUtf8Index(String str) {
        if(!utf8Map.containsKey(str)){
            addConstantUTF8(str);
        }
        return utf8Map.get(str);
    }

    private void utf8Check(String... strings){
        for (String str : strings) {
            if (!utf8Map.containsKey(str)){
                addConstantUTF8(str);
            }
        }
    }
    private boolean constantCheck(String str){
        return existMap.containsKey(str);
    }
}
