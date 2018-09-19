/*9.2 (The Stock class) Following the example of
the Circle class in Section 9.2,
design a class named Stock that contains:

 ¡á A string data field named symbol for the stock¡¯s symbol.

 ¡á A string data field named name for the stock¡¯s name.

¡á A double data field named previousClosingPrice
that stores the stock price for the previous day.

 ¡á A double data field named currentPrice
 that stores the stock price for the current time.

 ¡á A constructor that creates a stock with
 the specified symbol and name.

 ¡á A method named getChangePercent()
 that returns the percentage changed
 from previousClosingPrice to currentPrice.

 Draw the UML diagram for the class and then implement
 the class. Write  test program that creates a Stock
 object with the stock symbol ORCL, the name
 Oracle Corporation, and the previous
 closing price of 34.5. Set a new current price
 to 34.35 and display the price-change percentage.
 */

 public class Assignment9_2{
	 public static void main(String [] args){
		 StockMarket Stock1 = new StockMarket("Oracle_Corporation","ORCL", 34.5, 34.35);
		 System.out.println("The Stock name, " + StockMarket.StockName + ", aka. " + StockMarket.StockSymbol
		 + " previous closing price was $" +  StockMarket.previousClosingPrice
		 + " \nand the current price is $" + StockMarket.currentPrice +
		 ". \nThe price-change percentage is " + StockMarket.getChangePercent() + "%");
	 }
 }
class StockMarket{
	 static String StockName;
	 static String StockSymbol;
	 static double previousClosingPrice;
	 static double currentPrice;

	 StockMarket(String name, String symbol, double pricebefore, double priceafter){
		 this.StockName = name;
		 this.StockSymbol = symbol;
		 this.previousClosingPrice = pricebefore;
		 this.currentPrice = priceafter;
	 }

	public static double getChangePercent(){
		 return (previousClosingPrice - currentPrice)/ previousClosingPrice * 100;
	 }
 }



