/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad
 */
class U {
    private String DonorID,Fname,Mname,Lname,BloodGroup,City,Address,ContactNumber,LastDonationDate,BirthDate,Gender,Smoker,Tattooed;
    
    
    
    public U(String DonorID,String Fname,String Mname,String Lname,String BloodGroup,String City,String Address,String ContactNumber,String LastDonationDate,String BirthDate,String Gender,String Smoker,String Tattooed){
        this.DonorID=DonorID;
           this.Fname=Fname;
              this.Mname=Mname;
                 this.Lname=Lname;
                    this.BloodGroup=BloodGroup;
                       this.City=City;
                          this.Address=Address;
                             this.ContactNumber=ContactNumber;
                                this.LastDonationDate=LastDonationDate;
                                   this.BirthDate=BirthDate;
                                      this.Gender=Gender;
                                         this.Smoker=Smoker;
                                            this.Tattooed=Tattooed;
        
    }
    public String getId(){
        return DonorID;
    }
    public String getFname(){
        return Fname;
    }
    public String getMname(){
        return Mname;
    }
    public String getLname(){
        return Lname;
    }
    public String getBloodGroup(){
        return BloodGroup;
    }
    public String getCity(){
        return City;
    }
    public String getAddress(){
        return Address;
    }
    public String getContactNumber(){
        return ContactNumber;
    }
    public String getLastDonationDate(){
        return LastDonationDate;
    }
    public String getBirthDate(){
        return BirthDate;
    }
    public String getGender(){
        return Gender;
    }
    public String getSmoker(){
        return Smoker;
    }
    public String getTattooed(){
        return Tattooed;
    }
}
