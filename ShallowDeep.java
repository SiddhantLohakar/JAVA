public class ShallowDeep {
    public static void main(String[] args) {
            Numbers n1 = new Numbers(10, 13);
            Numbers n2 = new Numbers(n1); // Deep Copy
            Numbers n3 = n1; // Shallow copy


            System.out.println("Before changing: ");
            System.out.println("n1 = " + n1.x + " " +  n1.y);
            System.out.println("n2 = " + n2.x + " " +  n2.y);
            System.out.println("n3 = " + n3.x + " " +  n3.y);

            // Changes in n2 doesn't affect changes in n1
            n2.x = 15;
            n2.y = 20;

            System.out.println("After changing n2: ");
            System.out.println("n1 = " + n1.x + " " +  n1.y);
            System.out.println("n2 = " + n2.x + " " +  n2.y);
            System.out.println("n3 = " + n3.x + " " +  n3.y);

            //  Changes in n3 results in changes in n1
            n3.x = 8;
            n3.y = 9;


            System.out.println("After changing n3: ");
            System.out.println("n1 = " + n1.x + " " +  n1.y);
            System.out.println("n2 = " + n2.x + " " +  n2.y);
            System.out.println("n3 = " + n3.x + " " +  n3.y);



    }   
}

class Numbers{
    int x;
    int y;

    Numbers(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    Numbers(Numbers n)
    {
        this.x = n.x;
        this.y = n.y;
    }
}