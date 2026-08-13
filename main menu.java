static void menu() {

        int choice;

        do {

            System.out.println(
                "\n========== SMARTMART =========="
            );

            System.out.println("1. View Products");
            System.out.println("2. Search Product");
            System.out.println("3. Add to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayProducts();
                    break;

                case 2:
                    searchProduct();
                    break;

                case 3:
                    addToCart();
                    break;

                case 4:
                    displayCart();
                    break;

                case 5:
                    checkout();
                    break;

                case 6:
                    System.out.println(
                        "Thank you for using SmartMart!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice!"
                    );
            }

        } while (choice != 6);
    }

    public static void main(String[] args) {

        addProducts();

        System.out.println(
            "================================="
        );

        System.out.println(
            "       WELCOME TO SMARTMART"
        );

        System.out.println(
            "================================="
        );

        menu();
    }
}