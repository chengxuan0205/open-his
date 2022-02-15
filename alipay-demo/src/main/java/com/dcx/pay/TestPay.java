package com.dcx.pay;

import java.util.Map;

/**
 * @Author: 董承轩
 */
public class TestPay {
    public static void main(String[] args) {
        String outTradeNo = "OD123124124ABCDEFG";
        String subject = "SXT-医疗管理系统支付平台";
        String totalAmount = "100";
        String undiscountableAmount = null;
        String body = "买药用的";
        String notifyUrl = "http://127.0.0.1" + outTradeNo;
        Map<String, Object> pay = PayService.pay(outTradeNo, subject, totalAmount, undiscountableAmount, body, notifyUrl);
        System.out.println(pay);
    }
}
