
class Employee implements Work, Project {

    @Override
    public void doWork() {
        System.out.println("Employee Working");
    }

    @Override
    public void project() {
        System.out.println("Employee working on a project");
    }
}
