class Threade extends Thread implements Runnable {
    @Override
    public void run() {
        System.out.println("Đang chạy trong phương thức run...");
    }

    public static void main(String[] args) {
        Threade threade = new Threade();
        Thread thread = new Thread();
        thread.start();  // Bắt đầu luồng mới
    }

}

