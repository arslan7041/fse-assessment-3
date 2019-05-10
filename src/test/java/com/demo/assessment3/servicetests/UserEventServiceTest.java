package com.demo.assessment3.servicetests;

import com.demo.assessment3.TestUtils.TestEvents;
import com.demo.assessment3.models.UserEvent;
import com.demo.assessment3.respositories.UserEventRepository;
import com.demo.assessment3.services.UserEventService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class UserEventServiceTest {

    @Mock
    private UserEventRepository userEventRepository;

    private UserEventService userEventService;

    @Before
    public void setUp() {
        this.userEventService = new UserEventService(userEventRepository);
    }

    @Test
    public void saveProduct_savesTheProduct() {
        UserEvent userEvent= TestEvents.getEvents().get(0);

        //act
        userEventService.save(userEvent);

        //assert
        verify(userEventRepository, times(1)).save(userEvent);
    }

    @Test
    public void findByUserId_ReturnsEventsWithThatUserId() {
        String userId = "1b468f7d-79e8-40c1-80a2-0dd7226e7771"
        //act
        userEventService.findByUserId(userId);
        //assert
        verify(userEventRepository, times(1)).findByUserId(userId);
    }

    @Test
    public void filterProductsByBrand_returnsProductsWithThatBrand() {
        String brand = "gucci";
        //act
        productService.filterByBrand(brand);
        //assert
        verify(productRepository, times(1)).findByBrand(brand);
    }

    @Test
    public void filterProductsByPrice_returnsProductsWithThatPrice() {
        String price = "1650.0";
        //act
        productService.filterByPrice(price);
        //assert
        verify(productRepository, times(1)).findByPrice(Double.valueOf(price).doubleValue());
    }
}
