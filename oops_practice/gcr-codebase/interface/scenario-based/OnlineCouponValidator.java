interface CouponValidator{
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code){
        return code.length()>=5;
    }
}
class ShoppingCart implements CouponValidator{
    @Override
    public boolean validateCoupon(String code){
        if(!CouponValidator.isLengthValid(code)){
            return false;
        }
        if(code.startsWith("Save")){
            return true;
        }
        return false;

    }
}
public class OnlineCouponValidator{
    public static void main(String[] args){
         String[] coupons = {
            "SAVE10",
            "OFF50",
            "SAVE100",
            "AB",
            "SAVE"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {

            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + "Valid Coupon");
            } else {
                System.out.println(coupon + "Invalid Coupon");
            }
        }
    }
}