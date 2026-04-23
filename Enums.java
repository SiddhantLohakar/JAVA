public class Enums {
    public static void main(String args[]){
       Direction d = Direction.NORTH;
       System.out.println(d.getDegree());
       d.move();
       
    }
}

enum Direction {
        NORTH(0) {
            @Override
            void move(){
                System.out.println("Move up");
            }
        },
        SOUTH(30){
            @Override
            void move(){
                System.out.println("Move down");
            }     
        },
        EAST(60){
             @Override
            void move(){
                System.out.println("Move right");
            }
        },
        WEST(90){
             @Override
            void move(){
                System.out.println("Move left");
            }
        };

        int degree;

        Direction(int degree){
            this.degree = degree;
        }

        int getDegree(){
            return this.degree;
        }

        abstract void move();
}