package org.apache.camel.component.language.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LanguageComponentAutoConfiguration}.
 */
@Generated
public class LanguageComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.language.springboot.LanguageComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<LanguageComponentAutoConfiguration> getLanguageComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new LanguageComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'languageComponentAutoConfiguration'.
   */
  public static BeanDefinition getLanguageComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageComponentAutoConfiguration.class);
    InstanceSupplier<LanguageComponentAutoConfiguration> instanceSupplier = getLanguageComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LanguageComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureLanguageComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureLanguageComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(LanguageComponentAutoConfiguration.class, "configureLanguageComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(LanguageComponentAutoConfiguration.class).configureLanguageComponent());
  }

  /**
   * Get the bean definition for 'configureLanguageComponent'.
   */
  public static BeanDefinition getConfigureLanguageComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureLanguageComponentInstanceSupplier());
    return beanDefinition;
  }
}
