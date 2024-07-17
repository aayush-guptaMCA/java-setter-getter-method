import java.util.*;
class student
{
  private int id;
  private String name;
  private String phonenumber;
   // constructor can also be used as a set method
  /* public student(int id,String name)
  {
     this.id=id;
     this.name=name;
  }*/
  public void setname(String name)
  {
     this.name=name;

  }
  public void setid(int id)
  {
     this.id=id;
  }
 public void setphonenumber(String no)
 { 
     int size=no.length();
      if(10>size && size>10)
    {
      System.out.println("Please check your number first ");
    }
   else if(size==10)
  {
     this.phonenumber=no;
  }   
 }
 public String getname()
 {
    return name;
 }
 public int getid()
 {
    return id;
 }
  public String getnumber()
  {
    
    
        return phonenumber;
    
  }


}
class gettersetter
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
      student st=new student();
     System.out.println("Enter your id and name");
       st.setid(sc.nextInt());
       String nm=sc.nextLine(); 
        st.setname(nm);
     System.out.println("Enter your phone number of 10 digit only");
       String phone= sc.nextLine();
     // long num=Long.parseLong(phone);
       st.setphonenumber(phone);
   
    //st.setname("Aayush");
    //st.setid(i);
    System.out.println("id: "+st.getid()+"  name :"+st.getname()+" Phone number:"+ st.getnumber());
  }
}