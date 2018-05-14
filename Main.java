import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Articulos art1 = new Articulos("23A015", "Milk", 10, "23/03/19");
        Articulos art2 = new Articulos("24A014", "Jam", 15, "24/02/19");
        Articulos art3 = new Articulos("25A013", "Yogurt", 11, "23/02/19");
        Articulos art4 = new Articulos("26A011", "Cream", 15, "24/02/19");
        Articulos art5 = new Articulos("27A010", "Ice-cream", 19, "30/04/19");

        Articulos c1 = new Articulos(5);
        Articulos c2= new Articulos(10);
        Articulos c3= new Articulos(8);
        Articulos c4= new Articulos(20);
        Articulos c5= new Articulos(20);

        Elemento<Articulos> first = new Elemento<>(art1);
        Elemento<Articulos> second = new Elemento<>(art2);
        Elemento<Articulos> third = new Elemento<>(art3);
        Elemento<Articulos> fourth = new Elemento<>(art4);
        Elemento<Articulos> fifth = new Elemento<>(art5);

        Lista<Articulos> ListaA = new Lista<>(first);
        ListaA.insertar(second);
        ListaA.insertar(third);
        ListaA.insertar(fourth);
        ListaA.insertar(fifth);


        Ticket<Articulos> ListaTA=new Ticket<>();


        System.out.println("Just 4 elements");
        System.out.println(ListaA.eleminar());


        for (int num = 0; num <= 9; num++) {

            System.out.println("\n Looking for a product?" + "\n Type it here: ");
            Scanner teclado = new Scanner(System.in);
            String key = teclado.nextLine();
            int variable, var,TOTAL;

            if (ListaA.recorrer().contains(key)) {
                if (key.equals(art1.getKeyproduct())) {
                    System.out.print("The product you are lookig for is: " + art1.toString() + " \n");
                    num++;
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                    var=art1.getPrice();
                    if(variable<c1.getCan()){
                        int total1 = var * variable;
                        System.out.print("Monto $" + total1); }
                    else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }






                } else if (key.equals((art2.getKeyproduct()))) {
                    System.out.print("The product you are lookig for is: " + art2.toString() + " \n");
                    num++; variable= art2.getPrice();
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                   var=art2.getPrice();

                    if(variable<c2.getCan()){
                        int total2 = var * variable;
                        System.out.print("Monto $" + total2); }
                    else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }


                } else if (key.equals((art3.getKeyproduct()))) {
                    System.out.print("The product you are lookig for is: " + art3.toString() + " \n");
                    num++; variable= art3.getPrice();
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                    var=art3.getPrice();
                    if(variable<c3.getCan()){
                        int total3 = var * variable;
                        System.out.print("Monto $" + total3); }
                    else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }

                } else if (key.equals((art4.getKeyproduct()))) {
                    System.out.print("The product you are lookig for is: " + art4.toString() + " \n");
                    num++; variable=art4.getPrice();
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                    var=art4.getPrice();
                    if(variable<c4.getCan()){
                        int total4 = var * variable;
                        System.out.print("Monto $" + total4); }
                    else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }
                } else if ((key.equals((art5.getKeyproduct())))) {
                    System.out.print("The product you are lookig for is: " + art5.toString() + " \n");
                    num++; variable=art5.getPrice();
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                    var=art5.getPrice();
                    if(variable<c5.getCan()){
                        int total5 = var * variable;
                        System.out.print("Monto $" + total5); }
                    else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }


                } }else
                System.out.print("NOT FOUNDED \n");
        }

    }
}