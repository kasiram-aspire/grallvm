package org.apache.camel.component.dataset.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DataSetTestComponentConverter}.
 */
@Generated
public class DataSetTestComponentConverter__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DataSetTestComponentConverter apply(RegisteredBean registeredBean,
      DataSetTestComponentConverter instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
