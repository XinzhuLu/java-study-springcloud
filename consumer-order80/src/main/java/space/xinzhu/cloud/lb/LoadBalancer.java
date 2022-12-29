package space.xinzhu.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @description: ???
 * Created by 馨竹 on 2022/12/27
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public interface LoadBalancer
{
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}