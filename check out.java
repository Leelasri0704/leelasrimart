static void checkout() {

        if (cart.isEmpty()) {

            System.out.println(
                "Cart is empty. Add products first."
            );

            return;
        }

        double total = 0;

        for (Product p : cart) {
            total += p.price;
        }

        System.out.println(
            "\n========== CHECKOUT =========="
        );

        System.out.println(
            "Total Amount: Rs." + total
        );

        System.out.print(
            "Confirm order? (yes/no): "
        );

        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {

            System.out.println(
                "\nOrder placed successfully!"
            );

            System.out.println(
                "Thank you for shopping with SmartMart."
            );

            cart.clear();

        } else {

            System.out.println(
                "Order cancelled."
            );
        }
    }