package iuh.fit.se.libs;

public class CriketCoach implements Coach {
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public CriketCoach() {}
	@Override
	public String getDailyWorkout() {
		return "CriketCoach: practice fast bowling for 15 minutes ";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
}
