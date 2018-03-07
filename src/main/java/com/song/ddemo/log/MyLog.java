package com.song.ddemo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class MyLog {
    public static Logger errLog = LoggerFactory.getLogger("com.xdsystem.error");
    public static Logger infoLog = LoggerFactory.getLogger("com.xdsystem.info");
}
