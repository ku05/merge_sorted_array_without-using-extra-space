import java.util.*;
class arrays_equal{
    public static boolean sort(int a[],int b[],int n){
        for(int j=0;j<4;j++){
            for(int i=j+1;i<5;i++){
                if(a[i]<a[j]){
                    int swap=a[j];
                    a[j]=a[i];
                    a[i]=swap;
                }
            }
        }
        for(int j=0;j<4;j++){
            for(int i=j+1;i<5;i++){
                if(b[i]<b[j]){
                    int swap=b[j];
                    b[j]=b[i];
                    b[i]=swap;
                }
            }
        }
        System.out.println("After sort the first array :");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("After sort the second array :");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    count++;
                }
            }
        }
        if(count==n){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        System.out.println("Enter the first array :");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the second array :");
        for(int i=0;i<5;i++){
            b[i]=sc.nextInt();
        }
        int n=a.length;
        System.out.println(sort(a, b, n));
    }
}