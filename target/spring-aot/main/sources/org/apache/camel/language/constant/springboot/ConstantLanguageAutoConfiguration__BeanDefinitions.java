package org.apache.camel.language.constant.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ConstantLanguageAutoConfiguration}.
 */
@Generated
public class ConstantLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.constant.springboot.ConstantLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<ConstantLanguageAutoConfiguration> getConstantLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ConstantLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new ConstantLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'constantLanguageAutoConfiguration'.
   */
  public static BeanDefinition getConstantLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ConstantLanguageAutoConfiguration.class);
    InstanceSupplier<ConstantLanguageAutoConfiguration> instanceSupplier = getConstantLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(ConstantLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureConstantLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureConstantLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(ConstantLanguageAutoConfiguration.class, "configureConstantLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ConstantLanguageAutoConfiguration.class).configureConstantLanguage());
  }

  /**
   * Get the bean definition for 'configureConstantLanguage'.
   */
  public static BeanDefinition getConfigureConstantLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureConstantLanguageInstanceSupplier());
    return beanDefinition;
  }
}
