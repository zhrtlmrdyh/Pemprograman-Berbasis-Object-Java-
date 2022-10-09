/*
 * Nama		: Zahratul Mardiyah
 * NIM		: 211511064
 * Kelas	: 2B - D3 Teknik Informatika
 */

package StudiKasus1;

abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    
    public StaffMember(String eName, String eAddress, String ePhone){
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    
    @Override
    public String toString(){
        String result = "Name: " + name + "\n";
        
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        
        return result;
    }    
    
    public abstract double pay();
}