package StudentAccounts;
import BusinessLogic.StudentAccounts;
import org.junit.Assert;
import org.junit.Test;

public class StudentAccountTest {
    StudentAccounts obj;
    @Test
    public void PositiveTest(){
        obj= new StudentAccounts();
        obj.Studentloggedin();
        obj.search("asad@gmail.com");
        Assert.assertTrue("mail present",true);
        obj.RegisterStudent("ayesha","1234","Ayesha@gmail.com","12345");
        Assert.assertTrue(true);
        obj.LoginIn("email","1234");
        Assert.assertTrue(true);
        obj.Studentloggedin();
    }


     @Test
     public void NegertiveTest(){
         obj= new StudentAccounts();
         obj.Studentloggedin();
         obj.search("asad@gmail.com");
         Assert.assertFalse("null",false);
         obj.RegisterStudent("-","1234","-","12345");
         Assert.assertFalse(false);
         obj.LoginIn("null","1234");
         Assert.assertFalse(false);
         obj.Studentloggedin();

    }
}
