package dojo.supermarket.demo;

public class BuyOneGetOneHalfOff {
    public static double calcBuyOneGetOneHalfOff(int quantity, double price){
        if(quantity == 3){
            return price*2 + price*.5;
        }
        else if(quantity > 2 && quantity % 2 == 0){
            return (price * 2 - price * .5) * quantity/2;
        }
        else if (quantity > 2 && quantity % 2 != 0){
            return (price * (quantity % 2)) + (price * 2 - price * .5) * (quantity-(quantity % 2))/2;
        }
        else if(quantity == 2){
            return price * 2 - price * .5;
        }
        else if(quantity == 1){
            return price;
        }
        else{
            return 0;
        }
    }
}
