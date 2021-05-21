package com;

public class Gradeofstudent {

	public static void main(String[] args) {
		int marks=20;
		int m;
		
		if(marks>60) {
		
			m=1;
		}
		else {
			if(marks>=45  && marks<60) {
				
				m=2;
			}
			else {
				if(marks>=33  && marks<45) {
					
					m=3;
				}
				else {
					
					m=4;
				}
			}
		}
			
		switch(m) {
		case 1 : System.out.println("First Division");
		break;
		case 2 : System.out.println("Second Division");
		break;
		case 3 : System.out.println("Third Division");
		break;
		case 4 : System.out.println("Fail");
		break;
		default : System.out.println("invalid choice");
		}

		}

	}


