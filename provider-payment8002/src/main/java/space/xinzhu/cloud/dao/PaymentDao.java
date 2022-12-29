package space.xinzhu.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import space.xinzhu.cloud.entities.Payment;

/**
 * @description: ???
 * Created by 馨竹 on 2022/12/27
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
@Mapper
public interface PaymentDao
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

