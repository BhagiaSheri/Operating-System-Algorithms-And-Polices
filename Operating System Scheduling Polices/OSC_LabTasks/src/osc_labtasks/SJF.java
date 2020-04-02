package osc_labtasks;
import java.util.*;
public class SJF{
 Scanner sc = new Scanner(System.in);
int PR,min;
float avg_ct, avg_tat, avg_wt, t_ct, t_tat, t_wt;
public void logic(){
System.out.println("****** SHORTEST JOB FIRST (SJF) ALGOTITHM ******"); 
System.out.println("=====================================================");
System.out.print("ENTER THE NUMBER OF PROCESS: ");
PR = sc.nextInt();
int ST[] = new int[PR];
int CT[] = new int[PR];
int TAT[] = new int[PR];
int WT[] = new int[PR];
System.out.println("=====================================================");
for(int i=0;i<PR;i++){
System.out.print("ENTER THE SERVICE TIME OF P"+(i+1)+" :");
ST[i] = sc.nextInt();}
System.out.println("=====================================================");
for(int i=0;i<ST.length;i++){
for(int j=i+1;j<ST.length;j++){
        if(ST[i]>ST[j]){
         min=ST[i];
         ST[i]=ST[j];
         ST[j]=min;
         }
      }
    }
for(int i=1;i<ST.length;i++){
CT[0]=ST[0];
CT[i] = ST[i]+CT[i-1];
TAT[i]=CT[i];
}
for(int i=0;i<ST.length;i++){
TAT[i]=CT[i];
}
for(int i=0;i<ST.length;i++){
WT[i]=TAT[i]-ST[i];
}
System.out.println("                    ***RESULTS***");
System.out.println("=====================================================");
System.out.println("CT TAT WT");
for(int i=0;i<ST.length;i++){
t_ct +=CT[i];
t_tat +=TAT[i];
t_wt +=WT[i];
System.out.println(CT[i]+"  "+TAT[i]+"  "+WT[i]);
}
avg_ct =t_ct/PR;
avg_tat =t_tat/PR;
avg_wt =t_wt/PR;
System.out.println("=====================================================");
System.out.println("Aveage Completion Time is: "+avg_ct+" seconds.");
System.out.println("Aveage Turn-Around Time is: "+avg_tat+" seconds.");
System.out.println("Aveage Waiting Time is: "+avg_wt+" seconds.");
System.out.println("=====================================================");
}
 public static void main(String[] args){
 SJF sjf = new SJF();
 sjf.logic();
 }
 }
