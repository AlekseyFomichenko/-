public class Main {
    public static void main(String[] args) {
        
        StudentController controller = new StudentController();
        controller.create("aaa", "aaa", "aaa");
        controller.create("asd", "dsa", "rty");
        controller.create("axc", "ewq", "fgh");
        controller.create("aqw", "weq", "vbn");

        controller.sendOnConsole();


        TeacherController teacherController = new TeacherController();
        teacherController.create("uigk", "zsrhj", ";j.koj");
        teacherController.create("sfhb", "dxfb", ";oji,");
        teacherController.create("yukhjm", "luik,h", "esgrhcg");
        teacherController.create("qwesfd", "vbnm", "pkoj.k");

        teacherController.sendOnConsole();
    }
}
