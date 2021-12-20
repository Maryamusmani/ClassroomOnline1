package TeacherAccounts;
import BusinessLogic.TeacherAccounts;
import org.junit.Test;
import org.junit.Assert;
public class TeacherAccountTest {
    TeacherAccounts obj;
    @Test
    public void PositiveTest(){
        obj= new TeacherAccounts();
        obj.Teacherloggedin();
        obj.search("maryam@gmail.com");
        Assert.assertTrue("Mail added",true);
        obj.RegisterTeacher("ayesha","1234","Ayesha@gmail.com","12345");
        Assert.assertTrue(true);
        obj.LoginIn("email","1234");
        Assert.assertTrue(true);
        obj.GetloggedInTeacher();




    }
    @Test
    public void NegetiveTest(){
        obj= new TeacherAccounts();

        obj.Teacherloggedin();
        obj.search("-");
        Assert.assertFalse("NULL",false);
        obj.RegisterTeacher("-","-","-","-");
        Assert.assertFalse(false);
        obj.LoginIn("email","-");
        Assert.assertFalse(false);
        obj.GetloggedInTeacher();

    }

}
