package org.apache.camel.language.variable.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link VariableLanguageAutoConfiguration}.
 */
@Generated
public class VariableLanguageAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static VariableLanguageAutoConfiguration apply(RegisteredBean registeredBean,
      VariableLanguageAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
