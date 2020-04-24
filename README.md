# java-8-date-time-api

- JDK 1 introduced java.util.date and java.sql.date
- Calendar class also use in java 
- Date is immutable class in java
- Java 8 introduced new package java.time, it completely replace the Date and Calendar class.

#### Instant
- Instant is a new class in java.time which shows point in timeline 
- Instant 0 is January 1, 1970 at midnight GMT
- Instant.Min -> billion years ago
- Instant.Max -> 31 Dec of the year 1 000,000,000.
- Instant.now() -> current time 
- Instant is also immutable
```
	Instant start = Instant.now();
	Instant end = Instant.now();
```
#### Duration 
- give the duration or time period between two instants
```
Duration timeDiff = Duration.between(start, end);
```
- Methods -> toNanos(), toMillis(), toSeconds(), toMinutes(), toHours(), toDays() etc

#### LocalDate
- LocalDate is just a date with a day precision and not a nanosecond precision. 
- Creation pattern is the same as pattern to create an instant. 

```
LocalDate now = LocalDate.now(); // static method to get current time

LocalDate dateOfBirth = LocalDate.of(1990, Month.December, 14);
```

#### Period
- this class gives you difference between two dates which is time period.
- this is ammount of time between two LocalDate objects
- e.g if you want to count your age
```
LocalDate dateOfBirth = LocalDate.of(1990, Month.December, 14);

Period p = dateOfBirth.until(now);

System.out.println("Age : " + p.getYears());

// also in days using ChronoUnit.DAYS

long days = dateOfBirth.until(now, ChronoUnit.DAYS);
System.out.println("Days : " + days);
```
#### Date Adjuster
- Adjuster for dates which created by Instant or LocalDate
- firstDayOfYear() lastDayOfYear() firstDayOfNaxtMonth() lastDayOfNaxtMonth() etc 
