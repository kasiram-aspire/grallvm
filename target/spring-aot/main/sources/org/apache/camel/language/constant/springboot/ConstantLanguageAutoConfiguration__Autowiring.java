package org.apache.camel.language.constant.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ConstantLanguageAutoConfiguration}.
 */
@Generated
public class ConstantLanguageAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ConstantLanguageAutoConfiguration apply(RegisteredBean registeredBean,
      ConstantLanguageAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
