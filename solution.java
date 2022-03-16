class Area {
    void rect(float length, float breadth){
        System.out.println("the area of the rectangle is "+length*breadth+" sq units");
    }
    void circle(float radius){
        double area = 3.14 *radius *radius;
        System.out.println("the area of the circle is "+area+" sq units");
    }void square(float length){
        System.out.println("the area of the square is "+Math.pow(length, 2)+" sq units");
    }
}

class solution{
    public static void main(String[] args) {
        //creating a object of
        Area ob = new Area();
        ob.circle(2);
        ob.rect(2,2 );
        ob.square(2);


    }
}