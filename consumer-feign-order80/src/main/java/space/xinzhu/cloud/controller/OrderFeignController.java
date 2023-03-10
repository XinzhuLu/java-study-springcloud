package space.xinzhu.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import space.xinzhu.cloud.entities.CommonResult;
import space.xinzhu.cloud.entities.Payment;
import space.xinzhu.cloud.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * @description: ???
 * Created by 馨竹 on 2022/12/28
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
@RestController
@Slf4j
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
