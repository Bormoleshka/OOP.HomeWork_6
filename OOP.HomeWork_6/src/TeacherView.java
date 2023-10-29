import java.awt.*;

// SPR-данный класс только отображает список учителей
public class TeacherView<Teacher> {
    private TeacherService teacherService;

    public void displayTeachers(){
        List teachers = teacherService.getTeachers();
        //отображение списка учителей
    }
    // еще методы для отображения списка учителей
}
