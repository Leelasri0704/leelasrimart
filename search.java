static void searchProduct() {

        sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Product p : products) {

            if (p.name.toLowerCase()
                    .contains(name.toLowerCase())) {

                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }