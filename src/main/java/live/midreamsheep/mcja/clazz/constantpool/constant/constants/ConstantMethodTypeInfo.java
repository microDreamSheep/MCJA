package live.midreamsheep.mcja.clazz.constantpool.constant.constants;

import live.midreamsheep.mcja.clazz.constantpool.ConstantEnum;
import live.midreamsheep.mcja.clazz.constantpool.constant.MCJAConstant;

public class ConstantMethodTypeInfo implements MCJAConstant {

        private byte[] descriptorIndex;

        private static final ConstantEnum type = ConstantEnum.CONSTANT_METHOD_TYPE;

        @Override
        public boolean setData(byte[] data) {
            this.descriptorIndex = data;
            return true;
        }

        @Override
        public int getLength() {
            return 2;
        }

        @Override
        public byte[] getData() {
            return descriptorIndex;
        }

        @Override
        public ConstantEnum getType() {
            return type;
        }
}
