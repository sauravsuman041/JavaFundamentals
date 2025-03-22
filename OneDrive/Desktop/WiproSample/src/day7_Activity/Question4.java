package day7_Activity;

//4.Consider the following scenario. Whenever a hen lays an egg its owner sells the egg to a shop. 
//In the last 4 months the owner has gained Rs. 100 by selling eggs in the rate of Rs.2 per egg. 
//Display the following messages 
//
//Hen Laid the Egg   1
//Owner gained Rs 2
//Hen Laid the Egg   2
//Owner gained Rs 4
//
//
//
//. So on.
//Hint: Interthread communication


class EggMarket {
    private int eggsLaid = 0;
    private int earnings = 0;
    private final int PRICE_PER_EGG = 2;
    private final int TOTAL_EGGS = 50;
    private boolean eggAvailable = false; 
    
    public synchronized void processEggs(boolean isHen) {
        for (int i = 1; i <= TOTAL_EGGS; i++) {
            if (isHen) {
                eggsLaid++;
                System.out.println("Hen Laid the Egg " + eggsLaid);
                eggAvailable = true; 
                notify();
                try {
                    wait();
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } 
            else {
                earnings += PRICE_PER_EGG;
                System.out.println("Owner gained Rs " + earnings);
                eggAvailable = false;
                notify();
                while (!eggAvailable) {
                    try {
                        wait();
                    } 
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        notifyAll();
    }
}


class MyThread2 extends Thread {
    private EggMarket market;
    private boolean isHen;

    public MyThread2(EggMarket market, boolean isHen) {
        this.market = market;
        this.isHen = isHen;
    }

    @Override
    public void run() {
        market.processEggs(isHen);
    }
}


public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EggMarket market = new EggMarket();

        Thread henThread = new MyThread2(market, true);
        Thread ownerThread = new MyThread2(market, false);

        henThread.start();
        ownerThread.start();

	}

}
