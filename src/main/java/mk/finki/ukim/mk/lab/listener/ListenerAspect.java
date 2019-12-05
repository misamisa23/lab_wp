package mk.finki.ukim.mk.lab.listener;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Aspect
public class ListenerAspect {

    @Before("execution(* *.listPizzas())")
    public void listen(JoinPoint jp) {
        if (jp.getTarget().getClass().isAnnotationPresent(Listen.class)) {
            // perform the monitoring actions
            System.out.println("[WP-Log] {methodName}");
        }
    }
}


