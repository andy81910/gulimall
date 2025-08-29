package com.drake.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.drake.gulimall.product.entity.BrandEntity;
import com.drake.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;           // JUnit 5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTest {
    @Autowired
    BrandService brandService;


    @Test
    public void contextLoads() {

//--------插入新的的值---------------------------------------
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("蘋果");
//        brandService.save(brandEntity);
//        System.out.println("保存成功...");

//--------修改Descript欄的值--------------------------------
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L); //ID 1是long型,所以寫1L
//        brandEntity.setDescript("三星");
//        brandService.updateById(brandEntity);

//--------依照ID查詢----------------------------------------
//        brandService.updateById(brandEntity);
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach((item)->{
//            System.out.println(item);
//    });
//--------刪除主鍵2(ID:2)-----------------------------------
//        boolean del2 = brandService.removeById(2L);
//        System.out.println("del2=" + del2 );

//--------改變name欄brand_id=1的值--------------------------
        BrandEntity e = new BrandEntity();
        e.setBrandId(1L);
        e.setName("三星");
        boolean ok = brandService.updateById(e);
        System.out.println("updated? " + ok);
//---------------------------------------------------------


    }
}