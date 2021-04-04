package wsVideoStore;

public abstract class Movie
{
	public static final String REGULAR = "REGULAR";
	public static final String NEW_RELEASE = "NEW_RELEASE";
    public static final String CHILDRENS = "CHILDRENS";
    
    private String title;
    private String pricecode;

	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return title;
    }

    public String getPriceCode() {
        return pricecode;
        
    }

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);
}