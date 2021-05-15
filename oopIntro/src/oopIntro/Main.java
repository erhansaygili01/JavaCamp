package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V14", 15000,"16 GB RAM",10,15500);
	
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount() + " indirimden sonraki fiyatı.");
		
		Product product3 = new Product();
		product3.setId(3);
		
		Product[] products = {product1, product2, product3};
		System.out.println(products.length + " adet ürün bulunmaktadır.");
		
		for (Product product : products) {
			System.out.println(product.getName() + " eklendi.");
		}
		
		Category category1 = new Category(1,"Bilgisayar");
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev-Bahçe";
		
		Category[] categories = {category1, category2};
		for (Category category : categories) {
			System.out.println(category.name + " eklendi.");
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		

	}

}
