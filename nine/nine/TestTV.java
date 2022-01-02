package nine;

public class TestTV {
	public static void main(String[] args) {
		//创建两个TV对象
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV tv2=new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is" +tv1.channel+" and volume leve1 is " +tv1.volumeLevel);
		System.out.println("tv2's channe1 is " +tv2.channel+" and volume leve1 is " +tv2.volumeLevel);

	}
}
