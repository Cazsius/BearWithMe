package com.mrtrollnugnug.bearwithme.lib;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constants {

    public static final String MOD_ID = "bearwithme";

    public static final String MOD_NAME = "Bear With Me";

    public static final String VERSION_NUMBER = "1.12.2-1.3.1";

    public static final String CLIENT_PROXY_CLASS = "com.mrtrollnugnug.bearwithme.client.ClientProxy";

    public static final String SERVER_PROXY_CLASS = "com.mrtrollnugnug.bearwithme.common.CommonProxy";

    public static final Random RANDOM = new Random();

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
}
