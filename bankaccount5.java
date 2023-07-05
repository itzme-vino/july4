
    import java.util.Scanner;
    class bankaccount5 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            
            int currentbalance = s.nextInt();
            int Type = s.nextInt();
            int X = s.nextInt();
            
            
            if(Type==1)
            {   
                
                currentbalance = currentbalance+X;
                System.out.println(currentbalance);
                }
            else if(Type==2)
            {
                if(X>currentbalance)
                {
                    System.out.println("Insufficient Funds");

                }
                else
                {
                    currentbalance = currentbalance-X;
                    System.out.println(currentbalance);
                }
                
            }

          
        }

        }
