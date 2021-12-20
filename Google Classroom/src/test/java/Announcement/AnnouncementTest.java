package Announcement;
import BusinessLogic.Announcement;
import org.junit.Test;
import org.junit.Assert;

public class AnnouncementTest {
    Announcement obj;

    @Test
    public void testpositve(){
        obj= new Announcement();

      obj.UploadContent("maryam","hi everyone");
      Assert.assertTrue("hi everyone",true);
      obj.Display();

    }
    @Test
    public void testnegetive(){
        obj= new Announcement();
        obj.UploadContent("bilal","Bye");
        Assert.assertFalse("Hi everyone",false);
        obj.Display();

    }
}
