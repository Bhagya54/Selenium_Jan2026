package captureScreenshot;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		Date d = new Date();
		System.out.println(d);
		String fileName=d.toString().replace(" ","_").replace(":","_")+".png";
		System.out.println(fileName);
	}

}
