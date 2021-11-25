public class Main {

    public static void main(String[] args) {

        Motorcycle moto1 = new Motorcycle(150,"red","sportbike",new Motorcycle.Brand("Italy","Aprilia"));
        System.out.println(moto1.getColor());
        System.out.println(moto1.getHorsePower());
        System.out.println(moto1.getType());
        System.out.println(moto1.brand.getBrandName() + " from " + moto1.brand.getCountry());
        moto1.setHorsePower(200);
        moto1.setColor("blue");
        moto1.setType("supersportbike");
        moto1.brand.setBrandName("BMW");
        moto1.brand.setCountry("Germany");
        System.out.println("\n" + moto1.getColor());
        System.out.println(moto1.getHorsePower());
        System.out.println(moto1.getType());
        System.out.println(moto1.brand.getBrandName() + " from " + moto1.brand.getCountry());
        Motorcycle moto2 = new Motorcycle(100,"black","cruiser",new Motorcycle.Brand("Japan","Yamaha"));
        moto2.setColor("blue");




    }

}
