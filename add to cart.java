static void addToCart() {

        displayProducts();

        System.out.print("\nEnter Product ID: ");
        int id = sc.nextInt();

        for (Product p : products) {

            if (p.id == id) {

                if (p.stock > 0) {

                    cart.add(p);
                    p.stock--;

                    System.out.println(
                        p.name + " added to cart!"
                    );

                } else {
                    System.out.println(
                        "Sorry! Product is out of stock."
                    );
                }

                return;
            }
        }

        System.out.println("Invalid Product ID!");
    }

    static void displayCart() {

        System.out.println(
            "\n========== YOUR CART =========="
        );

        if (cart.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }

        double total = 0;

        for (Product p : cart) {

            System.out.println(
                p.name + " - Rs." + p.price
            );

            total += p.price;
        }

        System.out.println("-------------------------------");
        System.out.println("Total Amount: Rs." + total);
    }