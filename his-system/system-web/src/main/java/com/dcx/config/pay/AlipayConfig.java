package com.dcx.config.pay;

/**
 * @Author: 董承轩
 */
public class AlipayConfig {

    //应用的ID，申请时的APPID
    public static String app_id = "2021000119611634";

    //SHA256withRsa对应支付宝公钥
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzicTjZbX4gJfivvyym/igVNW8mME3cs6RVe4epB1g7lf9HWu6nR0ax+J6uduPoSLjZkDPD/D5X4mFgy0Y+UzUQjFDiXYFHqdlBVLkXTQneXY2DVjOxKhwn22owyANMqJX6Tf+VbOL5jfn9/1DfVFyN0ZhOXbTMmJ/nP873LHtWeeqHdUYpUYLfQ56ezDntZ3c3XbsGuCrfEFA0KJ0+Kmus3ifvXzNKq+yE4dkLXxT4jgkUfx74KKwyt2khJvXIflTGc8auRTZ8M/4Gu4/FBo3MA8J48kJ7HLqzr9BMqYaj3gqPaDuGJzx4i6P5V7LyM2oIE3f7MPjkNPpeiElZfDOQIDAQAB";
    //签名方式
    public static String sign_type = "RSA2";
    //字码编码格式
    public static String charset = "utf-8";

    //回调地址
    public static String notifyUrl = "http://leige.qicp.vip/pay/callback/";

}
