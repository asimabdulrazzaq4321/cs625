public class Ragged {
public static void main(String [] args) {
int riders[][] = new int [7][];
riders [0] = new int[10];
riders [0] = new int[10];
riders [0] = new int[10];
riders [0] = new int[10];
riders [0] = new int[2];
riders [0] = new int[2];
int i, j;
for(i=0; i<5; i++)
for(j=0; j<10; j++)
riders[i][j] = i + j + 10;
for(i=5; i<7; i++)
for(j=0; j<2; j++)
riders[i][j] = i + j + 10;
System.out.println("Riders per trip during the week:");
for(i=0; i< 5; i++) {
for(j=0; j<10; j++)
System.out.println(riders[i][j] + " ");
System.out.println();
}
System.out.println();

System.out.println("Riders per trip on the week:");
for(i=5; i<7; i++) {
for(j=0; j<2; j++)
System.out.print(riders[i][j] + " ");
System.out.println();
}
}
}
