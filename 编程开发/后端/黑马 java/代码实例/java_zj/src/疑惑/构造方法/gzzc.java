package 疑惑.构造方法;

public class gzzc {
    int agg ;
    String mkzi;

    public gzzc() {
        System.out.println("无参方法");
        this.agg = agg;
        this.mkzi = mkzi;
    }

    public gzzc(int agg, String mkzi) {
        this.agg = agg;
        this.mkzi = mkzi;
    }

    /**
     * 获取
     * @return agg
     */
    public int getAgg() {
        return agg;
    }

    /**
     * 设置
     * @param agg
     */
    public void setAgg(int agg) {
        this.agg = agg;
    }

    /**
     * 获取
     * @return mkzi
     */
    public String getMkzi() {
        return mkzi;
    }

    /**
     * 设置
     * @param mkzi
     */
    public void setMkzi(String mkzi) {
        this.mkzi = mkzi;
    }

    public String toString() {
        return "gzzc{agg = " + agg + ", mkzi = " + mkzi + "}";
    }
}
