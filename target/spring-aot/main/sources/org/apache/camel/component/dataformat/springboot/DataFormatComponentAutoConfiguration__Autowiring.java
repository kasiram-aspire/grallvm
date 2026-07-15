package org.apache.camel.component.dataformat.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DataFormatComponentAutoConfiguration}.
 */
@Generated
public class DataFormatComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DataFormatComponentAutoConfiguration apply(RegisteredBean registeredBean,
      DataFormatComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
