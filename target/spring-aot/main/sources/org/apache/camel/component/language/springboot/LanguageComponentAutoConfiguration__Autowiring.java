package org.apache.camel.component.language.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link LanguageComponentAutoConfiguration}.
 */
@Generated
public class LanguageComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static LanguageComponentAutoConfiguration apply(RegisteredBean registeredBean,
      LanguageComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
