package week3day1;

public class Automation extends MultipleLanguage implements Language {

	public void Selenium() {
		System.out.println("Selenium automation code");
		
	}

	public void java() {
		System.out.println("Java automation code");
	}
	@Override
   public void python() {
        System.out.println("Python automation code.");
    }

    @Override
   public void ruby() {
        System.out.println("Ruby automation code.");
    }
	
public static void main(String[] args) {
	Automation automation = new Automation();
	automation.java();
	automation.Selenium();
	automation.python();
	automation.ruby();
	
}
			
		}
	

	
	


