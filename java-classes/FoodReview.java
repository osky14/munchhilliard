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
    private int numOfHeartLikes; // traditional Like button
    private int numUsefulLikes; // similar to Like button, but says "Useful"
    private int numFunnyLikes; // similar to Like button, but says "Funny"
    private int numCoolLikes; // similar to Like button, but says "Cool"
    private int numDislikes; // similar to Like button, but says "Dislike"
  

    
    /**
      describe this constructor
      @param
      @param
      @param
      @param
      @param
    */
    public FoodReview(Restaurant _restaurant, double _reviewScore, String _reviewTitle, String _reviewBody, User _user)
    {
        // set instance var values using parameters
        // TO DO
    }

    // accessors and mutators here

    /**
      returns the number of useful likes on the review
      
    */
    public int getUsefulLikes()
    {
      
      return 0; // TO DO
    }
  
    /**
      adds one useful like for the review
    */ 
    public void addUsefulLike(){
      // TO DO
    }
    
    /** 
      sets the number of heart likes on the review
      @Param int newnumOfHeartLikes - first numerical value for the numOfHeartLikes
    */
    public void setnumOfHeartLikes(int newnumOfHeartLikes){  
    this.numOfHeartLikes = newnumOfHeartLikes;
    } 
    /** 
      returns the number of heart likes on the review 
      @return numOfHeartLikes - Total number of HeartLikes
    */
    public int getHeartLikes(){
      return numOfHeartLikes;
    }
  
  
  
    /**
      adds one heart like for the review
    */ 
    public void addHeartLike(int addNumOfHearts){
       numOfHeartLikes= numOfHeartLikes+addNumOfHearts;
    } 
  
    /**
      returns the number of funny likes
      
    */  
    public int getFunnyLikes()
    {
      
      return 0; // TO DO
    }
  
    /**
      
    */ 
    public void addFunnyLike(){
      // TO DO
    } 

    /**
      retuns the number of cool likes
      
    */
    public int getCoolLikes()
    {
      return 0; // TO DO
    }
  
    /**
      
    */ 
    public void addCoolLike(){
      // TO DO
    } 

    /**
      retuns the number of dislikes
      
    */
   /**
   * returns number of Dislikes 
   *
   * @return number of dislikes
   *
   *
   */
   public int getDislikes(){
    return numDislikes; 
  }

    /**
    *
    *adds one to number of dislikes
    *
    *
    *
    */
    public void addDislike(){
      numDislikes += 1;
  }

    
    /**
    returns the number of Sad Likes
    
    */
    public int getNumSadLikes(){
      return 0; // TO DO
    }
  
    /**
      
    */ 
    public void addSadLike(){
      // TO DO
    } 
  
  
  
    /**
      returns the date that the review was posted
      
    */
    public LocalDate getTimestamp()
    {
      return 0; // TO DO
    }

  /**
   returns the review score that was given to the restaurant.
   

  */
  public double getReviewScore(){
    return 0; // TO DO
  }
  
  /**
   returns the Title for the review written.
   
  
  */
  public String getReviewTitle(){
    return ""; // TO DO
  }
  

  /**
  returns the body of the review.
  */
  public String getReviewBody(){
    return ""; // TO DO
  }

  /**
   returns the title of the review.
   

  */
  public String getReviewTitle(){
    return ""; // TO DO
  }

  /**
    returns the body of the review.
    
   */
  public String getReviewBody(){
    return ""; // TO DO
  }

   /**
    returns the name of the reviewer.
    

   */
   public String getName(){
     return ""; // TO DO
   }
  
    /**
      returns the user who created the review
      
    */ 
    public User getUser(){
      return null; // TO DO
    } 
}
