package com.dcx.config.pay;

/**
 * @Author: 董承轩
 */
public class AlipayConfig {

    //应用的ID，申请时的APPID
    public static String app_id = "2016102200737101";

    //SHA256withRsa对应支付宝公钥
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi8Nqj6xlpWDg3brLPJFg8h3AVn/WBnOzWcc2HTQ9ySpwzPlydsPgGiy97GSbXNX0rUMITTz28WgwOkAu16S7nQMPokhDHrDnErK39/fcxVyD77S+EvqS5HpQclJ9gH7rfDD1qKZTM4K8E2Y9BQSoca9SoOMuFWAqNky0YW6u+b4DITBUssOyWbYo5dKr9rurW0n0/iM/OdFhcj/lh1mk82AS72AAumF2CeNFX2qYmVWJbgBaT34yI9E+Oe4vckQIYGyuAY7WMXYKDHM3OIwYsunrJ4j/H9TLkHzBZjSENY2VKNNRXbymYGIx2GrqzI+dWwZq5CVE0wianZoHMT6dZQIDAQAB";
    //签名方式
    public static String sign_type = "RSA2";
    //字码编码格式
    public static String charset = "utf-8";

    //回调地址
    public static String notifyUrl = "http://leige.qicp.vip/pay/callback/";

}
