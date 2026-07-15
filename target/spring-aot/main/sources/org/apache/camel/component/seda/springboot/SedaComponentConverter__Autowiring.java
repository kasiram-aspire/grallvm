package org.apache.camel.component.seda.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SedaComponentConverter}.
 */
@Generated
public class SedaComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SedaComponentConverter apply(RegisteredBean registeredBean,
      SedaComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
