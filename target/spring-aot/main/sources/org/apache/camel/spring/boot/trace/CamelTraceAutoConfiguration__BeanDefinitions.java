package org.apache.camel.spring.boot.trace;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.BacklogTracer;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CamelTraceAutoConfiguration}.
 */
@Generated
public class CamelTraceAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'camelTraceAutoConfiguration'.
   */
  public static BeanDefinition getCamelTraceAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CamelTraceAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CamelTraceAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'backlogTracer'.
   */
  private static BeanInstanceSupplier<BacklogTracer> getBacklogTracerInstanceSupplier() {
    return BeanInstanceSupplier.<BacklogTracer>forFactoryMethod(CamelTraceAutoConfiguration.class, "backlogTracer", CamelContext.class, CamelTraceConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CamelTraceAutoConfiguration.class).backlogTracer(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'backlogTracer'.
   */
  public static BeanDefinition getBacklogTracerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BacklogTracer.class);
    beanDefinition.setInstanceSupplier(getBacklogTracerInstanceSupplier());
    return beanDefinition;
  }
}
