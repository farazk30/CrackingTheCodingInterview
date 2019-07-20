
public class TicketBO {

	
	public TicketBO(int sh,String seat,double pr,double se,double kri,double tb)
	{	
		this.show=sh;
		this.seats=seat;
		this.price=pr;
		this.serviceTax=se;
		this.krishiKalyanCess=kri;
		this.swachhBharatCess=kri;
		this.totalBill=tb;
		
	}
	
	public int getShow() {
		return show;
	}
	public void setShow(int show) {
		this.show = show;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getServiceTax() {
		return serviceTax;
	}
	public void setServiceTax(double serviceTax) {
		this.serviceTax = serviceTax;
	}
	public double getKrishiKalyanCess() {
		return krishiKalyanCess;
	}
	public void setKrishiKalyanCess(double krishiKalyanCess) {
		this.krishiKalyanCess = krishiKalyanCess;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	private double price,serviceTax,krishiKalyanCess,swachhBharatCess,totalBill;
	public double getSwachhBharatCess() {
		return swachhBharatCess;
	}

	public void setSwachhBharatCess(double swachhBharatCess) {
		this.swachhBharatCess = swachhBharatCess;
	}
	private String seats;
	private int show;
	
}
