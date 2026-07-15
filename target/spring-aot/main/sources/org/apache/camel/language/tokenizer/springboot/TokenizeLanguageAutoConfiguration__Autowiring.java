package org.apache.camel.language.tokenizer.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TokenizeLanguageAutoConfiguration}.
 */
@Generated
public class TokenizeLanguageAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static TokenizeLanguageAutoConfiguration apply(RegisteredBean registeredBean,
      TokenizeLanguageAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
