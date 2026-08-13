static void displayProducts() {

        System.out.println(
            "\n========== SMARTMART PRODUCTS =========="
        );

        for (Product p : products) {
            p.display();
        }
    }