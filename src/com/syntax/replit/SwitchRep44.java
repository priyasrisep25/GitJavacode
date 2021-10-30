package com.syntax.replit;
import java.util .Scanner;
public class SwitchRep44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String carName = scan .next();
		String carOrigin= null;

		switch(carName){

		  case "BMW":
		  carOrigin="german car";
		  break;

		  case "Toyota":
		  carOrigin="japanese car";
		  break;

		case "Maserati":
		carOrigin= "italian car";
		break;

		default:
		carOrigin="unknown";
		}
		if(!carOrigin.equals("unknown")){

		  System.out.println("Your favorite car is " + carOrigin );
		}else{
		  System.out.println("unknown" );
		}


	}

}
