package org.apache.camel.language.header.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HeaderLanguageAutoConfiguration}.
 */
@Generated
public class HeaderLanguageAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HeaderLanguageAutoConfiguration apply(RegisteredBean registeredBean,
      HeaderLanguageAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
