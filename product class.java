static class Product {
        int id;
        String name;
        String category;
        double price;
        int stock;

        Product(int id, String name, String category,
                double price, int stock) {

            this.id = id;
            this.name = name;
            this.category = category;
            this.price = price;
            this.stock = stock;
        }

        void display() {
            System.out.println(
                id + " | " + name + " | " +
                category + " | Rs." + price +
                " | Stock: " + stock
            );
        }
    }