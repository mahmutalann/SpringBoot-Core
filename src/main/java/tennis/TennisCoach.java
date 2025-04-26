package tennis;
import org.springframework.stereotype.Component;
import com.example.springcorelearn.Coach;

@Component
public class TennisCoach implements Coach{
	
	public TennisCoach() {
		System.out.println("Instructor : " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 3K meters";
	}
}
