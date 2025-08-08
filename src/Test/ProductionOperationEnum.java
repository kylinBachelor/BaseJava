package Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 生产操作 开始/暂停/继续/完成
 * @author congpeitong
 * @date 2025-03-25 16:32:47
 */
public enum ProductionOperationEnum {

    START("start", "开始"),
    PAUSE("pause", "暂停"),
    KEEP("keep", "继续"),
    FINISH("finish", "完成");

    private final String code;
    private final String name;

    ProductionOperationEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    // 使用两个 Map 来存储 name 到 code 和 code 到 name 的映射
    private static final Map<String, ProductionOperationEnum> nameToEnumMap = new HashMap<>();
    private static final Map<String, ProductionOperationEnum> codeToEnumMap = new HashMap<>();
    // 初始化枚举类时构建映射
    static {
        for (ProductionOperationEnum status : values()) {
            nameToEnumMap.put(status.getName(), status);
            codeToEnumMap.put(status.getCode(), status);
        }
    }

    // 通过 name 查找枚举实例
    public static ProductionOperationEnum fromName(String name) {
        return nameToEnumMap.get(name);
    }

    // 通过 code 查找枚举实例
    public static ProductionOperationEnum fromCode(String code) {
        return codeToEnumMap.get(code);
    }

    // 通过 name 查找 code
    public static String getCodeByName(String name) {
        ProductionOperationEnum status = nameToEnumMap.get(name);
        return status != null ? status.getCode() : null;
    }

    // 通过 code 查找 name
    public static String getNameByCode(String code) {
        ProductionOperationEnum status = codeToEnumMap.get(code);
        return status != null ? status.getName() : null;
    }

}

