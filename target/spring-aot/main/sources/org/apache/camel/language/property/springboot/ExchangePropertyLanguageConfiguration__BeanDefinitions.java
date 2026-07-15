package org.apache.camel.language.property.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ExchangePropertyLanguageConfiguration}.
 */
@Generated
public class ExchangePropertyLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'exchangePropertyLanguageConfiguration'.
   */
  public static BeanDefinition getExchangePropertyLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ExchangePropertyLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(ExchangePropertyLanguageConfiguration::new);
    return beanDefinition;
  }
}
