package dojo.supermarket.demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DealsTest {
    @ParameterizedTest
    @CsvSource({"0,3.50,0",
            "1,3.50,3.50",
            "2,3.50,5.25",
            "3,3.50,8.75",
            "4,3.50,10.50",
            "5,3.50,14.00"})
    void calcTest(int quantity, double price, double expectedTotal){
        double actualTotal = Deals.calcBuyOneGetOneHalfOff(quantity, price);
        assertEquals(expectedTotal, actualTotal);
    }
}