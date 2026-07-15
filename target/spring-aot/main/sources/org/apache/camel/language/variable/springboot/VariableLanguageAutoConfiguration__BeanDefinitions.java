package org.apache.camel.language.variable.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link VariableLanguageAutoConfiguration}.
 */
@Generated
public class VariableLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.variable.springboot.VariableLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<VariableLanguageAutoConfiguration> getVariableLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<VariableLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new VariableLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'variableLanguageAutoConfiguration'.
   */
  public static BeanDefinition getVariableLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(VariableLanguageAutoConfiguration.class);
    InstanceSupplier<VariableLanguageAutoConfiguration> instanceSupplier = getVariableLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(VariableLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureVariableLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureVariableLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(VariableLanguageAutoConfiguration.class, "configureVariableLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(VariableLanguageAutoConfiguration.class).configureVariableLanguage());
  }

  /**
   * Get the bean definition for 'configureVariableLanguage'.
   */
  public static BeanDefinition getConfigureVariableLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureVariableLanguageInstanceSupplier());
    return beanDefinition;
  }
}
