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
  

    
    /**
      describe this constructor
      @param _restaurant for the specific restaurant the user desires
      @param _reviewScore for the review score the user associates with the restaurant
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

    public Restaurant getRestaurant(){
      return restaurant;
    }
    
    public void setRestaurant(String _retaurant){
      restaurant = resaurant;
    }
  
    public double getReviewScore(){
      return reviewScore;
    }
    
    public void setReviewScore(double _reviewScore){
      reviewScore = _reviewScore;
    }
  
    public String getReviewTitle(){
      return reviewTitle;
    }
  
    public void setReviewTitle(String _reviewTitle){
      reviewTitle = _reviewTitle;
    }
  
    public String getReviewBody(){
      return reviewBody;
    }
  
    public void setReviewBody(String _reviewBody){
      reviewBody = _reviewBody;
    }
  
    public User getUser(){
      return user;
    }
  
    public void setUser(User _user){
      user = _user;
    }

  
  
  
  
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
