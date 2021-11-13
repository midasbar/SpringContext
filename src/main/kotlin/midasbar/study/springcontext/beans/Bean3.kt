package midasbar.study.springcontext.beans

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
class Bean3 (
    private var bean4: Bean4?
) {
    constructor() : this(null) {
        println("${javaClass.simpleName}::constructor")
    }

    init {
        println("${javaClass.simpleName}::init")
    }

    @PostConstruct
    fun postConstruct() {
        println("${javaClass.simpleName}::postConstruct")
    }

    @PreDestroy
    fun preDestroy() {
        println("${javaClass.simpleName}::preDestroy")
    }

    @Autowired
    fun setSpringBean4(bean4: Bean4?) {
        println("${javaClass.simpleName}::setSpringBean4")
        this.bean4 = bean4
    }
}
