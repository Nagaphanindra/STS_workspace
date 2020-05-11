package service;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import model.Product;

@Service
public class ProductService {
	
	Hashtable<String, Product> products = new Hashtable<String, Product>();
	
	public ProductService() {
		Product p = new Product();
		p.setId("222");
		p.setName("Books");
		
		products.put("2", p);
		
		p = new Product();
		p.setId("333");
		p.setName("Markers");
		
		products.put("3", p);
	}
	
	public Hashtable<String, Product> getAll() {
		return products;
	}

}
