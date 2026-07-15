package org.apache.camel.component.dataset.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DataSetComponentConverter}.
 */
@Generated
public class DataSetComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DataSetComponentConverter apply(RegisteredBean registeredBean,
      DataSetComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
