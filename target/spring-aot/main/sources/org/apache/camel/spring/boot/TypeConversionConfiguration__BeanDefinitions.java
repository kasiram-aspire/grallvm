package org.apache.camel.spring.boot;

import org.apache.camel.CamelContext;
import org.apache.camel.TypeConverter;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.convert.ConversionService;

/**
 * Bean definitions for {@link TypeConversionConfiguration}.
 */
@Generated
public class TypeConversionConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'typeConversionConfiguration'.
   */
  public static BeanDefinition getTypeConversionConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TypeConversionConfiguration.class);
    beanDefinition.setInstanceSupplier(TypeConversionConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'typeConverter'.
   */
  private static BeanInstanceSupplier<TypeConverter> getTypeConverterInstanceSupplier() {
    return BeanInstanceSupplier.<TypeConverter>forFactoryMethod(TypeConversionConfiguration.class, "typeConverter", CamelContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TypeConversionConfiguration.class).typeConverter(args.get(0)));
  }

  /**
   * Get the bean definition for 'typeConverter'.
   */
  public static BeanDefinition getTypeConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TypeConverter.class);
    beanDefinition.setInstanceSupplier(getTypeConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'springTypeConverter'.
   */
  private static BeanInstanceSupplier<SpringTypeConverter> getSpringTypeConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SpringTypeConverter>forFactoryMethod(TypeConversionConfiguration.class, "springTypeConverter", CamelContext.class, ConversionService[].class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TypeConversionConfiguration.class).springTypeConverter(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'springTypeConverter'.
   */
  public static BeanDefinition getSpringTypeConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringTypeConverter.class);
    beanDefinition.setInstanceSupplier(getSpringTypeConverterInstanceSupplier());
    return beanDefinition;
  }
}
