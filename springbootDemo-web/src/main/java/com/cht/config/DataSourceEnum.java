package com.cht.config;

/**
 * 数据源枚举
 *
 * @author chenhantao
 * @since 2019/6/6
 */
public enum DataSourceEnum {
    MASTER("master"),
    SLAVE1("slave1"),
    ;

    private String value;

    DataSourceEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
