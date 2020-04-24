import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class NewClassesExamples {

	public static void main(String[] a) {
		// instant
		System.out.println();
		System.out.println(Instant.EPOCH);
		System.out.println(Instant.MIN);
		System.out.println(Instant.MAX);
		System.out.println(Instant.now());
		System.out.println(Instant.now(Clock.tickSeconds(ZoneId.systemDefault())));

		// Duration
		System.out.println();
		System.out.println(Duration.between(Instant.MIN, Instant.now()).toDays());
		System.out.println(Duration.between(Instant.MIN, Instant.now()).toHours());
		System.out.println(Duration.between(Instant.MIN, Instant.now()).toMinutes());
		System.out.println(Duration.between(Instant.MIN, Instant.now()).toSeconds());

		// LocalDate
		System.out.println();
		System.out.println(LocalDate.of(1990, Month.DECEMBER, 14));
		System.out.println(LocalDate.of(1990, Month.DECEMBER, 14).getYear());
	
		LocalDate dateOfBirth = LocalDate.of(1990, Month.DECEMBER, 14);

		Period p = dateOfBirth.until(LocalDate.now());
		System.out.println("My Age in years : " + p.getYears() + " month : " + p.getMonths() + " days : " + p.getDays());

		// LocalTime
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.getHour()); //current hour of today
		System.out.println(lt.plusHours(4));
		System.out.println(LocalTime.of(11, 20));
		
		// migration from old date object to new 
		
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toInstant());
		
	}
}
