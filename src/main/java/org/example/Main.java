package org.example;
import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {
        //kategori
        Category category = new Category();
        category.setId(1);
        category.setCategoryName("Ofis Ürünleri");
        Category category2 = new Category(2,"Kitap");

        //ürün
        Product product = new Product();
        product.setId(1);
        product.setProductName("Masa");
        product.setPrice(1000);
        Product product2 = new Product(2,"Psikoloji",250);

        //kullanıcı
        User user = new User();
        user.setId(1);
        user.setUserName("Tuba");
        User user2 = new User(2,"Ahmet");

        //sipariş
        Order order = new Order();
        order.setId(1);
        order.setQuantity(200);
        Order order2 = new Order(5,3);

        System.out.println("Müşterimiz "+ user.getUserName() +" "  + category.getCategoryName() + " bölümünden "+ order.getQuantity() + " adet "+ product.getProductName() +"yı " + product.getPrice() + " tl ye almıştır.");
        System.out.println("Müşterimiz "+ user2.getUserName() +" "  + category2.getCategoryName() + " bölümünden "+ order2.getQuantity() + " adet "+ product2.getProductName() +" kitabını " + product2.getPrice() + " tl ye almıştır.");
    }
}