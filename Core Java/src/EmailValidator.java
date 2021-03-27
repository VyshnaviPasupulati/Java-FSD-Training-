
public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="vyshnavi@mail.com";
		
		int iat = email.indexOf("@");
		int idot = email.indexOf(".");
		if(iat== email.lastIndexOf("@") &&  idot==email.lastIndexOf(".") && iat > 3 && idot > iat+3 && email.length() > idot+2)
            
			System.out.println("email is valid");
		else
			System.out.println("email is not valid");
	}

}
