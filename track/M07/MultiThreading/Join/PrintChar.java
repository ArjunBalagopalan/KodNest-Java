
class PrintChar extends Thread {

    @Override
    public void run() {
        System.out.println("PrintChar Thread Using the File");
        System.out.println("Printing Activity Started");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Printing Activity Completed");
        System.out.println("PrintChar  Thread ended using the File");
    }
}
