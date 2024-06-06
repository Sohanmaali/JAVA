public class Test 
{
    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public boolean isFlagSet() {
        return flag;
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();

        // Thread to continuously toggle the flag
        Thread toggleThread = new Thread(() -> {
            while (true) {
                example.toggleFlag();
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread to continuously check the flag
        Thread checkThread = new Thread(() -> {
            while (true) {
                boolean flag = example.isFlagSet();
                System.out.println("Flag is " + (flag ? "set" : "unset"));
                try {
                    Thread.sleep(500); // Sleep for 0.5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        toggleThread.start();
        chec
                                            
                              
                           
                                         
                                          
             
                
                                       
         
                                                                                             
                      