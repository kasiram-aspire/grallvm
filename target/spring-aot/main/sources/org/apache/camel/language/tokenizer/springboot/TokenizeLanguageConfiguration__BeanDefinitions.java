package org.apache.camel.language.tokenizer.springboot;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TokenizeLanguageConfiguration}.
 */
@Generated
public class TokenizeLanguageConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'tokenizeLanguageConfiguration'.
   */
  public static BeanDefinition getTokenizeLanguageConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TokenizeLanguageConfiguration.class);
    beanDefinition.setInstanceSupplier(TokenizeLanguageConfiguration::new);
    return beanDefinition;
  }
}
