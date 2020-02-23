package io.netty.example.study.utils;

import com.google.gson.Gson;

public final class JsonUtil {

    private static final Gson gson = new Gson();

    private JsonUtil(){}

    /**
     * 将 json 格式的数据转换成 object 形式
     * @param json 待转换数据
     * @param clazz 类型
     * @return 转换完成的类型
     */
    public static <T> T fromJson(String json, Class<T> clazz){
        return gson.fromJson(json, clazz);
    }

    /**
     * 将一个对象转换成 json 格式数据
     * @param obj 对象
     * @return json 格式数据
     */
    public static String toJson(Object obj){
        return gson.toJson(obj);
    }


}
