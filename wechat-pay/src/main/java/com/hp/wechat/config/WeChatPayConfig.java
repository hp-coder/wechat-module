package com.hp.wechat.config;


import java.io.InputStream;

/**
 * 微信支付配置
 *
 * @Author: HP
 */
public interface WeChatPayConfig {
    String getAppId();

    String getMchId();

    String getKey();

    void setKey(String key);

    default InputStream getCertStream() {
        return null;
    }

    ;

    default boolean getUseSandbox() {
        return false;
    }

    default int getHttpConnectTimeoutMs() {
        return 6000;
    }

    ;

    default int getHttpReadTimeoutMs() {
        return 6000;
    }
}
