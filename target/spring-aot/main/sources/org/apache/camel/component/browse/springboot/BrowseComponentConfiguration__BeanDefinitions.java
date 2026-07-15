package org.apache.camel.component.browse.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BrowseComponentConfiguration}.
 */
@Generated
public class BrowseComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'browseComponentConfiguration'.
   */
  public static BeanDefinition getBrowseComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BrowseComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(BrowseComponentConfiguration::new);
    return beanDefinition;
  }
}
