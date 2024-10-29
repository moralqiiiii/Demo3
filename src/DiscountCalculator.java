public class DiscountCalculator {

    public static final int persentase = 100;

    public static double calculateDiscount(double originalPrice, double discountPercentage) {
        return getaDouble(originalPrice, discountPercentage);
    }

    /**
     * @param originalPrice (Harga Normal/Aseli)
     * @param discountPercentage (Persentase Diskon)
     * @return
     */
    private static double getaDouble(double originalPrice, double discountPercentage) {
        return originalPrice - (originalPrice * discountPercentage / persentase);
    }

}
