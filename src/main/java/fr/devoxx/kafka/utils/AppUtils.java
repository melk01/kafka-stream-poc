package fr.devoxx.kafka.utils;

import java.util.UUID;

public class AppUtils {


    public static String appID(String base ){

       return  base + UUID.randomUUID().toString();
    }
}
