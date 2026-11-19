
class PrintNum extends Thread {

    @Override
    public void run() {

        System.out.println("Printing Activity Started");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing Activity Completed");

    }
}
