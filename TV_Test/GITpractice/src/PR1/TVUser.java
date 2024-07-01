package PR1;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception{
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop11/interface01/product.properties"));
		String tvName = prop.getProperty("tv");
		Class tvClass = Class.forName(tvName);
		
		TV tv = (TV) tvClass.getConstructor().newInstance();
		
		String speakerName = prop.getProperty("speaker");
		
		Class speakerClass = Class.forName(speakerName);
		Speaker sp = (Speaker) speakerClass.getConstructor().newInstance();
		tv.setSpeaker(sp);
		
//		TV tv = new LgTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
