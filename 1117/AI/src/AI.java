import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;
public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}
class MainCanvas extends Canvas
{
	//�����������﷨��ʽ����������  ��������
	Image img1,img2,img3,img4,img5,currentImg;
	public MainCanvas(){
		try
		{
			//��������ֵ���﷨����������=value
			img1=Image.createImage("/sayo10.png");
			img2=Image.createImage("/sayo12.png");//����ת
			img3=Image.createImage("/sayo16.png");
			img4=Image.createImage("/sayo14.png");
			img5=Image.createImage("/sayo11.png");
			currentImg=img1;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void paint(Graphics g){
		g.setColor(0,0,0);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg,120,120,0);
	}
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
		//action��ֵ��UP,DOWN,LEFT,RIGHT
		if(action==LEFT){
			//ʵ��ת����룬���µı�����ֵ����
			currentImg=img2;
			System.out.println("����ת");
			repaint();
		}
        if(action==RIGHT){
			currentImg=img3;
			System.out.println("����ת");
			repaint();
		}
		 if(action==UP){
			currentImg=img4;
			System.out.println("����ת");
			repaint();
		}
         if(action==DOWN){
			currentImg=img5;
			System.out.println("����ת");
			repaint();
		}
	}
	}