package org.apache.camel.language.bean.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.LanguageCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BeanLanguageAutoConfiguration}.
 */
@Generated
public class BeanLanguageAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.language.bean.springboot.BeanLanguageAutoConfiguration'.
   */
  private static BeanInstanceSupplier<BeanLanguageAutoConfiguration> getBeanLanguageAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BeanLanguageAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new BeanLanguageAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'beanLanguageAutoConfiguration'.
   */
  public static BeanDefinition getBeanLanguageAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BeanLanguageAutoConfiguration.class);
    InstanceSupplier<BeanLanguageAutoConfiguration> instanceSupplier = getBeanLanguageAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(BeanLanguageAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureBeanLanguage'.
   */
  private static BeanInstanceSupplier<LanguageCustomizer> getConfigureBeanLanguageInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LanguageCustomizer>forFactoryMethod(BeanLanguageAutoConfiguration.class, "configureBeanLanguage")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(BeanLanguageAutoConfiguration.class).configureBeanLanguage());
  }

  /**
   * Get the bean definition for 'configureBeanLanguage'.
   */
  public static BeanDefinition getConfigureBeanLanguageBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LanguageCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureBeanLanguageInstanceSupplier());
    return beanDefinition;
  }
}
