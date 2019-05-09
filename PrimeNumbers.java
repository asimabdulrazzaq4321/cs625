public class PrimeNumbers {
public static void main (String [] args) {
int i;
int num;
String primeNumbers = "";
for(i=0; 1<=100; i++) {
int counter=0;
for(num=0; num>=1; num--) {
if(i%num==0) {
counter = counter + 1;
}
}
if(counter ==2) {
primeNumbers = primeNumbers + i + " ";
}
}
System.out.println("Prime numbers from 1 to 100 are :");
System.out.println("primeNumbers");
}
}
