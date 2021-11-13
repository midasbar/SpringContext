package midasbar.study.springcontext

import midasbar.study.springcontext.beans.Bean1
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class SpringContextManuallyStarter

fun main(args: Array<String>) {
    //Manually start a Spring Context
    AnnotationConfigApplicationContext(ApplicationConfiguration::class.java).use { context ->
        val bean1: Bean1 = context.getBean(Bean1::class.java)
    }
}

