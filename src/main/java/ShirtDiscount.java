public class ShirtDiscount {
    public static void main(String[] args) {
        int shirtPrice = 3700; // Цена одной рубашки без скидки
        int selectedShirts = 2; // Количество уже выбранных рубашек
        int shirtsForDiscount = 3; // Количество рубашек, необходимое для скидки
        double discountPercent = 0.4; // Процент скидки

        int shirtsToAddForDiscount = shirtsForDiscount - selectedShirts; // Количество рубашек, которые надо добавить к купленным для скидки
        int totalPriceSelected = shirtPrice * selectedShirts; // Цена уже выбранных рубашек без скидки
        int totalPriceToAdd = shirtPrice * shirtsToAddForDiscount; // Цена рубашек (без скидки), которые надо докупить, чтобы получить скидку
        double priceWithDiscount = (totalPriceSelected + totalPriceToAdd) * (1 - discountPercent); // Цена всех рубашек со скидкой
        double pricePerShirtWithDiscount = shirtPrice * (1 - discountPercent); // Цена одной рубашки со скидкой
        double savedMoney = totalPriceSelected + totalPriceToAdd - priceWithDiscount; // Сэкономленные деньги
        double freeShirts = savedMoney / shirtPrice; // Количество рубашек на халяву

        System.out.println("Цена одной рубашки без скидки: " + shirtPrice + " руб.");
        System.out.println("Количество уже выбранных рубашек: " + selectedShirts);
        System.out.println("Количество рубашек, необходимое для получения скидки: " + shirtsForDiscount);
        System.out.println("Количество рубашек, которые надо добавить к купленным, чтобы получить скидку: " + shirtsToAddForDiscount);
        System.out.println("Цена уже выбранных рубашек без скидки: " + totalPriceSelected + " руб.");
        System.out.println("Цена рубашек (без скидки), которые надо докупить, чтобы получить скидку: " + totalPriceToAdd + " руб.");
        System.out.println("Процент скидки: " + discountPercent + "%");
        System.out.println("Цена всех рубашек со скидкой: " + priceWithDiscount + " руб.");
        System.out.println("Цена одной рубашки со скидкой: " + pricePerShirtWithDiscount + " руб.");
        System.out.println("Сэкономленные деньги: " + savedMoney + " руб.");
        System.out.println("Количество рубашек на халяву: " + freeShirts);
    }
}