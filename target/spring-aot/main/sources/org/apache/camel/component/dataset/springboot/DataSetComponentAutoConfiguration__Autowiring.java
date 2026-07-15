package org.apache.camel.component.dataset.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DataSetComponentAutoConfiguration}.
 */
@Generated
public class DataSetComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DataSetComponentAutoConfiguration apply(RegisteredBean registeredBean,
      DataSetComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
