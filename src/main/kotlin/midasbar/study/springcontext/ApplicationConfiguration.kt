package midasbar.study.springcontext

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
@ComponentScan //Can remove when Started by Spring Boot
class ApplicationConfiguration {

    @Bean
    fun beanFactoryPostProcessor() = BeanFactoryPostProcessorImpl()

    @Bean
    fun beanPostProcessor() = BeanPostProcessorImpl()

    constructor() {
        println("${javaClass.simpleName}::constructor")
    }

    init {
        println("${javaClass.simpleName}::init")
    }

    //Not called
    @PostConstruct
    fun postConstruct() {
        println("${javaClass.simpleName}::postConstruct")
    }

    //Not called
    @PreDestroy
    fun preDestroy() {
        println("${javaClass.simpleName}::preDestroy")
    }

}
