package iuh.fit.se.libs;

public class TennisCoach implements Coach {
	private FortuneService theFortune;

	public TennisCoach(FortuneService theFortune) {
		super();
		this.theFortune = theFortune;
	}
	public String getDailyWorkout() {
		return "TennisCoach: Run a hard 5k";
		}
	@Override
	public String getDailyFortune() {
		return theFortune.getFortune();
	}
}
