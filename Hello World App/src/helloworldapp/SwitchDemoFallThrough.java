package helloworldapp;

public class SwitchDemoFallThrough {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();
		int month = 5;
		int year = 2015;
		int numDays = 0;
		
		switch (month) {
		case 1: futureMonths.add("January");
		case 2: futureMonths.add("February");
		case 3: futureMonths.add("March");
		case 4: futureMonths.add("April");
		case 5: futureMonths.add("May");
		case 6: futureMonths.add("June");
		case 7: futureMonths.add("July");
		case 8: futureMonths.add("August");
		case 9: futureMonths.add("September");
		case 10: futureMonths.add("October");
		case 11: futureMonths.add("November");
		case 12: futureMonths.add("December");
			
			break;

		default:
			break;
		}

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
			if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
		if (futureMonths.isEmpty()) {
			System.out.println("future months not initializes");
		} else {
			for (String monthName : futureMonths) {
				System.out.println(monthName);
			}
			System.out.println("Month " + month + " has " + numDays + " days");
		}
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
	}

}
