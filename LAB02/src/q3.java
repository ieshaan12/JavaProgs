class Item
{private String ItemName;
private String ItemIdNo;
private int ItemQuantity;
private double ItemPrice;
Item(String name,String idno,int quant,double price)
{this.ItemName=name;this.ItemIdNo=idno;this.ItemQuantity=quant;this.ItemPrice=price;
}
Item(String name,String idno,int quant)
		{this.ItemName=name;this.ItemIdNo=idno;this.ItemQuantity=quant;
		this.ItemPrice=500;
		}
Item(String name,String idno)
{this.ItemName=name;this.ItemIdNo=idno;this.ItemQuantity=1;this.ItemPrice=500;}
public String getItemName() {
	return ItemName;
}
public void setItemName(String itemName) {
	ItemName = itemName;
}
public String getItemIdNo() {
	return ItemIdNo;
}
public void setItemIdNo(String itemIdNo) {
	ItemIdNo = itemIdNo;
}
public int getItemQuantity() {
	return ItemQuantity;
}
public void setItemQuantity(int itemQuantity) {
	ItemQuantity = itemQuantity;
}
public double getItemPrice() {
	return ItemPrice;
}
public void setItemPrice(double itemPrice) {
	ItemPrice = itemPrice;
}
}
class Customer
{private String name;
private String idNo;
private double balance;
private Item item;
Customer(String n,String id,double bal)
{this.balance=bal;this.idNo=id;this.name=n;}
Customer(String n,String id)
{this.name=n;this.idNo=id;this.balance=5000;}
public String getName() {
	return name;
}
public String getIdNo() {
	return idNo;
}
public double getBalance() {
	return balance;
}
public Item getItem() {
	return item;
}
public void setName(String name) {
	this.name = name;
}
public void setIdNo(String idNo) {
	this.idNo = idNo;
}
public void print() {
	System.out.println(this.item.getItemIdNo()+ " "+ this.item.getItemName()+ " "+this.item.getItemQuantity()+" "+this.item.getItemPrice());
	this.balance=this.balance-(this.item.getItemPrice()*this.item.getItemQuantity());
	System.out.println("Remaining balance"+(this.balance));
}
public void buyItem(Item item) {
	System.out.println(this.item.getItemIdNo()+ " "+ this.item.getItemName()+ " "+this.item.getItemQuantity()+" "+this.item.getItemPrice());
	System.out.println(this.balance);
	double cost=this.item.getItemPrice()*this.item.getItemQuantity();
	if(cost>this.balance) {
		System.out.println("Insuffcient Funds");
	}
	if(this.item.getItemQuantity()<1)
	{System.out.println("Order isn't valid");}
}
	
}


public class q3 {

}
