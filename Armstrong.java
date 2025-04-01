public class Armstrong{
        public static void main(String args[])
             {
                   int n=153;
                   int rem;
                   int sum=0;
                   int copy=n;
                   while(n>0)
                   {
                           rem=n%10;
                           sum=sum+rem*rem*rem;
                           n=n/10;
                  }

               if(copy==sum)
               {
                   System.out.println("No. is Armstrong");
               }
               else
               {
                    System.out.println("No. is not Armstrong");
               }
            }
}