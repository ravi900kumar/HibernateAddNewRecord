package java9r.main.com;
import java.util.Date;
import java.util.List;

import java9r.dao.com.*;
import java9r.entites.com.*;
public class ProductMain {
	public static void main(String[] args) {
		ProductDAO product=new ProductDAO();

	//add  new record  
	Product p=new Product();
	p.setActive(true);
	p.setCreateiondate(new Date());
	p.setDescription("new description  ");
	p.setName("product new name ");
	p.setPhoto("photo");
	p.setPrice(Long.valueOf(1000));
	p.setQuantity(6);
	product.addnewrecord(p);
	System.out.println("Successfully added new record");

}
}