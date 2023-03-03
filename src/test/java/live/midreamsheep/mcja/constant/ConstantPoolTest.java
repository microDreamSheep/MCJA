package live.midreamsheep.mcja.constant;

import live.midreamsheep.mcja.clazz.constantpool.ConstantPoolInter;
import live.midreamsheep.mcja.error.IllDataTypeException;
import live.midreamsheep.mcja.standard.constant.MCJAConstantPool;

public class ConstantPoolTest {

    public static void main(String[] args) throws IllDataTypeException {
        ConstantPoolInter pool = new MCJAConstantPool();
        pool.addConstantInteger(74);
        pool.addConstantUTF8("hello world");
        pool.addConstantUTF8("hello world");
        pool.addConstantUTF8("hello world2");
        pool.addConstantClass("live.midreamsheep.sheep");
        pool.addConstantMethodRef("live.midreamsheep.sheep","main","([Ljava/lang/String;)V");

    }
}
