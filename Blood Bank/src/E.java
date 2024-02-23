/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad
 */
class E {
    private String Fname,Lname,usern,pasword,email,eid,job;
    private int WH,paidPH,salry;
    
    
    
    public E(String Fname,String Lname,String usern,String pasword,String email,String eid,String job,int WH,int paidPH,int salry){
        
           this.Fname=Fname;
              this.Lname=Lname;
                 this.Lname=Lname;
                    this.usern=usern;
                       this.pasword=pasword;
                          this.email=email;
                             this.eid=eid;
                                this.job=job;
                                   this.WH=WH;
                                      this.paidPH=paidPH;
                                         this.salry=salry;
                                           
        
    }
   
    public String getFname(){
        return Fname;
    }
    public String getLname(){
        return Lname;
    }
    public String getusern(){
        return usern;
    }
    public String getpasword(){
        return pasword;
    }
    public String getemail(){
        return email;
    }
    public String geteid(){
        return eid;
    }
    public String getjob(){
        return job;
    }
    public int getWH(){
        return WH;
    }
    public int getpaidPH(){
        return paidPH;
    }
    public int getsalry(){
        return salry;
    }
   
}
