import java.util.StringTokenizer;

class Adress{
	String line1;
	String line2;
	String line3;
	String pin;
	char[] city;
	char[] state;
	Adress(String str){
		StringTokenizer st=new StringTokenizer(str,"$");
		this.line1=st.nextToken();
		this.line2=st.nextToken();
		this.line3=st.nextToken();
		this.city=st.nextToken().toCharArray();
		this.state=st.nextToken().toCharArray();
		this.pin=st.nextToken();
	}
	public String getLine1() {
		return line1;
	}
	public String getLine2() {
		return line2;
	}
	public String getLine3() {
		return line3;
	}
	public String getPin() {
		return pin;
	}
	public String getCity() {
		return city.toString();
	}
	public String getState() {
		return state.toString();
	}
	
}
class AddressList{
	public static int countAddressWithCity(Adress[] addressList, String city){
		/*This method returns the count of the addresses from addressList which have the city
		attribute equals to city parameter passed for this method. If the length of any passed
		argument is zero or value of any passed argument is null then it returns -1.*/
		int c=0;
		for(Adress i:addressList)
		{if(i.getCity().equals(city))
		{c++;
		}}
		return c;
	}// End of method countAddressWithCity()
		public static int countAddressWithPin(Adress[] addressList, String strP){
		/*This method returns the count of the addresses from addressList which have the pin
		attribute starting with strP parameter passed for this method. If the length of any
		passed argument is zero or value of any passed argument is null then it returns -1.*/
			int c=0;
			for(Adress i:addressList)
			{if(i.getPin().equals(strP))
			{c++;
			}}
			return c;
		}// End of method countAddressWithCity()
		public static Adress[] getAddressWithCity(Adress[] addressList, String city){
		/*This method returns all the addresses from addressList by storing them in String[]
		which have the city attribute equals to city parameter passed for this method. If the
		length of any passed argument is zeroor value of any passed argument is null then it
		returns null. If addressList does not contain any address with city attribute value
		equal to city parameter passed for this method even then it returns null.*/
		if(city==null || addressList.length==0)
			return null;
		else
		{int c=0;
			for(Adress i:addressList)
		{if(i.getCity().equals(city))
		{c++;
		}}
			if(c==0)
				return null;
			else {int k=0;
				Adress[] pass=new Adress[c];
				for(Adress i:addressList)
				{if(i.getCity().equals(city))
					{pass[k]=i;k++;}
				
				}
				return pass;
			}
		}
		}// End of method getAddressWithCity()
		public static Adress[] getAddressWithPin(Adress[] addressList, String strP){
		/*This method returns all the addresses from addressList by storing them in String[]
		which have their pin attribute starting with strP parameter passed for this method. If
		the length of any passed argument is zero or value of any passed argument is null then
		it returns null. If addressList does not contain any address whose pins attribute value
		starts with strP parameter passed for this method even then it returns null.*/
			if(strP==null || addressList.length==0)
				return null;
			else
			{int c=0;
				for(Adress i:addressList)
			{if(i.getPin().equals(strP))
			{c++;
			}}
				if(c==0)
					return null;
				else {int k=0;
					Adress[] pass=new Adress[c];
					for(Adress i:addressList)
					{if(i.getPin().equals(strP))
						{pass[k]=i;k++;}
					
					}
					return pass;
				}
			}
		}// End of method getAddressWithC
	
}
public class q2 {

}
