class Factor {
boolean isFactor(int a, int b) {
if( (b % a)== 0) return true;
else return false;
}
}
class IsFact {
int myMath(int a, double b, float c) {
Factor x = new Factor ();
if(x.isFactor(2, 20)) System.out.println("2 is factor");
if(x.isFactor(3, 20)) System.out.println("this won't be displayed");
}
}