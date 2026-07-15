package org.apache.camel.component.browse.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link BrowseComponentAutoConfiguration}.
 */
@Generated
public class BrowseComponentAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static BrowseComponentAutoConfiguration apply(RegisteredBean registeredBean,
      BrowseComponentAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("applicationContext").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("configuration").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
