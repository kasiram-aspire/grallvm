package org.apache.camel.component.browse.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BrowseComponentAutoConfiguration}.
 */
@Generated
public class BrowseComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.browse.springboot.BrowseComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<BrowseComponentAutoConfiguration> getBrowseComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BrowseComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new BrowseComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'browseComponentAutoConfiguration'.
   */
  public static BeanDefinition getBrowseComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BrowseComponentAutoConfiguration.class);
    InstanceSupplier<BrowseComponentAutoConfiguration> instanceSupplier = getBrowseComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(BrowseComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureBrowseComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureBrowseComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(BrowseComponentAutoConfiguration.class, "configureBrowseComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(BrowseComponentAutoConfiguration.class).configureBrowseComponent());
  }

  /**
   * Get the bean definition for 'configureBrowseComponent'.
   */
  public static BeanDefinition getConfigureBrowseComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureBrowseComponentInstanceSupplier());
    return beanDefinition;
  }
}
