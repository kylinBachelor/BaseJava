package Enum;

public enum BatchSnType {
    NONE("0","无"),
    BATCH("1","批次"),
    SN("2","序列号")
    ;
    private final String code;
    private final String message;
    private final Integer sort;
    BatchSnType(String code, String message, Integer sort) {
        this.code=code;
        this.message = message;
        this.sort = sort;
    }
    BatchSnType(String code, String message) {
        this.code=code;
        this.message = message;
        this.sort = 0;
    }

}