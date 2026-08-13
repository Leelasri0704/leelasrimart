static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<Product> cart = new ArrayList<>();

    static void addProducts() {

        products.add(new Product(
            1, "Java Programming", "Programming",
            450, 10
        ));

        products.add(new Product(
            2, "Python Basics", "Programming",
            400, 8
        ));

        products.add(new Product(
            3, "Data Science", "Technology",
            550, 6
        ));

        products.add(new Product(
            4, "Artificial Intelligence", "Technology",
            600, 5
        ));

        products.add(new Product(
            5, "Web Development", "Programming",
            500, 7
        ));
    }