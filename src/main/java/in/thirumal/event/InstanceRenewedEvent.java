/**
 * 
 */
package in.thirumal.event;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Thirumal
 *
 */
@Component
public class InstanceRenewedEvent implements ApplicationListener<EurekaInstanceRenewedEvent> {

	@Override
	public void onApplicationEvent(EurekaInstanceRenewedEvent event) {
		System.out.println("Renewed: " + event.getInstanceInfo());
	}

}
