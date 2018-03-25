
package lab_3;

public class Lab_3 {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int Arr[]=new int[10];
        for (int i=0, j=2; i<10; i++, j+=2) if((j%2)==0) Arr[i]=j;
        for (int i=0; i<10; i++) System.out.print(Arr[i]+" ");
        System.out.println();
        for (int i=1; i<10; i++) System.out.println(Arr[i]);
        System.out.println();
        System.out.println();
        
        System.out.println("Задание 2");
        Arr=new int[50];
        for (int i=1; i<100; i++) if((i%2)!=0) Arr[(i-1)/2]=i;
        for (int i=0; i<50; i++) System.out.print(Arr[i]+" ");
        System.out.println();
        for (int i=49; i>-1; i--) System.out.print(Arr[i]+" ");
        System.out.println();
        System.out.println();
        
        System.out.println("Задание 3");
        Arr=new int[15];
        for (int i=0; i<15; i++) Arr[i]=(int)(Math.random()*15);
        for (int i=0; i<15; i++) System.out.print(Arr[i]+" ");
        int j=0;
        for (int i=0; i<15; i++) if((Arr[i]%2)==0) j++;
        System.out.println();
        System.out.println(j);
        System.out.println();
        System.out.println();
        
        System.out.println("Задание 4");
        int Arrr[][]=new int[8][5];
        for (int i=0; i<8; i++) {
            for (j=0; j<5; j++) Arrr[i][j]=(int)(Math.random()*89+10);
        }
        for (int i=0; i<8; i++) {
            for (j=0; j<5; j++) System.out.print("["+Arrr[i][j]+"]"+" ");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Задание 5");
        Arrr=new int[7][4];
        for (int i=0; i<7; i++) {
            for (j=0; j<4; j++) Arrr[i][j]=(int)(Math.random()*11-5);
        }
        for (int i=0; i<7; i++) {
            for (j=0; j<4; j++) System.out.print("["+Arrr[i][j]+"]"+" ");
            System.out.println();
        }
        System.out.println();
        int sum1=0, sum2=0, index=1;
        for (int i=0; i<7; i++) {
            for (j=0; j<4; j++) sum1+=Arrr[i][j];
            if(Math.abs(sum1)>Math.abs(sum2)){
            index=i;
            sum2=sum1;
            }
            sum1=0;
        }
        System.out.println(index);
    }
    
}
