package com.drake.gulimall.product;

import com.drake.gulimall.product.entity.BrandEntity;
import com.drake.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;           // JUnit 5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTest {
    @Autowired
    BrandService brandService;


    @Test
    public void contextLoads() {


        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("蘋果");
        brandService.save(brandEntity);
        System.out.println("保存成功...");

    }
}