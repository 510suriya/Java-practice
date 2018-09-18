
public class HelloWorld{

     public static void main(String []args){
        int n=5,i=0,j=0,m=2;
        for(i=1;i<=5;i++){
            for(int sp=n-i;sp>0;sp--){
                System.out.print(" ");}
        if(i==1){System.out.println("*");}
        else{
            for( j=1;j<m+i;j++){
                System.out.print("*");}m++;
            System.out.println();
        }
        }
     }
}
