package org.apache.camel.component.xslt.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link XsltComponentConfiguration}.
 */
@Generated
public class XsltComponentConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'xsltComponentConfiguration'.
   */
  public static BeanDefinition getXsltComponentConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(XsltComponentConfiguration.class);
    beanDefinition.setInstanceSupplier(XsltComponentConfiguration::new);
    return beanDefinition;
  }
}
