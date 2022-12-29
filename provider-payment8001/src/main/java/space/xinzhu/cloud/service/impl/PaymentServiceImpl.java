package space.xinzhu.cloud.service.impl;

import org.springframework.stereotype.Service;
import space.xinzhu.cloud.dao.PaymentDao;
import space.xinzhu.cloud.entities.Payment;
import space.xinzhu.cloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @description: ???
 * Created by 馨竹 on 2022/12/27
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
