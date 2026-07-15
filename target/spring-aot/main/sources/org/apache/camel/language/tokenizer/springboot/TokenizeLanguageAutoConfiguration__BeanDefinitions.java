package org.apache.camel.language.tokenizer.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TokenizeLanguageAutoConfiguration}.
 */
@Generated
public class TokenizeLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.tokenizer.springboot.TokenizeLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<TokenizeLanguageAutoConfiguration> getTokenizeLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TokenizeLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new TokenizeLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'tokenizeLanguageAutoConfiguration'.
   */
  public static BeanDefinition getTokenizeLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TokenizeLanguageAutoConfiguration.class);
    InstanceSupplier<TokenizeLanguageAutoConfiguration> instanceSupplier = getTokenizeLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(TokenizeLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureTokenizeLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureTokenizeLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(TokenizeLanguageAutoConfiguration.class, "configureTokenizeLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TokenizeLanguageAutoConfiguration.class).configureTokenizeLanguage());
  }

  /**
   * Get the bean definition for 'configureTokenizeLanguage'.
   */
  public static BeanDefinition getConfigureTokenizeLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureTokenizeLanguageInstanceSupplier());
    return beanDefinition;
  }
}
