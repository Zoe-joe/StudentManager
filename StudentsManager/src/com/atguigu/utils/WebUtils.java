package com.atguigu.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

public class WebUtils {
    public static <T> T copyParamBean(Map<T, T> value, T bean) {
        try {
            BeanUtils.copyProperties(bean, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    public static int parseInt(String string, int defaultValue) {
        try {
            return Integer.parseInt(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultValue;
    }
}
