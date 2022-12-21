public class Rectangle
{

        private int height;
        private int width;

        public  Rectangle(int height, int width){
            // check whether the inputs are negative or not
            if (height > 0){
                this.height = height;
            } else {
                System.out.println("Error! Height must be a positive value.");
                this.height = 1;
            }

            if (width > 0){
                this.width = width;
            } else {
                System.out.println("Error! Width must be a positive value.");
                this.width = 1;
            }
        }

        public int getHeight() {
            return height;
        }
        public int getWidth() {
            return width;
        }

        //method to display rectangle by *
        public  void displayRec(){
            for (int i=1; i<=height; i++){
                for (int j=1; j<=width; j++){
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }

