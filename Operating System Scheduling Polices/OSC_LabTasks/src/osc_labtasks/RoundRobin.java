package osc_labtasks;
import java.util.*;
public class RoundRobin{
 Scanner sc = new Scanner(System.in);
int PR,tq,rp,time,i=0;
float avg_ct, avg_tat, avg_wt, t_ct, t_tat, t_wt;
public void logic(){
System.out.println("****** ROUND ROBIN ALGOTITHM ******"); 
System.out.println("==================================================================================");
System.out.print("ENTER THE NUMBER OF PROCESS: ");
PR = sc.nextInt();
int ST[] = new int[PR];
int RT[] = new int[PR];
int CT[] = new int[PR];
int TAT[] = new int[PR];
int WT[] = new int[PR];
System.out.println("==================================================================================");
System.out.print("ENTER THE TIME QUANTAM: ");
tq = sc.nextInt();
rp=PR;
System.out.println("==================================================================================");
for(int i=0;i<PR;i++){
System.out.print("ENTER THE SERVICE TIME OF P"+(i+1)+" :");
ST[i] = sc.nextInt();
RT[i] = ST[i]; 
WT[i]=0; 
}
System.out.println("==================================================================================");
System.out.println("GANNT'S CHART ARRANGEMENT: ");
System.out.println("==================================================================================");
System.out.print("0");
WT[0]=0; 
while(rp!=0) {
 if(RT[i]>tq)
 {
   RT[i]=RT[i]-tq;
   System.out.print(" | P["+(i+1)+"] | ");
   time+=tq;
   System.out.print(time);
   }
 else if(RT[i]<=tq && RT[i]>0)
 {
  time+=RT[i];
  RT[i]=RT[i]-RT[i];
  System.out.print(" | P["+(i+1)+"] | ");
  rp--;
  CT[i]=time;
  TAT[i]=CT[i];
  System.out.print(time);
 }
 i++;
if(i==PR)
{
i=0;
}
}
for(int i=0;i<ST.length;i++){
WT[i]=TAT[i]-ST[i];
}
System.out.println();
System.out.println("==================================================================================");
System.out.println("                              ***RESULTS***");
System.out.println("==================================================================================");
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
System.out.println("==================================================================================");
System.out.println("Aveage Completion Time is: "+avg_ct+" seconds.");
System.out.println("Aveage Turn-Around Time is: "+avg_tat+" seconds.");
System.out.println("Aveage Waiting Time is: "+avg_wt+" seconds.");
System.out.println("==================================================================================");
}
public static void main(String[] args){
RoundRobin rr= new RoundRobin();
rr.logic();
 }
 }
