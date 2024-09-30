package tz.go.mohz.hfr.nhif.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvUtil {

  private static final Logger logger = LoggerFactory.getLogger(EnvUtil.class);
  private static final Dotenv dotenv = Dotenv.load();

  /**
   * Retrieves an environment variable by key.
   *
   * @param key the environment variable key
   * @return the environment variable value, or null if not set
   */
  public static String getEnvVariable(String key) {
    String value = dotenv.get(key);
    if (value == null || value.isEmpty()) {
      logger.warn("Environment variable '{}' is not set!", key);
    }
    return value;
  }
}
