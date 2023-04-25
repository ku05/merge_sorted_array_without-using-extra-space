import java.util.*;
class merge_array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first array ");
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the second array ");
        int b[]=new int[3];
        for(int j=0;j<3;j++){
            b[j]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(a[i]>b[0]){
                int swap=a[i];
                a[i]=b[0];
                b[0]=swap;
            }
            for(int j=0;j<2;j++){
                if(b[j]>b[j+1]){
                int swap=b[j];
                    b[j]=b[j+1];
                    b[j+1]=swap;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(" "+a[i]);
        }
        for(int j=0;j<3;j++){
            System.out.print(" "+b[j]);
        }
        
    }
}