
public class Main1 {

    public static void main(String[] args) {
        JavaDev jd = new JavaDev();
        accessMethod(jd);

        PythonDev pd = new PythonDev();
        accessMethod(pd);
    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}
