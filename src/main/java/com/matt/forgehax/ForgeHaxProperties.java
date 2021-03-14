package com.mikelax7.donhack;

import com.google.common.base.Strings;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created on 3/13/2021
 */
public class DonHackProperties {
  
  private static final Properties CONFIG_PROPERTIES = new Properties();
  
  static {
    InputStream input = null;
    try {
      input = DonHackProperties.class.getClassLoader().getResourceAsStream("config.properties");
      CONFIG_PROPERTIES.load(input);
    } catch (Throwable t) {
    } finally {
      if (input != null) {
        try {
          input.close();
        } catch (Throwable t) {
        }
      }
    }
  }
  
  public static Properties getConfigProperties() {
    return CONFIG_PROPERTIES;
  }
  
  public static String getVersion() {
    return Strings.nullToEmpty(getConfigProperties().getProperty("donhack.version"));
  }
  
  public static String getMcVersion() {
    return Strings.nullToEmpty(getConfigProperties().getProperty("donhack.mc.version"));
  }
  
  public static String getForgeVersion() {
    return Strings.nullToEmpty(getConfigProperties().getProperty("donhack.forge.version"));
  }
  
  public static String getMcpVersion() {
    return Strings.nullToEmpty(getConfigProperties().getProperty("donhack.mcp.version"));
  }
  
  public static String getMcpChannel() {
    return Strings.nullToEmpty(getConfigProperties().getProperty("donhack.mcp.channel"));
  }
  
  public static String getMcpMapping() {
    return Strings.nullToEmpty(getConfigProperties().getProperty("donhack.mcp.mapping"));
  }
  
  public static String getMcpMappingUrl() {
    return String.format("%s_%s_%s", getMcpVersion(), getMcpChannel(), getMcpMapping());
  }
}
