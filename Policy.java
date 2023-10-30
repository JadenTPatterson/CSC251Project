public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private String FirstName;
   private String LastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   /**
   No-arg constructor that explicitly initializes all fields
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      FirstName = "";
      LastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   @param fName The Policyhodler's first name
   @param lName The Policyholder's last name
   @param a The Policyholder's age
   @param sStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policytholder's weight
   */
   public Policy(String pNumber, String pName, String fName, String lName,int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      FirstName = fName;
      LastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
  
   //Not included in the instructions but can be added...
   /*Displays information about the Policy
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status (Y/N): " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
      System.out.printf("Policy Price: $%.2f\n", getPrice());
   }
   */
}