package live.midreamsheep.mcja.metadata;

public enum MajorVersionEnum {
    JDK1(45),
    JDK2(46),
    JDK3(47),
    JDK4(48),
    JDK5(49),
    JDK6(50),
    JDK7(51),
    JDK8(52),
    JDK9(53),
    JDK10(54),
    JDK11(55),
    JDK12(56),
    JDK13(57),
    JDK14(58),
    JDK15(59),
    JDK16(60),
    JDK17(61),
    JDK18(62);
    private final short versionData;

    MajorVersionEnum(int i) {
        this.versionData = (short) i;
    }

    public short getVersionData() {
        return versionData;
    }
}
