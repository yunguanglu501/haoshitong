package com.wanbang.youyibang.common.entity;


import java.util.Properties;

/**
 * @author: wcy
 * @Date: 2019/8/24 12:46
 * @Description:
 */
public class ReturnVO {

    private static final Properties properties = ReadPropertiesUtil.getProperties("response.properties");

    /**
     * 返回代码
     */
    private String code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 默认构造，返回操作正确的返回代码和信息
     */
    public ReturnVO() {
        this.setCode(properties.getProperty(ReturnCode.SUCCESS.val()));
        this.setMsg(properties.getProperty(ReturnCode.SUCCESS.msg()));
    }

    /**
     * 构造一个返回特定代码的ReturnVO对象
     *
     * @param code
     */
    public ReturnVO(ReturnCode code) {
        this.setCode(properties.getProperty(code.val()));
        this.setMsg(properties.getProperty(code.msg()));
    }

    /**
     * 默认值返回，默认返回正确的code和message
     *
     * @param data
     */
    public ReturnVO(Object data) {
        this.setCode(properties.getProperty(ReturnCode.SUCCESS.val()));
        this.setMsg(properties.getProperty(ReturnCode.SUCCESS.msg()));
        this.setData(data);
    }

    /**
     * 构造返回代码，以及自定义的错误信息
     *
     * @param code
     * @param message
     */
    public ReturnVO(ReturnCode code, String message) {
        this.setCode(properties.getProperty(code.val()));
        this.setMsg(message);
    }

    /**
     * 构造自定义的code，message，以及data
     *
     * @param code
     * @param message
     * @param data
     */
    public ReturnVO(ReturnCode code, String message, Object data) {
        this.setCode(code.val());
        this.setMsg(message);
        this.setData(data);
    }

    @Override
    public String toString() {
        return "ReturnVO{" +
                "code='" + code + '\'' +
                ", message='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
