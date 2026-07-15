package org.apache.camel.language.simple.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link FileLanguageAutoConfiguration}.
 */
@Generated
public class FileLanguageAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static FileLanguageAutoConfiguration apply(RegisteredBean registeredBean,
      FileLanguageAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
