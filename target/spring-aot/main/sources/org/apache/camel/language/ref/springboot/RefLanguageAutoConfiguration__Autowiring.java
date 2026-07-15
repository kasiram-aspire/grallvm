package org.apache.camel.language.ref.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link RefLanguageAutoConfiguration}.
 */
@Generated
public class RefLanguageAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static RefLanguageAutoConfiguration apply(RegisteredBean registeredBean,
      RefLanguageAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
