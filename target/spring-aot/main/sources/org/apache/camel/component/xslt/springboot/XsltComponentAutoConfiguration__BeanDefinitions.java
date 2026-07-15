package org.apache.camel.component.xslt.springboot;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ComponentCustomizer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link XsltComponentAutoConfiguration}.
 */
@Generated
public class XsltComponentAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.apache.camel.component.xslt.springboot.XsltComponentAutoConfiguration'.
   */
  private static BeanInstanceSupplier<XsltComponentAutoConfiguration> getXsltComponentAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<XsltComponentAutoConfiguration>forConstructor(CamelContext.class)
            .withGenerator((registeredBean, args) -> new XsltComponentAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'xsltComponentAutoConfiguration'.
   */
  public static BeanDefinition getXsltComponentAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(XsltComponentAutoConfiguration.class);
    InstanceSupplier<XsltComponentAutoConfiguration> instanceSupplier = getXsltComponentAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(XsltComponentAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configureXsltComponent'.
   */
  private static BeanInstanceSupplier<ComponentCustomizer> getConfigureXsltComponentInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentCustomizer>forFactoryMethod(XsltComponentAutoConfiguration.class, "configureXsltComponent")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(XsltComponentAutoConfiguration.class).configureXsltComponent());
  }

  /**
   * Get the bean definition for 'configureXsltComponent'.
   */
  public static BeanDefinition getConfigureXsltComponentBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentCustomizer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getConfigureXsltComponentInstanceSupplier());
    return beanDefinition;
  }
}
