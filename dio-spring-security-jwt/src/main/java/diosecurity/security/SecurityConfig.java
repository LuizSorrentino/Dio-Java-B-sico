package diosecurity.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {
    public static String PREFIX;
    public static String KEY;
    public static Long EXPIRATION;

    public static String getPrefix() {
        return PREFIX;
    }
    public static void setPrefix(String prefix) {
        PREFIX = prefix;
    }
    public static String getKey() {
        return KEY;
    }
    public static void setKey(String key) {
        KEY = key;
    }
    public static Long getExpiration() {
        return EXPIRATION;
    }
    public static void setExpiration(Long expiration) {
        EXPIRATION = expiration;
    }  
    
}
