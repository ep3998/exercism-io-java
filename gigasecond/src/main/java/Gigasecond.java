import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
	private LocalDateTime birthDate;
	private long offset = 1000000000;
	
    Gigasecond(LocalDate birthDate) {
    	this.birthDate = birthDate.atTime(0,0);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDate = birthDateTime;
    }

    LocalDateTime getDate() {
    	return this.birthDate.plusSeconds(offset);
    }
}
