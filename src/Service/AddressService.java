package Service;

import static com.ty.person_address.util.AppConstant.SECRETE_KEY;

import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dao.PersonDao;
import com.ty.person_address.dto.Address;
import com.ty.person_address.dto.Person;
import com.ty.person_address.util.AES;

public class AddressService {
	AddressDao dao=new AddressDao();
	public int saveVisitor(Address address)
	{
		String encDoor_num=AES.encrypt(address.getStreet(),SECRETE_KEY );
		String encStreet=AES.encrypt(address.getDoor_num(),SECRETE_KEY );
		//String encPhone=AES.encrypt(address.getPhone(),SECRETE_KEY );
		
		address.setDoor_num(encDoor_num);
		address.setStreet(encStreet);
	//	address.setPhone(encPhone);
		return dao.saveAddress(address);
		
	}
}
