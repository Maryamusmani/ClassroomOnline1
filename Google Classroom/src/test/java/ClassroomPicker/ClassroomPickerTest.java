package ClassroomPicker;
import BusinessLogic.ClassroomPicker;
import org.junit.Test;
import org.junit.Assert;

public class ClassroomPickerTest {
    ClassroomPicker obj;
    @Test
    public void PositiveTest(){
    obj= new ClassroomPicker();
    obj.RemoveStudent("given_mail","1234");
    Assert.assertTrue("match",true);
    obj.Displayattendance("P","mail");
    Assert.assertTrue("Matched",true);
    obj.DisplayEnrolledStudents("name","1234");

    }
    @Test
    public void NegetiveTest(){
        obj= new ClassroomPicker();
        obj.RemoveStudent("given_mail","1234");
        Assert.assertFalse("match",false);
        obj.Displayattendance("P","mail");
        Assert.assertFalse("Matched",false);
        obj.DisplayEnrolledStudents("name","1234");

    }
}

