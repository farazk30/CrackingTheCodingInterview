import java.util.ArrayList;
import java.util.Scanner;

public class TicketBookingWindow {
	ArrayList<TicketBO> dataList=new ArrayList<TicketBO>();
	static int[][] show1= {{1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,0,0,0},{0,1,1,1,1,1,1,0,0}};
	static int[][] show2= {{1,1,1,1,1,1,1,0,0},{0,1,1,1,1,1,0,0,0},{1,1,1,1,1,1,1,0,0}};
	static int[][] show3= {{1,1,1,1,1,0,0,0,0},{1,1,1,1,1,1,1,1,0},{1,1,1,1,1,1,1,1,1}};
	 
	public static void main(String[] args)
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		
		TicketBookingWindow ticketBookingWindowObj =new TicketBookingWindow();
		ticketBookingWindowObj.displayDetails("Show 1");
		ticketBookingWindowObj.displayDetails("Show 2");
		ticketBookingWindowObj.displayDetails("Show 3");
		do {					
			
			System.out.println("\nenter 1 for ticket booking and any integer for revenue.");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1:ticketBookingWindowObj.BookTicket();break;
			default:break;
			}
		}while(choice==1);
		ticketBookingWindowObj.DisplayRevenue();
	}
	public void DisplayRevenue()
	{
		double subtotal=0,servicetx=0,kritx=0,swtchtx=0;
		for(TicketBO obj:dataList)
		{
			subtotal=subtotal+obj.getPrice();
			servicetx=servicetx+obj.getServiceTax();
			kritx=kritx+obj.getKrishiKalyanCess();
			swtchtx=swtchtx+obj.getSwachhBharatCess();
		}
		System.out.println("Total Sales:");
		System.out.println("Revenue: Rs. "+subtotal);
		System.out.println("Service Tax: Rs. "+servicetx);
		System.out.println("Swachh Bharat Cess: Rs. "+kritx);
		System.out.println("Krishi Kalyan Cess: Rs. "+swtchtx);
		
	}
	
	public void BookTicket()
	{
		double price=0,serviceTax=0,totalBill=0,krishiKalyanCess=0;
		String seats;
		int show;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Show no:");
		show=sc.nextInt();
		System.out.println("Enter Seats:");
		Scanner sc1 = new Scanner(System.in);
		seats=sc1.nextLine();
		String[] seatSelect=seats.split(",");
		for(String s:seatSelect)
		{
			
			if(s.length()!=2)
			{
				System.out.println("you enter a wrong seat number.");
				return;
			}
			int i,j;
			char a=s.charAt(0);
			switch(a)
			{
			case 'A':
				i=0;
				
				if(Character.getNumericValue(s.charAt(1))<9)
					j=Character.getNumericValue(s.charAt(1))-1;
				else
				{
					System.out.println("you enter a wrong seat number.");
					return;
				}
				if(show==1)
				{
					if(show1[i][j]==1)
					{
						price=price+320;
						serviceTax=serviceTax+(0.14*320);
						krishiKalyanCess=krishiKalyanCess+(0.5*3.2);
						show1[i][j]=0;
					}
					else
					{
						System.out.println(s+" Not available, Please select different seats");
						return;
					}
				}
				else if(show==2)
				{
					if(show2[i][j]==1)
					{
						price=price+320;
						serviceTax=serviceTax+(0.14*320);
						krishiKalyanCess=krishiKalyanCess+(0.5*3.2);
						show2[i][j]=0;
					}
					else
					{
						System.out.println(s+" Not available, Please select different seats");
						return;
					}
				}
				else if(show==3)
				{
					if(show3[i][j]==1)
					{
						price=price+320;
						serviceTax=serviceTax+(0.14*320);
						krishiKalyanCess=krishiKalyanCess+(0.5*3.2);
						show3[i][j]=0;
					}
					else
					{
						System.out.println(s+" Not available, Please select different seats");
						return;
					}
				}
				break;
			case 'B':
				i=1;
				if(Character.getNumericValue(s.charAt(1))<9)
					j=Character.getNumericValue(s.charAt(1))-1;
				else
				{
					System.out.println("you enter a wrong seat number.");
					return;
				}
				if(show==1)
				{
					if(show1[i][j]==1)
					{
						price=price+280;
						serviceTax=serviceTax+(0.14*280);
						krishiKalyanCess=krishiKalyanCess+(0.5*2.8);
						show1[i][j]=0;
					}
					else
					{
						System.out.println(s+" Not available, Please select different seats");
						return;
					}
				}
				else if(show==2)
				{
					if(show2[i][j]==1)
					{
						price=price+280;
						serviceTax=serviceTax+(0.14*280);
						krishiKalyanCess=krishiKalyanCess+(0.5*2.8);
						show2[i][j]=0;
					}
					else
					{
						System.out.println(s+" Not available, Please select different seats");
						return;
					}
				}
				else if(show==3)
				{
					if(show3[i][j]==1)
					{
						price=price+280;
						serviceTax=serviceTax+(0.14*280);
						krishiKalyanCess=krishiKalyanCess+(0.5*2.8);
						show3[i][j]=0;
					}
					else
					{
						System.out.println(s+" Not available, Please select different seats");
						return;
					}
				}
				break;
			case 'C':
				i=2;
				if(Character.getNumericValue(s.charAt(1))<9)
					j=Character.getNumericValue(s.charAt(1))-1;
				else
				{
					System.out.println("you enter a wrong seat number.");
					return;
				}
				if(show==1)
				{
					if(show1[i][j]==1)
					{
						price=price+240;
						serviceTax=serviceTax+(0.14*240);
						krishiKalyanCess=krishiKalyanCess+(0.5*2.4);
						show1[i][j]=0;
					}
					else
					{
						System.out.println(s+" Not available, Please select different seats");
						return;
					}
				}
				else if(show==2)
				{
					if(show2[i][j]==1)
					{
						price=price+240;
						serviceTax=serviceTax+(0.14*240);
						krishiKalyanCess=krishiKalyanCess+(0.5*2.4);
						show2[i][j]=0;
					}
					else
					{
						System.out.println(s+" Not available, Please select different seats");
						return;
					}
				}
				else if(show==3)
				{
					if(show3[i][j]==1)
					{
						price=price+240;
						serviceTax=serviceTax+(0.14*240);
						krishiKalyanCess=krishiKalyanCess+(0.5*2.4);
						show3[i][j]=0;
					}
					else
					{
						System.out.println(s+" Not available, Please select different seats");
						return;
					}
				}
				break;
			default:System.out.println("You enter a wrong seat number");break;
			}
			
		}
		totalBill=price+serviceTax+(2*krishiKalyanCess);
		TicketBO ticketBOObj=new TicketBO(show,seats,price,serviceTax,krishiKalyanCess,totalBill);
		dataList.add(ticketBOObj);
		System.out.println("Print: Successfully Booked - Show"+ show);
		System.out.println("SubTotal: Rs. "+price);
		System.out.println("Service Tax @14%: Rs. "+serviceTax);
		System.out.println("Swachh Bharat Cess @0.5%: Rs. "+krishiKalyanCess);
		System.out.println("Krishi Kalyan Cess @0.5%: Rs. "+krishiKalyanCess);
		System.out.println("Total: Rs."+totalBill);
		
		
	}
	
	
	public void displayDetails(String show)
	{
		System.out.println("Seating Arrangement:");
		System.out.println(show +" Running in Audi "+show.charAt(show.length()-1)+":");
		System.out.println("All Seats:\n");
		int[][] showNum = null;
		if(show.equalsIgnoreCase("Show 1"))
		{
			showNum=show1;
		}
		else if(show.equalsIgnoreCase("Show 2"))
		{
			showNum=show2;
		}
		else if(show.equalsIgnoreCase("Show 3"))
		{
			showNum=show3;
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<9;j++)
			{	
				switch(i)
				{
					case 0:
							if(showNum[i][j]==1)
								System.out.print("A"+ (j+1)+" ");
							else
								System.out.print("   ");
							break;
					
					case 1:
						if(showNum[i][j]==1)
							System.out.print("B"+ (j+1)+" ");
						else
							System.out.print("   ");break;
					
					case 2:
						if(showNum[i][j]==1)
							System.out.print("C"+ (j+1)+" ");
						else
							System.out.print("   ");break;
					default:break;
					
				}
				
			}
			System.out.println();
		}
		System.out.println("\n");
	}

}
