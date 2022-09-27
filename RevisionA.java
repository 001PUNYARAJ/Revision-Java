
public class RevisionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   //1.String
	 String country = "Nepal";
	 System.out.println(country);
	 
   //2.Object--Property and Method
	 String Asia= country.toUpperCase();    //Property
	 System.out.println(Asia);
	 
	 String Asia1= country.toLowerCase();
	 System.out.println(Asia1);
	 
	 int A= country.toUpperCase().toLowerCase().length();
	  System.out.println(A);
	  
	//3. Arthmatic Relation
	  int x= 4;
	  int y= 12;
	  System.out.println(x+y);
	  System.out.println(x-y);
	  System.out.println(x*y);	 
	  System.out.println(x/y);
	  System.out.println(x%y);
	
	//4.Relational or Comparison Operator  ( print= Ture or False Boolean)
	  int p= 9;
	  int q= 3;
	  System.out.println(p>q);  //ture
	  System.out.println(p<q);  //false
	  System.out.println(p>=q); 
	  System.out.println(p<=q);
	  System.out.println(p==q);
	  System.out.println(p!=q);
	 
	//5.Logical Operator    ( And &&, ||, !)
	  System.out.println(2==2 && 7>5 );
	  System.out.println(2>0  && 7<5 );
	  System.out.println(2>=4 && 7==7 );
	  System.out.println(9!=9 && 7>=8 );
	  
	  System.out.println(2==2 || 7>5 );
	  System.out.println(2>0  || 7<5 );
	  System.out.println(2>=4 || 7==7 );
	  System.out.println(9!=9 || 7>=8 );
	  
	  System.out.println(!(5==5));  //False
	  System.out.println(!(5<2));  //True
	  
	 //6. Conditional Statement  (if & else conditional)
	 	//a).if conditional
	 
	 	//Numberof Ticket >0 && Number of Ticket <= 5 ---> 5% discount
	 	//Number of Ticket >5 && Number of Ticket <=10 ---> 10% discount
	 	//Number of Ticket >10   -------------------------> 25% discount
	 
	 int NumberOfTicket=11;
	 	if(NumberOfTicket>0 && NumberOfTicket<=5) {
	 		System.out.println("5% discount");
	 	}
	 	if(NumberOfTicket>5 && NumberOfTicket<=10) {
	 		System.out.println("10% discount");
	 	}
	 	if(NumberOfTicket>10) {
	 		System.out.println("25% discount");
	 	}
	 
	 	//b). else
	 	if(NumberOfTicket>0 && NumberOfTicket<=5) {
	 		System.out.println("5% discount");
	 	}
	 	else if(NumberOfTicket>5 && NumberOfTicket<=10) {
			System.out.println("10% discount");
		}
	 	else if(NumberOfTicket>10) {
			System.out.println("25%discount");
		}
	 	//b).if conditional
	 	
	 int Marks =86;   //  90% above--->Grade A , 85% above--->Grade B
	 				  //  70% above--->Grade C , 60% below--->Fail
	 				    
	 	 			  
	 	if(Marks >= 90) {
	 		System.out.println("Grade A");
	 	}
	 	if(Marks >= 85) {
	 		System.out.println("Grade B");
	 	}
	 	if(Marks >= 70) {
	 		System.out.println("Grade c");
	 	}
	 	if(Marks <= 60) {
	 		System.out.println("Fail");
	 	}
	 	//else conditional
	 	if(Marks >= 90) {
	 		System.out.println("Grade A");
	 	}
	else if(Marks>=85) {
			System.out.println("Grade B");
		}
	else if(Marks>=70) {
			System.out.println("Grade c");
		}
	else if(Marks<=60) {
			System.out.println("Fali");
		}
	 
	
	 //7. switch case
	 	//a).swith case only
	 	
	 String city ="Dang";
	 	switch (city) {
	 	case"Kathamandu":
	 		System.out.println("Bagmati");
	 	case "Pokhara":
	 		System.out.println("Kaski");
	 	case "Dang":
	 		System.out.println("Surkhet");
	 	default:
	 		System.out.println("Incorrect City Name");
	 	}
	
	 	//b).swith case with break
	 	
	 	String Laptop = "Slim 9";
	 	switch (Laptop) {
	 	case "Inspiron":
	 		System.out.println("Dell");
	 		break;
	 	case "Slim 9":
	 		System.out.println("Lenevo");
	 		break;
	 	case "MacBook":
	 		System.out.println("Apple");
	 		break;
	 	default:
	 		System.out.println("Incortect Laptop Name");	 		
	 	}
	
	
	//8. Loop  --(a.For Loop, b. While Loop]		 	
	 	
	 	//a) For Loop -->(initialization;conditionalCheck;increment/decrement)
	       //for(initialization;conditionalCheck;increment/decrement){}
	 	
	 	 //i) print from 0-5
	 			for(int z=0;z<6;z++){  //0,1
	 			System.out.println(z); 	//0,1
	 			}
	 	//ii). print from 0-5 with Break
	 			for (int D=0; D<6; D++){
	 			System.out.println(D); 
	 				if(D==3){
	 				break;
	 				}
	 			}
	  
	 	///iii).print from 0-5 with continue
	 			for (int S=0; S<=5; S++){
		 				if(S==2){
		 				continue;
		 				}
		 			System.out.print(S);
		 			}	
	  
	 	//b) While Loop -->(initialization;while Condition;increment/decrement)	
	 			
	 			//i) print from 5-1
	 			int Y=6;
	 			while(Y>=1) {
	 			System.out.println(Y);
	 			Y--;
	 			}
	
	 		 //ii) print from 5-1 with break
	 				
	 			int W=6;
	 			while(W>=1){
	 			System.out.println(W);
	 			if(W==4) {
	 				break;
	 			}
	 			W--;
	 			}
	 		
	 		//iii)print from 5-1 with continue
	 			int M= 5;
	 			while(M>=1) {
	 				if(M==3) {
	 					M--;
	 					continue;
	 				}
	 				System.out.print(M);
	 				M--;
	 			}
	 			
	 			
	}
	}


