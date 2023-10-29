public class TeacherController<Teacher> {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public void createTeacher(Teacher teacher){
        teacherService.createTeacher(teacher);
        teacherView.displayTeachers();
    }
    public void updateTeacher(Teacher teacher){
        teacherService.updateTeacher(teacher);
        teacherView.displayTeachers();
    }
    // еще методы для работы с учителями
}
