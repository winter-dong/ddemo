package com.song.ddemo.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 自定义密码编码器
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
