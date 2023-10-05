package com.ac.clientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * @author code2tan
 * 签名工具
 */
public class SignUtils {
    /**
     * 生成签名
     *
     * @param body      请求体
     * @param secretKey 密钥
     * @return 加密串
     */
    public static String genSign(String body, String secretKey) {
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = body + "." + secretKey;
        return md5.digestHex(content);
    }
}
