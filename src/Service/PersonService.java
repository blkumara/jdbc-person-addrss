package Service;

import static com.ty.person_address.util.AppConstant.SECRETE_KEY;

import com.ty.person_address.dao.PersonDao;
import com.ty.person_address.dto.Person;
import com.ty.person_address.util.AES;

public class PersonService {
	PersonDao dao=new PersonDao();
	public int saveVisitor(Person person)
	{
		String encName=AES.encrypt(person.getName(),SECRETE_KEY );
		String encEmail=AES.encrypt(person.getEmail(),SECRETE_KEY );
		//String encPhone=AES.encrypt(p.getPhone(),SECRETE_KEY );
		
		person.setName(encName);
		person.setEmail(encEmail);
	//	person.setPhone(encPhone);
		return dao.savePerson(person);
		
	}
}
