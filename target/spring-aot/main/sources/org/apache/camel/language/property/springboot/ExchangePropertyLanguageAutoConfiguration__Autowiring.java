package org.apache.camel.language.property.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ExchangePropertyLanguageAutoConfiguration}.
 */
@Generated
public class ExchangePropertyLanguageAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ExchangePropertyLanguageAutoConfiguration apply(RegisteredBean registeredBean,
      ExchangePropertyLanguageAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
