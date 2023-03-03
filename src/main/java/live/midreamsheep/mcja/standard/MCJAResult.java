package live.midreamsheep.mcja.standard;

public class MCJAResult {
    private String className;
    private byte[] data;

    public MCJAResult() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public MCJAResult(String className, byte[] data) {
        this.className = className;
        this.data = data;
    }
}
