package nine;

public class TV {
	int channel = 1;//Default channel is 1
	int volumeLevel=1;//Defualt volume leve is 1
	boolean on = false;// TV is off
	//�������巽��
	public TV() {
		//Ĭ�ϵ�TV����
	}
	public void turnOn() {//��TV
		on = true;
	}
	public void turnOff() {//�ر�TV
		on = false;
	}
	public void setChannel(int newChannel) {//������Ƶ��
		if(on && newChannel>=1&&newChannel<=120)
			channel=newChannel;
	}
	public void setVolume(int newVolumeLevel) {//����������
		if(on&&newVolumeLevel>=1&&newVolumeLevel<=7)
			volumeLevel=newVolumeLevel;
	}
	//����Ƶ��
	public void channelUp() {
		if(on&&channel<120)
			channel++;
	}
	public void channelDown() {
		if(on&&channel>1)
			channel--;
	}
	//��������
	public void volumeUp() {
		if(on&&volumeLevel<7)
			volumeLevel++;
	}
	public void volumeDown() {
		if(on&&volumeLevel>1)
			volumeLevel--;
	}
}
