package com.cht.config;

/**
 * 构建一个DatabaseType容器，并提供了向其中设置和获取DatabaseType的方法
 *
 * @author chenhantao
 * @since 2019/6/5
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> contextHolder = new InheritableThreadLocal<>();

    /**
     * 设置数据源
     * @param db db
     */
    public static void setDataSource(String db) {
        contextHolder.set(db);
    }

    /**
     * 获取当前数据源
     * @return 当前数据源
     */
    public static String getDataSource() {
        return contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clear() {
        contextHolder.remove();
    }


}
