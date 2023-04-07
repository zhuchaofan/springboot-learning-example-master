package org.spring.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private CityService cityService;
    @Test
    public void consumerTest() {
        City city =cityService.findCityById(1L);
        System.out.println(city.getCityName()+" "+city.getDescription());
//        City city = new City();
//        city.setId(2L);
//        city.setProvinceId(2L);
//        city.setCityName("shanghai");
//        city.setDescription("this!");
//        cityService.saveCity(city);
    }

}
