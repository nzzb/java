package nine;

public class TV {
	int channel = 1;//Default channel is 1
	int volumeLevel=1;//Defualt volume leve is 1
	boolean on = false;// TV is off
	//公共定义方法
	public TV() {
		//默认的TV对象
	}
	public void turnOn() {//打开TV
		on = true;
	}
	public void turnOff() {//关闭TV
		on = false;
	}
	public void setChannel(int newChannel) {//设置新频道
		if(on && newChannel>=1&&newChannel<=120)
			channel=newChannel;
	}
	public void setVolume(int newVolumeLevel) {//设置新音量
		if(on&&newVolumeLevel>=1&&newVolumeLevel<=7)
			volumeLevel=newVolumeLevel;
	}
	//调节频道
	public void channelUp() {
		if(on&&channel<120)
			channel++;
	}
	public void channelDown() {
		if(on&&channel>1)
			channel--;
	}
	//调节音量
	public void volumeUp() {
		if(on&&volumeLevel<7)
			volumeLevel++;
	}
	public void volumeDown() {
		if(on&&volumeLevel>1)
			volumeLevel--;
	}
}
