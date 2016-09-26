package ex;
import java.util.Scanner;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 104021074 楊永聖
 */

public class ex02_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("請輸入x座標:");
		int x= scn.nextInt();
		System.out.print("請輸入y座標:");
		int y= scn.nextInt();
		float z=(float) Math.sqrt((x*x)+(y*y));
		//System.out.print(z);
		if (z>100){
			System.out.print("此點的座標超出圓的範圍");
		}else{
			System.out.print("此點的座標在圓內");
		}

	}

}
