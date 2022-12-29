package space.xinzhu.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @description: ???
 * Created by 馨竹 on 2022/12/28
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}

