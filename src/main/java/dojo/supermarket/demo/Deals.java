package dojo.supermarket.demo;

public class Deals {
    public static double calcBuyOneGetOneHalfOff(int itemNumber, double itemValue){
        double total = 0;
        if(itemNumber > 2 && itemNumber % 2 == 0){
            return (itemValue * 2 - itemValue * .5) * itemNumber/2;
        }
        else if (itemNumber > 2 && itemNumber % 2 != 0){
            return (itemValue * (itemNumber % 2)) + (itemValue * 2 - itemValue / 2) * (itemNumber-(itemNumber % 2))/2;
        }
//        else if(quantity == 4){
//            return price*2 + price*2*.5;
//        }
        else if(itemNumber == 3){
            return itemValue*2 + itemValue * .5;
        }
        else if(itemNumber == 2){
            return itemValue * 2 - itemValue / 2;
        }
        else if(itemNumber == 1){
            total = itemValue;
            return total;
        }
        else{
            return 0;
        }
    }
}
