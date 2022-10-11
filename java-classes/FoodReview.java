import java.time.LocalDate;

/**
  describe this class
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
      @param _reviewScore sets the review score of this review
      @param
      @param
      @param
      @param
    */
    public FoodReview(Restaurant _restaurant, double _reviewScore, String _reviewTitle, String _reviewBody, User _user)
    {
        // set instance var values using parameters
        // TO DO
        reviewScore = _reviewScore;
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
}
