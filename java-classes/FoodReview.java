import java.time.LocalDate;

/**
  this class allows a user to add or modify reviews for a restaurant.
*/
public class FoodReview
{
    // declare private instance vars
    private Restaurant restaurant;
    private double reviewScore;
    private String reviewTitle;
    private String reviewBody;
    private String reviewerName;
    private User user;
    private LocalDate timestamp;
    private int numHeartLikes; // traditional Like button
    private int numUsefulLikes; // similar to Like button, but says "Useful"
    private int numFunnyLikes; // similar to Like button, but says "Funny"
    private int numCoolLikes; // similar to Like button, but says "Cool"
    private int numDislikes; // similar to Like button, but says "Dislike"
    private String reviewerIcon;
    
    /**
      describe this constructor
      @param _restaurant for the specific restaurant the user desires
      @param _reviewScore sets the review score of this review
      @param _reviewTitle for the title the user associates with the restaurant
      @param _reviewBody for the body the user associates with the restaurant 
      @param _user for the user thats rating the restaurant
    */
    public FoodReview(Restaurant _restaurant, double _reviewScore, String _reviewTitle, String _reviewBody, User _user)
    {
      restaurant = _restaurant;
      reviewScore = _reviewScore;
      reviewTitle = _reviewTitle;
      reviewBody = _reviewBody;
      user = _user;
        
        // set instance var values using parameters
        // TO DO
    }
    
     /**
      int getNumHeartLikes()
      accessor method for numHeartLikes
      @return get the number of hearts/likes
    */
	
	public int getNumHeartLikes() {
		return numHeartLikes;
	}
	
	 /**
      void setNumHeartLikes()
      mutator method for numHeartLikes
    */
	
	public int setNumHeartLikes() {
		numHeartLikes++;
		
	}
	   
	
	


    // accessors and mutators go here
    /**
      double getReviewScore()
      accessor method for reviewScore
      @return get the review score of this review
    */
    public double getReviewScore(){
      return reviewScore;
    }
    /**
      void setReviewScore(double _reviewScore)
      mutator method for reviewScore
		  @param _reviewScore sets the review score of this review
    */
    public void setReviewScore(double _reviewScore){
      reviewScore = _reviewScore;
    }

    
    /**
    @return returns the restaurant of a specific food review
    */
    public Restaurant getRestaurant(){
      return restaurant;
    }
    /**
    @param _restaurant  for the specific restaurant the user desires
    */
    public void setRestaurant(String _retaurant){
      restaurant = _resaurant;
    }
	
    /**
    String getReviewerIcon()
    accessor method for reviewerIcon
    @return get the reviewer's icon
    */
     public String getReviewerIcon(){
     return reviewerIcon;
     }
	
     /**
     void setReviewerIcon(String _reviewerIcon)
     mutator method for reviewerIcon
     @param _reviewerIcon sets  the icon for reviewer
     */
     void setReviewerIcon(String _reviewerIcon){
     reviewerIcon = _reviewerIcon;
     }
     
     
         /**
      * String getReviewTitle()
      * accessor method for reviewTitle
      * @return get the review title of this review
    */
    public String getReviewTitle(){
      return reviewTitle;
    }
    
    
    /**
      * void setReviewTitle(String _reviewTitle)
      * mutator method for reviewTitle
      * @param _reviewTitle sets the review title of this review
    */
    public void setReviewTitle(String _reviewTitle){
      reviewTitle = _reviewTitle;
    }
  
    
  
  

}
