package osc_labtasks;
import java.io.*;
import java.util.*;
public class OSC_LabTasks {
Scanner sc = new Scanner(System.in);
int PA , LA, PS, FS;
public void takeInput(){
System.out.println("********PAGING TECHNIQUE OF MEMORY MANAGEMENT********"); 
System.out.println("=====================================================");
System.out.print("ENTER PHYSICAL ADDRESS SPACE (In Bytes): ");
PA = sc.nextInt();
System.out.println("=====================================================");
System.out.print("ENTER LOGICAL  ADDRESS SPACE (In Bytes): ");
LA = sc.nextInt();
System.out.println("=====================================================");
System.out.print("ENTER PAGE SIZE (In Bytes): ");
PS = sc.nextInt();
FS = PS;
System.out.println("=====================================================");
calculationOutput();
}
public  int countBits(int number)
    { 
       // log function in base 2 
        // take only integer part
 return (int)(Math.log(number) / Math.log(2));
    }
public void calculationOutput(){
System.out.println("**********************RESULTS************************");
System.out.println("Physical Address Bits: "+countBits(PA)+" Bits.");
System.out.println("Logical Address Bits: "+countBits(LA)+" Bits.");
System.out.println("Number Of Pages: "+LA/PS+" Pages.");
System.out.println("Number Of Frames: "+PA/FS+" Frames.");
System.out.println("Number Of Bits Of Page No: "+countBits(LA/PS)+" Bits.");
System.out.println("Number Of Bits Of Frame No: "+countBits(PA/FS)+" Bits.");
System.out.println("Number Of Bits Of Offset: "+(countBits(LA)-countBits(LA/PS))+" Bits.");
System.out.println("Number Of Entries In Page Table: "+LA/PS+".");
System.out.println("Number Of Bits In Each Page Entry: "+countBits(PA/FS)+" Bits.");
System.out.println("Size Of The Page Table: "+(LA/PS*countBits(PA/FS))+" Bits.");
System.out.println("*******************************************************");
}
public static void main(String[] args) {
OSC_LabTasks olt = new OSC_LabTasks ();
olt.takeInput();
}
}
