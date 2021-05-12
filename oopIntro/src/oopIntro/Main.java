package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V14", 15000,"16 GB RAM");
	
		Product product2 = new Product();
		product2.id =2;
		product2.name = "Lenovo v15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB RAM";
		
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "HP 5";
		product3.unitPrice = 10000;
		product3.detail = "10 GB RAM";
		
		Product[] products = {product1, product2, product3};
		System.out.println(products.length + " adet ürün bulunmaktadır.");
		
		for (Product product : products) {
			System.out.println(product.name + " eklendi.");
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
