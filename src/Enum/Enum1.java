package Enum;

/**
 * @author congpeitong
 * @date 2022-06-01 09:41
 * 枚举类型的使用
 */
public enum Enum1 {
    A(1,11),B(2, 22),C(3, 33);
    private final int code;
    private final int index;
    Enum1(int code, int index) {
        this.code = code;
        this.index  = index;
    }
    public int getCode() {
        return code;
    }
    public int getIndex() {
        return index;
    }
}
