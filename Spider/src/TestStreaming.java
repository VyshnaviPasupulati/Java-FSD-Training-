import com.ibm.streaming.AgeRestrictionException;
import com.ibm.streaming.Media;
import com.ibm.streaming.Movie;
import com.ibm.streaming.Series;
import com.ibm.streaming.Subscription;
import com.ibm.streaming.SubscriptionException;
import com.ibm.streaming.AgeRestrictionException;
import com.ibm.streaming.User;

public class TestStreaming {
public static void main(String[] args)  {
	Subscription s = new Subscription();
	User u1 = new User("Vysh",21,"female",3000);
	User u2 = new User("Yash",27,"male",200);
	User u3= new User("Vyshnavi",19,"female",2000);
	User u4 = new User("kim",49,"female",00);
	
	Movie m1 = new Movie("Hangover","Errotic",false);
	Movie m2 = new Movie("EvilDead","Horror",true);
	Movie m3 = new Movie("avtar","action",false);
	
	
	Series s1 =new Series("Friends", "Comdey", false, 3,7);
	Series s2 =new Series("Emily in Paris", "Action", true, 1,7);
	
	try {
		s.subscribe("monthly",u1);
		m1.play(u1);
		m2.play(u3);
		s1.play(u2);
		m2.play(u4);
	}
	catch(AgeRestrictionException e)
	{
		e.printStackTrace();
		//System.out.println(e.getMessage());
	}
	catch(SubscriptionException se) {
		se.printStackTrace();
		//System.out.println(se.getMessage());
	}
}
}
