import java.util.ArrayList;
import java.util.List;

/* We have a table which has 4 columns as id, name, phone and address.
You need to have a method which will return me the data.
Create a method where you can hard code the data and print the details.
The main aim of above example is how you use data structure.*/

public class Data 
{
	List <Person> data = new ArrayList<Person>();
	public static void main(String[] args){
		
		Data D1 = new Data();
		D1.addData();
	}
	
//adds person data	
public void addData()
{
	
	Person model1 = new Person();
	        model1.setId("id"); 
			model1.setAddress("address");
			model1.setName("Name");
			model1.setPhone("phone");
	         data.add(model1);
	         
	Person model2 = new Person();
		    model2.setId("id1"); 
			model2.setAddress("address1");
			model2.setName("Name1");
			model2.setPhone("phone2");
		    data.add(model2);
	
		    for (Person m : data){

		    	// System.out.println("Data of "+data.iterator());
		    	 int i = data.indexOf(m);
		    	 System.out.println("Peson Details:"+data.get(i).getId()+", "+data.get(i).getName()+","+data.get(i).getPhone()+","+data.get(i).getAddress());
		    	}
}
// returns person data		    	 
public List <Person> getData()
{	
	return data;
}

}

class Person
{
	private String id,name,phone,address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}