package Tchat;

import Tchat.netty.WSServer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class NettyBoot  implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Netty正在启动");
        if (event.getApplicationContext().getParent() == null) {
            WSServer.getInstance().start();

        }
    }
}
