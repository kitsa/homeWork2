package web;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
		
	@RequestMapping("/")
	String index() {
		return "Hello World!";
	}
        
        @RequestMapping("/area")
        double area(double radius){
            return Math.PI * radius * radius;
        }
	
        @RequestMapping("/vat/{price}")
        double vat(@PathVariable double price){
            return 6.5 * price;
        }
        
        @RequestMapping("/zipcode/{district}")
        String zipcode(@PathVariable String district){
            String result = "ไม่มี";
            String tmp = district;
            if(tmp.equals("เมืองนนทบุรี")) result = "11000";
            if(tmp.equals("บางบัวทอง"))result = "11110";
            if(tmp.equals("ปากเกร็ด")) result = "11120";
            if(tmp.equals("บางกรวย"))result = "11130";
            if(tmp.equals("บางใหญ่"))  result = "11140";
            if(tmp.equals("ไทรน้อย"))  result = "11150";
            return result;    
        }
        
        @RequestMapping("/car-tax/{cc}/{seat}")
        double calculate(@PathVariable int cc, @PathVariable int seat) {
            return (0.75 * cc)+(70 * seat);
        }
        
}
