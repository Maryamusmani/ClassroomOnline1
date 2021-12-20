package BusinessLogic;

import java.time.LocalDate;
import java.time.LocalTime;

public class Posts
{
    String date = LocalDate.now().toString();
    String time = LocalTime.now().toString();
    String teachername;

    Posts()
    {
        teachername = "";
    }
    public void UploadContent(String teachername,String material)
    {

    }
    public void Display()
    {

    }
}
