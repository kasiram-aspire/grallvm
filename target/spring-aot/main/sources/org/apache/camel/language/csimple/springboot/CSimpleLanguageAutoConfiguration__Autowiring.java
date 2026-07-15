package org.apache.camel.language.csimple.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link CSimpleLanguageAutoConfiguration}.
 */
@Generated
public class CSimpleLanguageAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static CSimpleLanguageAutoConfiguration apply(RegisteredBean registeredBean,
      CSimpleLanguageAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
