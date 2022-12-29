package space.xinzhu.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import space.xinzhu.cloud.entities.CommonResult;
import space.xinzhu.cloud.entities.Payment;

/**
 * @description: ???
 * Created by 馨竹 on 2022/12/28
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService
{
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}