package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Product;
import service.ProductService;

@Component
@RestController
public class productController {
	
	@Autowired
	ProductService prdsrvc;
	
	@RequestMapping("/products/all")
	public Hashtable<String,Product> getAll(){
		return prdsrvc.getAll();		
	}
}
